package com.himanshu.Vendora.entity;

import com.himanshu.Vendora.Enums.AccountStatus;
import com.himanshu.Vendora.Enums.OrderStatus;
import com.himanshu.Vendora.Enums.PaymentStatus;
import com.himanshu.Vendora.Enums.Roles;
import com.himanshu.Vendora.dto.BankDetails;
import com.himanshu.Vendora.dto.BusinessDetails;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String orderId;
    @ManyToOne
    private Users user ;
    private Long sellerId ;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToOne
    private Address shippingAdderss ;

    @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails() ;

    private BigDecimal totalSellingPrice;
    private BigDecimal mrpPrice;
    private double discount ;
    private int quantity ;
    private OrderStatus orderStatus  ;
    private PaymentStatus paymentStatus  ;

    private LocalDateTime orderdate = LocalDateTime.now();
    private LocalDateTime deleveryDate = orderdate.plusDays(7);
}