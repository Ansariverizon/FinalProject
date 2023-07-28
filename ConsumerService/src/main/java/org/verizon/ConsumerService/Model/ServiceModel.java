package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Servicemodel {
	
	@Id
	private int serviceid;
	
	
	@ManyToOne
    @JoinColumn(name="planid")
	private Catalogmodel catalogmodel;
	private String provision;
	private String testqos;
	private String activity;
	public Servicemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}
	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}
	public String getProvision() {
		return provision;
	}
	public void setProvision(String provision) {
		this.provision = provision;
	}
	public String getTestqos() {
		return testqos;
	}
	public void setTestqos(String testqos) {
		this.testqos = testqos;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
}