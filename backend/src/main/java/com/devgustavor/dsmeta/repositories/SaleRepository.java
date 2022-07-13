package com.devgustavor.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavor.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
