package com.himanshu.Vendora.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VerificationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String otp ;
    private String email ;

    @OneToOne
    private User user ;

    @OneToOne
    private Seller seller ;
}
