package net.gondor;

import java.util.Scanner;

public class Calculator {

	public Calculator(int num1, int num2) {

		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
	}
}
