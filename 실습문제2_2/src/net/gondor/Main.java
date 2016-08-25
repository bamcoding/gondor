package net.gondor;

import java.util.Scanner;

/**
 * (+)(-)(*)(/) 2. 스캐너를 이용하세요.
 *
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("첫번째 숫자를 입력하세요");
		int num2 = input.nextInt();
		
		System.out.printf("%d + %d = %d\n",num1 ,num2 ,num1+num2);
		System.out.printf("%d - %d = %d\n",num1 ,num2 ,num1-num2);
		System.out.printf("%d * %d = %d\n",num1 ,num2 ,num1*num2);
		System.out.printf("%d / %d = %.2f\n",num1 ,num2 ,(float)num1/num2);
	}
}
