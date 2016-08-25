package net.gondor;

import java.util.Scanner;

/**
 * (+)(-)(*)(/) 7. 계산기 메소드에 파라미터로 숫자 두 개를 전달해 계산하세요.
 *
 */
public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = input.nextInt();
		Calculator cal = new Calculator();
		cal.getValue(num1, num2);
	}
}
