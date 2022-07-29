package com.example.spring_security_jwt.repositories;


import com.example.spring_security_jwt.models.ERole;
import com.example.spring_security_jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
