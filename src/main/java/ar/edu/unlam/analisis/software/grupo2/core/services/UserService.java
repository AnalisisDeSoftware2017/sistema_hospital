package ar.edu.unlam.analisis.software.grupo2.core.services;

import ar.edu.unlam.analisis.software.grupo2.core.dao.UserDao;
import ar.edu.unlam.analisis.software.grupo2.core.exception.UserNotFindException;
import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sbogado on 16/05/17.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User loginUser(User user) throws UserNotFindException {
        Optional<User> optUser = userDao.findUserByUsername(user.getUsername());
        if(!optUser.isPresent()){
            throw new UserNotFindException();
        }

        //TODO: match password
        return optUser.get();
    }

    public User createUser(User user){
        return userDao.save(user);
    }

}
