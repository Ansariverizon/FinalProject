
package org.verizon.ConsumerService.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerService.Model.Servicemodel;
import org.verizon.ConsumerService.service.ServiceService;






@RestController
@RequestMapping("/api/ServiceCustmodel")
public class ServiceController {
	
	private ServiceService Serviceservice;
 
	@Autowired
	public ServiceController(ServiceService Serviceservice) {
		
		this.Serviceservice = Serviceservice;
	}
	
	@RequestMapping("/allService")
	public List<Servicemodel> getAllServicemodel(){
		return Serviceservice.getAllServiceServicemodel();
		
	}
	@PostMapping("/insert")
	public Servicemodel createservicemodel(@RequestBody Servicemodel servicecustmod)
	{
		return Serviceservice.createservicemodel(servicecustmod);
}
}

