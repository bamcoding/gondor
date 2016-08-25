package net.gondor;

/**
7. 계산기 메소드에 파라미터로 숫자 두 개를 전달해 계산하세요.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = input.nextInt();

		Calculator cal = new Calculator();
		int sum = cal.getSum(num1, num2);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	}
}
