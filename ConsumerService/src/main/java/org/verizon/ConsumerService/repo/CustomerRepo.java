package org.verizon.ConsumerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.ConsumerService.Model.Customermodel;


@Repository
public interface CustomerRepo extends JpaRepository<Customermodel,Integer>{
	
}
	
	
