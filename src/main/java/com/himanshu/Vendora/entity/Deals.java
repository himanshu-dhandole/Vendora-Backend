package com.himanshu.Vendora.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Deals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private Double discount ;

    @OneToOne
    private HomeCategory homeCategory ;
}
