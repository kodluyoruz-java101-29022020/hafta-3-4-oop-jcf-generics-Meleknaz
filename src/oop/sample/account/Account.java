package oop.sample.account;

import java.util.ArrayList;
import java.util.List;

import oop.sample.customer.IndividualCustomer;
import oop.sample.customer.User;
import oop.sample.exceptionManagement.InvalidAuthenticationException;
import oop.sample.insurance.Insurance;

public abstract class Account implements Comparable<Account>{
	
	protected User user;
	protected ArrayList<Insurance> insuranceList = new ArrayList<Insurance>();
	protected AuthenticationStatus authenticationStatus=AuthenticationStatus.SUCCESS;
	
	public Account() {
	}

	public Account(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus authenticationStatus) {

		this.user = user;
		this.insuranceList = insuranceList;
		this.authenticationStatus = authenticationStatus;
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ArrayList<Insurance> getInsuranceList() {
		return insuranceList;
	}


	public void setInsuranceList(ArrayList<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}


	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}


	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}


	public final void showUserInfo() {
		
		if (user != null) {
            StringBuilder builder = new StringBuilder();
            builder.append("User Info: ");
            builder.append("\nName :");
            builder.append(user.getName());
            builder.append("\nSurname : ");
            builder.append(user.getSurname());
            builder.append("\nEmail:");
            builder.append(user.getEmail());
            builder.append("\nJob:");
            builder.append(user.getJob());
            builder.append("\nAge:");
			builder.append(user.getAge());
            builder.append("\nLast Time to Login :");
            builder.append(user.getLastLoginDate());
            System.out.println(builder.toString());

        } 
		else {
            System.out.println("There are no users to show.");
        }
		
	}	
	public void login(String email, String password) throws InvalidAuthenticationException {
		if (email == user.getEmail() && password == user.getPassword()) {
			 authenticationStatus.getCode();

		} else {
			throw new InvalidAuthenticationException("Invalid User or Password");
		}
	}
	
	public boolean addInsurance(Account account, Insurance insurance) {

        if (account.getInsuranceList().isEmpty()){
         List<Insurance> insuranceList = new ArrayList<Insurance>();
          insuranceList.add(insurance);

            account.setInsuranceList((ArrayList<Insurance>) insuranceList);
            return true;

        } 
        else {
         account.getInsuranceList().add(insurance);
           return true;
        }



    }

	protected abstract double addProfit(double insurancePrice);

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((insuranceList == null) ? 0 : insuranceList.hashCode());
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());

		return result;

	}



	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Account other = (Account) obj;
		if (insuranceList == null) {
			if (other.insuranceList != null)
				return false;

		} else if (!insuranceList.equals(other.insuranceList))

			return false;

		if (authenticationStatus != other.authenticationStatus)
			return false;

		if (user == null) {
			if (other.user != null)
				return false;

		} else if (!user.equals(other.user))
			return false;

		return true;

	}

		
	}


