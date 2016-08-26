package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<AddressList> addressList = new ArrayList<AddressList>();
		addressList.add(new AddressList("가족"));
		addressList.get(0).getAddress().add(new Address("이근재", "010119", "서울", "서울", "본인"));
		addressList.get(0).getAddress().add(new Address("엄마", "010119", "서울", "서울", "본인"));
		addressList.get(0).getAddress().add(new Address("누나", "010119", "서울", "서울", "본인"));
		addressList.add(new AddressList("회사"));
		addressList.get(1).getAddress().add(new Address("이치훈", "010119", "서울", "서울", "본인"));
		addressList.get(1).getAddress().add(new Address("김명회", "010119", "서울", "서울", "본인"));
		addressList.get(1).getAddress().add(new Address("이은주", "010119", "서울", "서울", "본인"));
		addressList.add(new AddressList("학교"));
		addressList.get(2).getAddress().add(new Address("양지한", "010119", "서울", "서울", "본인"));
		addressList.get(2).getAddress().add(new Address("한인규", "010119", "서울", "서울", "본인"));
		addressList.get(2).getAddress().add(new Address("김종욱", "010119", "서울", "서울", "본인"));
		addressList.get(2).getAddress().add(new Address("김용정", "010119", "서울", "서울", "본인"));

		for (int i = 0; i < addressList.size(); i++) {
			System.out.println(addressList.get(i));
		}
	}
}
