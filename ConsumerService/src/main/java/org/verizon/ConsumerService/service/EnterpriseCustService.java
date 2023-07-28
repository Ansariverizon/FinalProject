package org.verizon.ConsumerService.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerService.Model.EnterpriseCustmodel;
import org.verizon.ConsumerService.repo.EnterpriseCustRepo;







@Service
public class EnterpriseCustService {
	private final  EnterpriseCustRepo  enterprisecustrepo;
	@Autowired
	public EnterpriseCustService( EnterpriseCustRepo  enterprisecustRepo) {
		this. enterprisecustrepo =  enterprisecustRepo;
		
	}
	  
	public List< EnterpriseCustmodel> getAllEnterpriseCustServicemodel()
	{
		return  enterprisecustrepo.findAll();
	}

	public EnterpriseCustmodel createenterprisecustmodel( EnterpriseCustmodel  enterprisecustmod) {
		return enterprisecustrepo.save(enterprisecustmod);
	}}
