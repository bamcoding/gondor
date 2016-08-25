package net.gondor;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 리스트를 이용해 오름차순으로 정렬해보세요.
 * 
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요");
		int num1 = input.nextInt();
		numbers.add(num1);
		System.out.println("두번째 수를 입력해주세요");
		int num2 = input.nextInt();
		numbers.add(num2);
		System.out.println("세번째 수를 입력해주세요");
		int num3 = input.nextInt();
		numbers.add(num3);

		arrange(numbers);

		showArray(numbers);
	}

	private static void arrange(List<Integer> numbers) {
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

	private static void showArray(List<Integer> numbers) {
		System.out.println("오름차순으로 정렬합니다.");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}