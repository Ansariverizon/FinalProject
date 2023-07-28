package org.verizon.ConsumerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.ConsumerService.Model.EnterpriseCustmodel;



@Repository
public interface EnterpriseCustRepo extends JpaRepository<EnterpriseCustmodel,Integer>{
	
}
	
	
