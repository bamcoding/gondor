package net.gondor;

import java.util.Scanner;

/**
 * (+)(-)(*)(/) 4. 계산기 클래스의 겟터와 셋터를 이용하세요.
 *
 * 
 */
public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = input.nextInt();
		
		cal.setNum1(num1);
		cal.setNum2(num2);
		// TODO Auto-generated constructor stub		System.out.printf("%d + %d = %d\n",num1 ,num2 ,num1+num2);
		int value1 = cal.getNum1() + cal.getNum2();
		System.out.printf("%d + %d = %d\n",num1 ,num2 ,value1);
		int value2 = cal.getNum1() - cal.getNum2();
		System.out.printf("%d - %d = %d\n",num1 ,num2 ,value2);
		int value3 = cal.getNum1() * cal.getNum2();
		System.out.printf("%d * %d = %d\n",num1 ,num2 ,value3);
		float value4 = (float)cal.getNum1() / cal.getNum2();
		System.out.printf("%d / %d = %.2f\n",num1 ,num2 ,value4);
	}
}
