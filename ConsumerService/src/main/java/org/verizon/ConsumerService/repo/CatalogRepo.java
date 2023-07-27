package org.verizon.ConsumerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.ConsumerService.Model.Catalogmodel;

@Repository
public interface CatalogRepo extends JpaRepository<Catalogmodel,Integer>{
	
	

	
	}



