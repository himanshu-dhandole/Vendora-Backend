package com.himanshu.Vendora.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User custumer;

    @OneToOne
    private Order order ;

    @ManyToOne
    private Seller seller ;

    private LocalDateTime createdAt = LocalDateTime.now();
}
