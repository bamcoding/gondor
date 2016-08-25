package net.gondor;

import java.util.Scanner;

public class Temperater {

	public Temperater() {
		Scanner input = new Scanner(System.in);
		System.out.println("화씨를 입력하세요.");
		double Fahrenheit = input.nextDouble();
		double Celsius = (Fahrenheit - 32) / 1.8;
		System.out.printf("화씨 %.2f도는 섭씨%.2f도 입니다\n", Fahrenheit, Celsius);
		System.out.println("섭씨를 입력하세요.");
		Celsius = input.nextDouble();
		Fahrenheit = (Celsius * 1.8) + 32;
		System.out.printf("섭씨 %.2f도는 화씨%.2f도 입니다\n ", Celsius, Fahrenheit);
	}

}
