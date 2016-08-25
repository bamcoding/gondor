package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class Main {
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
