package org.verizon.ConsumerService.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.verizon.ConsumerService.Model.OrderingApimodel;

import org.verizon.ConsumerService.repo.OrderingApiRepo;

@Service
public class OrderingApiService {
	private final OrderingApiRepo orderingApirepo;
	@Autowired
	public OrderingApiService(OrderingApiRepo orderingApiRepo) {
		this.orderingApirepo = orderingApiRepo;
		
	}
	  
	public List<OrderingApimodel> getAllOrderingaApimodel()
	{
		return orderingApirepo.findAll();
	}

	public OrderingApimodel createorderingapimodel(OrderingApimodel orderingapimod) {
		return orderingApirepo.save(orderingapimod);
	}
}