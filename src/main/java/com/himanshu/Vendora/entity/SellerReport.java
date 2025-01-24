package com.himanshu.Vendora.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SellerReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Seller seller;

    private Long totalSales ;
    private Long totalEarnings ;
    private Long totalRefunds ;
    private Long totalExpenses ;
    private Long totalTax;
    private Long netEarnings ;
    private Long totalOrders ;
    private Long totalTransactions ;
    private Long cancelledOrders ;
}
