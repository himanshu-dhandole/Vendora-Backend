package com.himanshu.Vendora.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @ManyToOne
    @JsonIgnore
    private Cart cart ;

    private Product product ;
    private int quantity=1 ;
    private BigDecimal sellingPrice ;
    private BigDecimal mrpPrice ;
    private String size ;
    private Long userId ;

}
