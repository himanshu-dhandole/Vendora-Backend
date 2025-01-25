package com.himanshu.Vendora.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
public class UsersDTO {
    private String name;
    private String email;
    @JsonIgnore
    private String password;
}
