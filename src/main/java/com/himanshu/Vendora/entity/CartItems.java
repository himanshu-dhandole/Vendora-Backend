package com.himanshu.Vendora.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @ManyToOne
    @JsonIgnore
    private Cart cart ;

    @ManyToOne
    @JsonIgnore
    private Product product ;

    private int quantity=1 ;
    private BigDecimal sellingPrice ;
    private BigDecimal mrpPrice ;
    private String size ;
    private Long userId ;

}
