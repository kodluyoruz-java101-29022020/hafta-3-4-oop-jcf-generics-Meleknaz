package oop.sample.insurance;

import java.util.Date;

public abstract class Insurance {
	
	protected String insuranceName;
	protected double insurancePrice;
	protected Date startInsuranceDate;
	protected Date endInsuranceDate;
	
	
	public Insurance() {
		
	}
	
	public Insurance(String name, double price, Date startDate, Date endDate) {
		
		this.insuranceName=name;
		this.insurancePrice=price;
		this.startInsuranceDate=startDate;
		this.endInsuranceDate=endDate;
		
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getInsurancePrice() {
		return insurancePrice;
	}

	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}

	public Date getStartInsuranceDate() {
		return startInsuranceDate;
	}

	public void setStartInsuranceDate(Date startInsuranceDate) {
		this.startInsuranceDate = startInsuranceDate;
	}

	public Date getEndInsuranceDate() {
		return endInsuranceDate;
	}

	public void setEndInsuranceDate(Date endInsuranceDate) {
		this.endInsuranceDate = endInsuranceDate;
	}
	
	
	public abstract double calculate();

}
