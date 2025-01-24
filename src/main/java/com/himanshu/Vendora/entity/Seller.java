package com.himanshu.Vendora.entity;

import com.himanshu.Vendora.Enums.AccountStatus;
import com.himanshu.Vendora.Enums.Roles;
import com.himanshu.Vendora.dto.BankDetails;
import com.himanshu.Vendora.dto.BusinessDetails;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sellerName;
    @NotNull
    @Column(unique = true)
    private String email;
    private String password;
    private String phone;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress = new Address();

    private Roles roles = Roles.SELLER;
    private boolean isEmailVerified = false;
    private String gstinNumber ;

    private AccountStatus status = AccountStatus.PENDING_VERIFICATION;
}
