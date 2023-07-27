package org.verizon.ConsumerService.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.verizon.ConsumerService.repo.OrderingApiRepo;

@Service
public class OrderingApiService {
	private final OrderingApiRepo Catalogrepo;
	@Autowired
	public OrderingApiService(OrderingApiRepo OrderingApiRepo) {
		this.OrderingApirepo = OrderingApiRepo;
		
	}
	  
	public List<Catalogmodel> getAllCatalogmodel()
	{
		return Catalogrepo.findAll();
	}

	public Catalogmodel createcatalogmodel(Catalogmodel catmod) {
		return Catalogrepo.save(catmod);
	}
}
