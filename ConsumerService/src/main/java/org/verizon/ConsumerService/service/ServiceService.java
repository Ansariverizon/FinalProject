package org.verizon.ConsumerService.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerService.Model.Servicemodel;
import org.verizon.ConsumerService.repo.ServiceRepo;










@Service
public class ServiceService {
	private final  ServiceRepo servicerepo;
	@Autowired
	public ServiceService( ServiceRepo  serviceRepo) {
		this. servicerepo =  serviceRepo;
		
	}
	  
	public List< Servicemodel> getAllServiceServicemodel()
	{
		return servicerepo.findAll();
	}

	public  Servicemodel createservicemodel( Servicemodel  servicemod) {
		return  servicerepo.save(servicemod);
	}}
