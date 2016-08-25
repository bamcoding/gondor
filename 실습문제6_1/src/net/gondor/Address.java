package net.gondor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 206-002
 *
 */
public class Address {

	private String name;
	private String phone;
	private String address;
	private String detail;
	private String relation;

	public Address(String name, String phone, String address, String detail, String relation) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.detail = detail;
		this.relation = relation;
	}

	public String toString() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("상세주소 : " + detail);
		System.out.println("관계 : " + relation);
		return "";
	}
	public static void main(String[] args) {
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(new Address("이근재", "010123", "서울", "홍제역", "본인"));
		addressList.add(new Address("이치훈", "010321", "노원", "노원역", "팀장"));
		addressList.add(new Address("이은주", "010456", "강북", "노원역", "팀원"));
		addressList.add(new Address("이명회", "010908", "사당", "사당역", "팀원"));
		for (int i = 0; i < addressList.size(); i++) {
			System.out.println(addressList.get(i));
		}
	}
}
