package com.himanshu.Vendora.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@EqualsAndHashCode
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonIgnore
    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    private int quantity;
    private BigDecimal sellingPrice;
    private BigDecimal mrpPrice;
    private String size ;
    private Long userId ;
}
