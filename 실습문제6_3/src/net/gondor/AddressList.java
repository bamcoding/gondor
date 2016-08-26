package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class AddressList {
	private List<Address> address = new ArrayList<Address>();
	private String name;
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public AddressList(String name) {
		this.name = name;
	}
	public String toString() {
		System.out.println("==========================");
		System.out.println(name + " 주소록입니다.");
		System.out.println("--------------------------");
		for (int i = 0; i < address.size(); i++) {
			System.out.println(address.get(i));
		}
		System.out.println("==========================");
		return "";
	}
}
