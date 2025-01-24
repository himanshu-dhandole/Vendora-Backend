package com.himanshu.Vendora.entity;
import com.himanshu.Vendora.Enums.PaymentMethod;
import com.himanshu.Vendora.Enums.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PaymentOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;
    private PaymentOrderStatus status = PaymentOrderStatus.PENDING ;
    private PaymentMethod paymentMethod;
    private String paymentLinkId;

    @ManyToOne
    private Users users;

    @OneToMany
    private List<Order> order = new ArrayList<>();
}
