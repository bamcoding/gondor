package net.gondor;

import java.util.Scanner;
/**
 * 4. 계산기 클래스의 겟터와 셋터를 이용하세요.
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = input.nextInt();

		Calculator cal = new Calculator();
		cal.setNum1(num1);
		cal.setNum2(num2);
		int sum = cal.getNum1() + cal.getNum2();
		System.out.printf("%d + %d = %d\n",num1 ,num2 ,sum);		
	}
}
