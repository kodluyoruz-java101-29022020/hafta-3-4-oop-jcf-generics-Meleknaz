package oop.sample.customer;

import java.util.ArrayList;

import oop.sample.account.Account;
import oop.sample.account.AuthenticationStatus;
import oop.sample.insurance.Insurance;

public class EnterpriseCustomer extends Account{

	public EnterpriseCustomer() {
	}


	public EnterpriseCustomer(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus authenticationStatus) {
		super(user, insuranceList, authenticationStatus);

	}

	@Override
	protected double addProfit(double insurancePrice) {
		double totalPrice;
		totalPrice = insurancePrice + (insurancePrice * 0.2);
		return totalPrice;

	}


	@Override
	public int compareTo(Account arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}