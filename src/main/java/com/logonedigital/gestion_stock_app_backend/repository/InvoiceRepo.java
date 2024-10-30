package com.logonedigital.gestion_stock_app_backend.repository;

import com.logonedigital.gestion_stock_app_backend.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
}
