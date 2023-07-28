package org.verizon.ConsumerService.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerService.Model.Customermodel;
import org.verizon.ConsumerService.repo.CustomerRepo;







@Service
public class CustomerService {
	private final  CustomerRepo  customerrepo;
	@Autowired
	public CustomerService( CustomerRepo  customerRepo) {
		this. customerrepo =  customerRepo;
		
	}
	  
	public List< Customermodel> getAllCustomerServicemodel()
	{
		return  customerrepo.findAll();
	}

	public  Customermodel createcustomermodel( Customermodel  customermod) {
		return  customerrepo.save(customermod);
	}}
