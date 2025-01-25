package com.himanshu.Vendora.controllers;

import com.himanshu.Vendora.dto.UsersDTO;
import com.himanshu.Vendora.entity.Users;
import com.himanshu.Vendora.service.Impl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private  AuthService authService;



    @PostMapping("/signup")
    public ResponseEntity<Users> signup(@RequestBody UsersDTO usersDTO){
        Users user = authService.signup(usersDTO);
        return ResponseEntity.ok(user);
    }
}
