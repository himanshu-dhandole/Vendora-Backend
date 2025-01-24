package com.himanshu.Vendora.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String reviewText ;

    @ElementCollection
    private List<String> images = new ArrayList<>();

    @Column(nullable = false)
    private double rating ;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now()  ;

    @NotNull
    @ManyToOne
    private User user ;

    @ManyToOne
    @NotNull
    @JsonIgnore
    private Product product ;
}
