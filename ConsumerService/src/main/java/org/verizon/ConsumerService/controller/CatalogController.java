package org.verizon.ConsumerService.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerService.Model.Catalogmodel;
import org.verizon.ConsumerService.service.CatalogService;



@RestController
@RequestMapping("/api/catalogmodel")
public class CatalogController {
	
	private CatalogService catalogservice;
 
	@Autowired
	public CatalogController(CatalogService catalogservice) {
		
		this.catalogservice = catalogservice;
	}
	
	@RequestMapping("/allcust")
	public List<Catalogmodel> getAllCatalogmodel(){
		return catalogservice.getAllCatalogmodel();
		
	}
	@PostMapping("/insert")
	public Catalogmodel createCatalogmodel(@RequestBody Catalogmodel catmod)
	{
		return catalogservice.createcatalogmodel(catmod);
}
}