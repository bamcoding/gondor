package net.gondor;

import java.util.Scanner;

public class Temperater {

	public static void getFahrenheit(double Celsius) {
		double Fahrenheit = (Celsius * 1.8) + 32;
		System.out.printf("섭씨 %.2f도는 화씨%.2f도 입니다\n ", Celsius, Fahrenheit);
	}

	public static void getCelsius(double Fahrenheit) {
		double Celsius = (Fahrenheit - 32) / 1.8;
		System.out.printf("화씨 %.2f도는 섭씨%.2f도 입니다\n", Fahrenheit, Celsius);
	}
}
