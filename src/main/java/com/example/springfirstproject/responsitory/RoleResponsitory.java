package com.example.springfirstproject.responsitory;

import com.example.springfirstproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleResponsitory extends JpaRepository<Role,Integer> {
}
