package com.logonedigital.gestion_stock_app_backend.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products_stocks")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productCategoryId")
public class ProductsStock  implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productsStockId;
    private Double quantity;
    private String description;
    @Temporal(TemporalType.DATE)
    private Instant createdAt;
    @Temporal(TemporalType.DATE)
    private Instant updatedAt;
    private Boolean status;
    @OneToOne
    private Product product;
}
