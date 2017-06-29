package ar.edu.unlam.analisis.software.grupo2.core.services.impl;

import ar.edu.unlam.analisis.software.grupo2.core.dao.UserDao;
import ar.edu.unlam.analisis.software.grupo2.core.exception.FailedLoginException;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by sbogado on 16/05/17.
 */
@Service
public class UserService extends AbstractServiceCRUD<User, Long> {
    private static final Integer CANTIDAD_DE_LOGINS_FAILS_TO_BLOCK = new Integer(3);
    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User loginUser(User user) throws FailedLoginException {
        Optional<User> optUser = userDao.findUserByUsername(user.getUsername());
        if(!optUser.isPresent()){
            throw new FailedLoginException();
        }
        if(!compruebaPassword(user.getPassword(), optUser.get())){
            optUser.get().setFailedLogin(optUser.get().getFailedLogin()+1);
            if(CANTIDAD_DE_LOGINS_FAILS_TO_BLOCK.equals(optUser.get().getFailedLogin().intValue())){
                optUser.get().setLocked(true);
            }
            userDao.save(optUser.get());
            throw new FailedLoginException();
        }else{
            optUser.get().setFailedLogin(0);
            optUser.get().setLastLogin(new Date());
            userDao.save(optUser.get());
        }
        return optUser.get();
    }

    private boolean compruebaPassword(String password, User user) {
        return passwordEncoder.matches(password,user.getPassword());
    }

    public User createUser(User user){
        user.setFailedLogin(0);
        user.setLocked(false);
        user.setPassword(encodePassword(user.getPassword()));
        return userDao.save(user);
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User entity) {
        return createUser(entity);
    }

    @Override
    public void delete(User entity) {
        userDao.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        userDao.delete(id);
    }

}
