package net.gondor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 206-002
 *
 */
public class Address implements AddressInterface{

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
}
