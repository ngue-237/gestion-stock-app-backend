package com.logonedigital.gestion_stock_app_backend.repository;

import com.logonedigital.gestion_stock_app_backend.entities.ProductsStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsStockRepo extends JpaRepository<ProductsStock,Integer> {
}
