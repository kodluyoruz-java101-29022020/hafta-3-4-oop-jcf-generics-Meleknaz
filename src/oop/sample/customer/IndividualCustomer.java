package oop.sample.customer;

import java.util.ArrayList;

import oop.sample.account.Account;
import oop.sample.account.AuthenticationStatus;
import oop.sample.insurance.Insurance;

public class IndividualCustomer extends Account{

	public IndividualCustomer() {
	}

	public IndividualCustomer(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus authenticationStatus) {

		super(user, insuranceList, authenticationStatus);
	}

	@Override
	protected double addProfit(double insurancePrice) {
		double totalPrice;
		totalPrice = insurancePrice + (insurancePrice * 0.3);

		return totalPrice;

	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
