package com.himanshu.Vendora.entity;

import com.himanshu.Vendora.Enums.AccountStatus;
import com.himanshu.Vendora.Enums.Roles;
import com.himanshu.Vendora.dto.BankDetails;
import com.himanshu.Vendora.dto.BusinessDetails;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String orderId;
    @ManyToOne
    private User user ;
    private Long sellerId ;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToOne
    private Address shippingAdderss ;

    @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails() ;

    private BigDecimal totalSellingPrice;
    private BigDecimal mrpPrice;

}
