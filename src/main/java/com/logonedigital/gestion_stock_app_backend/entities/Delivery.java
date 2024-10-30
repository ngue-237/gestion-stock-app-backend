package com.logonedigital.gestion_stock_app_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "deliveries")
public class Delivery {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deliveryId;
    private String reference;
    @Temporal(TemporalType.TIME)
    private Instant createdAt;
    @Temporal(TemporalType.TIME)
    private Instant deliverAt;
    @Temporal(TemporalType.TIME)
    private Instant updatedAt;
    private Boolean status;
}
