package oop.sample.address;

import java.util.ArrayList;
import java.util.List;

import oop.sample.customer.User;

public class AddressManager {
	
	public static void addUserAddress(User user, Address address) {

		if (user.getAddressList() == null) {

			List<Address> addressList =new ArrayList<Address>();

			addressList.add(address);

		}
		else {

			user.getAddressList().add(address);

		}

	}

	public static void removeUserAddress(User user, Address address) {

		if (user.getAddressList().contains(address)) {

			user.getAddressList().remove(address);

		}

	}

}
