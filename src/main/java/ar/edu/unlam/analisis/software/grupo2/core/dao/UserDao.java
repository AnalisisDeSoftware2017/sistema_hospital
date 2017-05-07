package ar.edu.unlam.analisis.software.grupo2.core.dao;

import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by sbogado on 07/05/17.
 */
@Repository
public interface UserDao extends JpaRepository <User, Long>{
    Optional<User> findUserById(Long id);
    Optional<User> findUserByUsername(String username);

}
