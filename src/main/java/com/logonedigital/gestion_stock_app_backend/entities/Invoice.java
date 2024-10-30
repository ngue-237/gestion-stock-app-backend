package com.logonedigital.gestion_stock_app_backend.entities;


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
@Table(name = "invoices")
public class Invoice implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String reference;
    @Temporal(TemporalType.TIME)
    private Instant createdAt;
    @Temporal(TemporalType.TIME)
    private Instant updatedAt;
    private Boolean status;

    @OneToOne
    private Order order;

}
