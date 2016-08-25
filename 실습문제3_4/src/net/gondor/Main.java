package net.gondor;

import java.util.Scanner;

/**
 * 온도 계산기를 만드세요.
예 > 화씨를 입력하세요.
     화씨 OO도는 섭씨 OO도 입니다.
예 > 섭씨를 입력하세요.
     섭씨 OO도는 화씨 OO도 입니다.

4. 인터페이스를 만들어서 구현하세요.
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("화씨를 입력하세요.");
		double Fahrenheit = input.nextDouble();
		Temperater temperater = new Temperater();
		temperater.getCelsius(Fahrenheit);
		System.out.println("섭씨를 입력하세요.");
		double Celsius = input.nextDouble();
		temperater.getFahrenheit(Celsius);
	}
}
