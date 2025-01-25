package com.himanshu.Vendora.service.Impl;

import com.himanshu.Vendora.dto.UsersDTO;
import com.himanshu.Vendora.entity.Users;
import com.himanshu.Vendora.repository.UsersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder ;

    private final UsersRepo usersRepo;

    private final AuthenticationManager authManager;

    public Users signup(UsersDTO usersDTO) {
        Users user = new Users();
        user.setUserName(usersDTO.getName());
        user.setEmail(usersDTO.getEmail());
        user.setPassword(passwordEncoder.encode(usersDTO.getPassword()));
        return usersRepo.save(user);
    }

    public String verifyLogin(UsersDTO usersDTO) {
        try{
            Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(usersDTO.getName(),usersDTO.getPassword()));
            if (authentication.isAuthenticated()){
                return "user authenticated" ;
            }
        } catch (Exception e) {
            return "user not authenticated" ;
        }
    return "Auth failed..." ;

    }
}
