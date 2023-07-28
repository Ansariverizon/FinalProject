package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customermodel {
	
	@Id
	private int custid;
	
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private OrderingApimodel orderingapimodel;
	
	
	private String cust_name;
	
	
	
	
	
	public Customermodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public OrderingApimodel getOrderingmodel() {
		return orderingapimodel;
	}
	public void setOrderingmodel(OrderingApimodel orderingmodel) {
		this.orderingapimodel = orderingmodel;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	
}
