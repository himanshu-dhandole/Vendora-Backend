package com.himanshu.Vendora.repository;

import com.himanshu.Vendora.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
