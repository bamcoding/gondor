package net.gondor;

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

	public Address() {
		this.name = "이근재";
		this.phone = "010119";
		this.address = "서울";
		this.detail = "홍제역";
		this.relation = "본인";
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
		Address ad = new Address();
		//System.out.println(ad);
	}
}
