package org.verizon.ConsumerService.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerService.Model.EnterpriseCustmodel;
import org.verizon.ConsumerService.service.EnterpriseCustService;






@RestController
@RequestMapping("/api/EnterpriseCustmodel")
public class EnterpriseCustController {
	
	private EnterpriseCustService enterprisecustservice;
 
	@Autowired
	public EnterpriseCustController(EnterpriseCustService enterprisecustservice) {
		
		this.enterprisecustservice = enterprisecustservice;
	}
	
	@RequestMapping("/allenterprisecust")
	public List<EnterpriseCustmodel> getAllEnterpriseCustmodel(){
		return enterprisecustservice.getAllEnterpriseCustServicemodel();
		
	}
	@PostMapping("/insert")
	public EnterpriseCustmodel createnteerprisecustmodel(@RequestBody EnterpriseCustmodel enterprisecustmod)
	{
		return enterprisecustservice.createenterprisecustmodel(enterprisecustmod);
}
}
