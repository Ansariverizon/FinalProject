package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnterpriseCustmodel {
	
	@Id 
	private int enterprisecustid;
	
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private OrderingApimodel orderingapimodel;
	
	
	private String enterprisecustname;
	
	public EnterpriseCustmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderingApimodel getOrderingapimodel() {
		return orderingapimodel;
	}
	public void setOrderingapimodel(OrderingApimodel orderingapimodel) {
		this.orderingapimodel = orderingapimodel;
	}
	public String getEnterprisecustname() {
		return enterprisecustname;
	}
	public void setEnterprisecustname(String enterprisecustname) {
		this.enterprisecustname = enterprisecustname;
	}
	public int getEnterprisecustid() {
		return enterprisecustid;
	}
	public void setEnterprisecustid(int enterprisecustid) {
		this.enterprisecustid = enterprisecustid;
	}

}
