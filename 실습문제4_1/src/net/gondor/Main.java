package net.gondor;

/**
 * 1. main 메소드에서 수행하세요. 
 * 
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 3;
		int maximum = 0;
		int minimum = 0;

		if (num1 > num2) {
			maximum = num1;
			minimum = num2;
		} 
		else if (num1 == num2) {
			System.out.println("두 수는 같습니다.");
		} 
		else {
			maximum = num2;
			minimum = num1;
		}

		System.out.printf("%d, %d 중 큰 수는 %d 입니다. %d, %d 중 작은 수는 %d 입니다.\n"
				, num1, num2, maximum, num1, num2, minimum);

	}
}
