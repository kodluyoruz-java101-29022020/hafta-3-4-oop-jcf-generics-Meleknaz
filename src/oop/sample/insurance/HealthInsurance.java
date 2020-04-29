package oop.sample.insurance;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HealthInsurance extends Insurance {
	
	public HealthInsurance(){
		super();
	}
	
	public HealthInsurance(String name, double price, Date startDate, Date endDate) {
		super(name, price, startDate, endDate);
	}

	@Override
	public double calculate() {
		
		return insurancePrice*4 ;
	}
	
}
