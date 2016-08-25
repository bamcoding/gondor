package net.gondor;

import java.util.Scanner;

/**
 * 온도 계산기를 만드세요.
예 > 화씨를 입력하세요.
     화씨 OO도는 섭씨 OO도 입니다.
예 > 섭씨를 입력하세요.
     섭씨 OO도는 화씨 OO도 입니다.
     
2. 스캐너를 이용하세요.
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("화씨를 입력하세요.");
		double Fahrenheit = input.nextDouble();
		double Celsius = (Fahrenheit - 32) / 1.8 ;		
		System.out.printf("화씨 %.2f도는 섭씨%.2f도 입니다\n",Fahrenheit,Celsius);
		System.out.println("섭씨를 입력하세요.");
		Celsius = input.nextDouble();
		Fahrenheit=(Celsius * 1.8) + 32;
		System.out.printf("섭씨 %.2f도는 화씨%.2f도 입니다\n ",Celsius,Fahrenheit);
		}
}
