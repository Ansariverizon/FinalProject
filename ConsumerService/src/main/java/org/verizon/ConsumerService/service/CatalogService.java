package org.verizon.ConsumerService.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerService.Model.Catalogmodel;
import org.verizon.ConsumerService.repo.CatalogRepo;

@Service
public class CatalogService {
	private final CatalogRepo Catalogrepo;
	@Autowired
	public CatalogService(CatalogRepo CatalogRepo) {
		this.Catalogrepo = CatalogRepo;
		
	}
	  
	public List<Catalogmodel> getAllCatalogmodel()
	{
		return Catalogrepo.findAll();
	}

	public Catalogmodel createcatalogmodel(Catalogmodel catmod) {
		return Catalogrepo.save(catmod);
	}
}