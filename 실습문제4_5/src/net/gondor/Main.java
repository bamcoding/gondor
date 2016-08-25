package net.gondor;

import java.util.Scanner;

/**
 * 5. 배열을 이용해 오름차순으로 정렬해보세요.  
 * 
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요");
		numbers[0] = input.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		numbers[1] = input.nextInt();
		System.out.println("세번째 수를 입력해주세요");
		numbers[2] = input.nextInt();

		int bag = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = j+1; i < 3; i++) {
				if (numbers[j] >= numbers[i]) {
					bag = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = bag;
				}
			}
		}
		
		System.out.println("오름차순으로 정렬합니다.");
		for(int i=0;i<3;i++){
		System.out.println(numbers[i]);
		}
	}
}
