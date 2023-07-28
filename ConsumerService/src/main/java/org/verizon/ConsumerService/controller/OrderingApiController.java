package org.verizon.ConsumerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerService.Model.OrderingApimodel;
import org.verizon.ConsumerService.service.OrderingApiService;




@RestController
@RequestMapping("/api/orderingapimodel")
public class OrderingApiController {
	
	private OrderingApiService orderingapiservice;
 
	@Autowired
	public OrderingApiController(OrderingApiService orderingapiservice) {
		
		this.orderingapiservice = orderingapiservice;
	}
	
	@RequestMapping("/allorder")
	public List<OrderingApimodel> getAllOrderingApimodel(){
		return orderingapiservice.getAllOrderingaApimodel();
		
	}
	@PostMapping("/insert")
	public OrderingApimodel createorderingapimodel(@RequestBody OrderingApimodel orderingapimod)
	{
		return orderingapiservice.createorderingapimodel(orderingapimod);
}
}
