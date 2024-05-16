package jwtSecurity.example.jwtDemo.Repository;

import jwtSecurity.example.jwtDemo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);
}
