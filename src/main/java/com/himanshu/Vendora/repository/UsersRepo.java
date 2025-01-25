package com.himanshu.Vendora.repository;

import com.himanshu.Vendora.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Long> {
    Optional<Users> getByUserName(String username);
}
