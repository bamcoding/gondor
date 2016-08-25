package net.gondor;

import java.util.List;

public class Comparing{

	public static void arrange(List<Integer> numbers) {
		int bag = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = j + 1; i < 3; i++) {
				if (numbers.get(j) >= numbers.get(i)) {
					bag = numbers.get(j);
					numbers.set(j, numbers.get(i));
					numbers.set(i, bag);
				}
			}
		}
	}

	public static void showArray(List<Integer> numbers) {
		System.out.println("오름차순으로 정렬합니다.");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
