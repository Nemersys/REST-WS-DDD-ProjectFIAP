package com.fiap.projetoFIAP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.projetoFIAP.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
 }
