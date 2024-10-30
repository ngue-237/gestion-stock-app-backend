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
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products_categories")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productCategoryId")
public class ProductsCategory implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productCategoryId;
    @Column(name = "product_category_name")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String slug;
    @Temporal(TemporalType.DATE)
    private Instant createdAt;
    @Temporal(TemporalType.DATE)
    private Instant updatedAt;
    private Boolean status;
    @OneToMany(mappedBy = "category", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Product> products;
}
