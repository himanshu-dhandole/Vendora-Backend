package com.himanshu.Vendora.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VerificationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String otp ;
    private String email ;

    @OneToOne
    private Users users;

    @OneToOne
    private Seller seller ;
}
