package net.gondor;

import java.util.Scanner;

/** 
 * 4. 숫자를 3개로 늘려 큰 수와 작은 수를 비교하세요. 
 * 
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 3;
		int num3 = 4;
		int maximum = 0;
		int minimum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요");
		num1 = input.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		num2 = input.nextInt();
		System.out.println("세번째 수를 입력해주세요");
		num3 = input.nextInt();
		
		if (num1 >= num2) {
			if (num1 >= num3) {
				maximum = num1;
				if (num2 >= num3) {
					minimum = num3;
				} 
				else {
					minimum = num2;
				}
			} 
			else {
				maximum = num3;
				minimum = num2;
			}
		} 
		else {
			if (num2 >= num3) {
				maximum = num2;
				if (num1 >= num3) {
					minimum = num3;
				} 
				else {
					minimum = num1;
				}
			} 
			else {
				maximum = num3;
				minimum = num1;
			}
		}
		System.out.printf("%d, %d, %d 중 큰 수는 %d 입니다. %d, %d, %d 중 작은 수는 %d 입니다.\n", num1, num2, num3, maximum, num1,
				num2, num3, minimum);
	}
}
