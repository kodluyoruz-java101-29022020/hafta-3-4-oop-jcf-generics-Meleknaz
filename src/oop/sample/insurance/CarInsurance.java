package oop.sample.insurance;

import java.util.Date;

public class CarInsurance extends Insurance{
	
	public CarInsurance() {
		super();
	}
	
	public CarInsurance(String name, double price, Date startDate, Date endDate) {
		super(name, price, startDate, endDate);
	}

	@Override
	public double calculate() {
		
		return insurancePrice*5 ;
	}

}
