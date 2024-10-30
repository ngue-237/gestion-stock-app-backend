package com.logonedigital.gestion_stock_app_backend.repository;

import com.logonedigital.gestion_stock_app_backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
