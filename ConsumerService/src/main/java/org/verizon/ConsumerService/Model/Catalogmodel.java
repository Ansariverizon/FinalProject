package org.verizon.ConsumerService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Catalogmodel {
@Id
	
private int planid;
private String plan;
private int price;
private String duration;


public Catalogmodel() {
	
}
public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
public int getPlanid() {
	return planid;
}
public void setPlanid(int planid) {
	this.planid = planid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}


}
