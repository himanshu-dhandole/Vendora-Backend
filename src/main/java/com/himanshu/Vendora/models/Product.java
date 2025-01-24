package com.himanshu.Vendora.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ManyToOne
    private Category category;

    @ManyToOne
    private Seller seller ;

    @ElementCollection
    private List<String> images = new ArrayList<>();

    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Review> review = new ArrayList<>() ;

    private double rating ;
    private LocalDateTime createdAt ;
    private long id;
    private String title;
    private String description;
    private BigDecimal sellingprice;
    private BigDecimal mrpPrice;
    private Double discount;
    private int quantity;
    private String color;
    private String size;
}
