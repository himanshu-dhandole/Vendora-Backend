package com.himanshu.Vendora.service.Impl;

import com.himanshu.Vendora.dto.UsersDTO;
import com.himanshu.Vendora.entity.Users;
import com.himanshu.Vendora.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsersRepo usersRepo;


    public Users signup(UsersDTO usersDTO) {
        Users user = new Users();
        user.setUserName(usersDTO.getName());
        user.setEmail(usersDTO.getEmail());
        return usersRepo.save(user);
    }
}
