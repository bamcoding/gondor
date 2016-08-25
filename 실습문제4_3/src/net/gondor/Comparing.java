package net.gondor;

import java.util.Scanner;

public class Comparing {

	public Comparing() {
		int num1 = 1;
		int num2 = 3;
		int maximum = 0;
		int minimum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요");
		num1 = input.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		num2 = input.nextInt();

		if (num1 > num2) {
			maximum = num1;
			minimum = num2;
		} else if (num1 == num2) {
			System.out.println("두 수는 같습니다.");
		} else {
			maximum = num2;
			minimum = num1;
		}

		System.out.printf("%d, %d 중 큰 수는 %d 입니다. %d, %d 중 작은 수는 %d 입니다.\n", num1, num2, maximum, num1, num2, minimum);

	}
}
