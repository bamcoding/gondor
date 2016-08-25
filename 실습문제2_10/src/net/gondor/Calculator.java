package net.gondor;

import java.util.Scanner;

public class Calculator {
	public static void getValue(int num1, int num2, String operator){
		if (operator.equals("+")) {
			sum(num1, num2);
		} 
		else if (operator.equals("-")) {
			sub(num1, num2);
		} 
		else if (operator.equals("*")) {
			multiply(num1, num2);
		} 
		else if (operator.equals("/")) {
			divide(num1, num2);
		}
	}

	public static void divide(int num1, int num2) {
		System.out.printf("%d / %d = %.2f\n",num1 ,num2 ,(float)num1/num2);
	}

	public static void multiply(int num1, int num2) {
		System.out.printf("%d * %d = %d\n",num1 ,num2 ,num1*num2);
	}

	public static void sum(int num1, int num2) {
		System.out.printf("%d + %d = %d\n",num1 ,num2 ,num1+num2);
	}

	public static void sub(int num1, int num2) {
		System.out.printf("%d - %d = %d\n",num1 ,num2 ,num1-num2);
	}
}
