package net.gondor;

import java.util.Scanner;

/**
 * (+)(-)(*)(/) 5. 겟터와 셋터 대신 생성자를 이용하세요.
 *
 */
public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = input.nextInt();

		Calculator cal = new Calculator(num1, num2);
	}
}
