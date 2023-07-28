package org.verizon.ConsumerService.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerService.Model.Customermodel;
import org.verizon.ConsumerService.service.CustomerService;







@RestController
@RequestMapping("/api/Customermodel")
public class CustomerController {
	
	private CustomerService customerservice;
 
	@Autowired
	public CustomerController(CustomerService customerservice) {
		
		this.customerservice = customerservice;
	}
	
	@RequestMapping("/allcustomer")
	public List<Customermodel> getAllCustomermodel(){
		return customerservice.getAllCustomerServicemodel();
		
	}
	@PostMapping("/insert")
	public Customermodel createcustomermodel(@RequestBody Customermodel customermod)
	{
		return customerservice.createcustomermodel(customermod);
}
}
