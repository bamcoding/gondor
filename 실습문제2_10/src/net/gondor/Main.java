package net.gondor;

import java.util.Scanner;

/**
 * (+)(-)(*)(/)
10. 계산 메소드를 만들고 파라미터를 3개 받아 처리하세요.
10-1. 파라미터 종류 숫자1, 숫자2, 연산자
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = input.nextInt();
		input.nextLine();
		System.out.println("연산자를 입력하세요(+,-,*,/)");
		String operator = input.nextLine();
		Calculator cal = new Calculator();
		cal.getValue(num1, num2, operator);
	}
}
