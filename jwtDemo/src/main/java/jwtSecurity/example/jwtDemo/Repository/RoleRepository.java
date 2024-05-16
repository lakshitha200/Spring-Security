package jwtSecurity.example.jwtDemo.Repository;

import jwtSecurity.example.jwtDemo.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
