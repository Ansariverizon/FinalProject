package org.verizon.ConsumerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.ConsumerService.Model.OrderingApimodel;

@Repository
public interface OrderingApiRepo extends JpaRepository<OrderingApimodel,Integer>{
	
}
	
	
