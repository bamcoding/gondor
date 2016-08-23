package net.gondor.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<AddressInfo> addressList;
	
	public AddressBook() {
		addressList = new ArrayList<AddressInfo>();
	}

	public void add(AddressInfo addressInfo) {
		addressList.add(addressInfo);
	}

	public void modify(int index, AddressInfo addressInfo) {
		addressList.set(index, addressInfo);

	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		addressList.remove(index);
	}

	public List<AddressInfo> queryAllAddress() {
		return addressList;
	}

	public AddressInfo queryOneAddress(int index) {
		return addressList.get(index);
	}
}
