package net.gondor;

/**
6. 겟터와 셋터 그리고 생성자를 모두 이용하세요.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = input.nextInt();

		Calculator cal = new Calculator(num1, 0);
		cal.setNum2(num2);
		int sum = cal.getNum1() + cal.getNum2();
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
	}
}
