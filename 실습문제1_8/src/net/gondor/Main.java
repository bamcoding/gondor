package net.gondor;

/**
8. 계산기 인터페이스를 만들어서 구현하세요.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = input.nextInt();

		CalculatorInterface cal = new Calculator();
		int sum = cal.getSum(num1, num2);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	}
}
