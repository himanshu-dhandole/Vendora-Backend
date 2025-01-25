package com.himanshu.Vendora.service.Impl;

import com.himanshu.Vendora.entity.Users;
import com.himanshu.Vendora.repository.UsersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
@RequiredArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {


    private final UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepo.getByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("username not found"));
        return null;
    }
}
