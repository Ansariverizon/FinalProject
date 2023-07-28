package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class OrderingApimodel {
	
	@Id
	private String orderid;	
	
	
	@ManyToOne
	@JoinColumn(name="planid")
	private Catalogmodel catalogmodel;
		
		public OrderingApimodel() {
			super();
		}

		public String getOrderid() {
			return orderid;
		}

		public void setOrderid(String orderid) {
			this.orderid = orderid;
		}

		public Catalogmodel getCatalogmodel() {
			return catalogmodel;
		}

		public void setCatalogmodel(Catalogmodel catalogmodel) {
			this.catalogmodel = catalogmodel;
		}
		
		
	
	}
