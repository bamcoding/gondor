package net.gondor;

import java.util.Scanner;
/**
 * 2. 스캐너를 이용하세요.
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
		System.out.printf("%d + %d = %d\n",num1 ,num2 ,num1+num2);
	}
}
