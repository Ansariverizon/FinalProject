package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class OrderingApimodel {
	@Entity
	public class OderingApimodel {
		@Id
		private String orderid;	
		private int planid;
		public String getOrderid() {
			return orderid;
		}
		public void setOrderid(String orderid) {
			this.orderid = orderid;
		}
		public int getPlanid() {
			return planid;
		}
		public void setPlanid(int planid) {
			this.planid = planid;
		}
		public OderingApimodel() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	
	}

}
