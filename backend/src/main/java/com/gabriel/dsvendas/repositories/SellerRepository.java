package com.gabriel.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
