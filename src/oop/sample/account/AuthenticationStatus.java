package oop.sample.account;

public enum AuthenticationStatus {
	
	SUCCESS("200","Login successful"), 

	UNSUCCESFUL("404","User not found.");


	private final String code;
	private final String description;



	private AuthenticationStatus(String code, String description) {

		this.code = code;
		this.description = description;
	}


	public String getCode() {

		return this.code;
	}


	public String getDescription() {

		return this.description;
	}

}
