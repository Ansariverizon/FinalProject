package org.verizon.ConsumerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.verizon.ConsumerService.Model.Servicemodel;

@Repository
public interface ServiceRepo extends JpaRepository<Servicemodel,Integer>{
	
}
	
	
