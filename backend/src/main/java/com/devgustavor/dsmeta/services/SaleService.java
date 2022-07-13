package com.devgustavor.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devgustavor.dsmeta.entities.Sale;
import com.devgustavor.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository reposity;
	
	public List<Sale> findSales() {
		return reposity.findAll();
	}
}
