package com.himanshu.Vendora.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private Double discount ;
    private LocalDate startDate;
    private LocalDate expiryDate;
    private Double minOrderAmount;
    private Boolean active;
    @ManyToMany(mappedBy = "usedCoupons")
    private List<Users> usedByUsers = new ArrayList<>();
}
