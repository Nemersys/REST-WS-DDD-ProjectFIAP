package com.fiap.projetoFIAP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.projetoFIAP.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

 }
