package com.himanshu.Vendora.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.himanshu.Vendora.Enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String userName;
    private String email;
    private String phone;

    //role
    private Roles role = Roles.CUSTOMER;

    @OneToMany
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany
    @JsonIgnore
    private List<Coupon> usedCoupons = new ArrayList<>();

}
