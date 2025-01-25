package com.himanshu.Vendora.repository;

import com.himanshu.Vendora.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Long> {
    Optional<Users> getByUsername(String username);
}
