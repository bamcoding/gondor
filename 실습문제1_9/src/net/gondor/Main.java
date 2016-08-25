package net.gondor;

/**
9. 계산기 클래스의 계산 메소드를 스태틱으로 만드세요.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = input.nextInt();

		int sum = Calculator.getSum(num1, num2);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	}
}
