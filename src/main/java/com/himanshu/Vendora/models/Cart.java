package com.himanshu.Vendora.models;

import jakarta.persistence.*;
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
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "cart" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<CartItems> cartItems = new ArrayList<>();


    private BigDecimal totalAmount;
    private int totalItems;
    private BigDecimal sellingPrice ;
    private BigDecimal mrpPrice ;
    private Double discount ;
    private String couponCode ;

}
