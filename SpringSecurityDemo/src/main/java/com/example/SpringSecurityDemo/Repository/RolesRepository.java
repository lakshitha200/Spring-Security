package com.example.SpringSecurityDemo.Repository;

import com.example.SpringSecurityDemo.Entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolesRepository extends JpaRepository<Roles,Long> {

}
