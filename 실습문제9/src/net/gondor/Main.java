package net.gondor;

import java.util.Scanner;

public class Main {
	private String[][] sits = new String[4][12];

	public static void main(String[] args) {
		new Main().chooseSit();
	}

	private void chooseSit() {
		Scanner input = new Scanner(System.in);
		int row = 0;
		int col = 0;
		String sel = "";
		while (true) {
			System.out.println("몇 번째 줄에 앉으시겠습니까?");
			row = input.nextInt();
			input.nextLine();
			System.out.println(row + "번째 줄, 몇 번째 열에 앉으시겠습니까?(왼쪽부터)");
			col = input.nextInt();
			input.nextLine();
			
			sits[row-1][col-1] = "■";
			currentState();
			
			System.out.println("예약되었습니다.");
			System.out.println("또 예약하실겁니까?(y/n)");
			sel = input.nextLine();
			if (!sel.equalsIgnoreCase("y")) {
				System.out.println("안녕히 가세요~");
				break;
			}
		}
	}

	private Main() {
		System.out.println("기차 좌석 예약 시스템");
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 12; c++) {
				sits[r][c] = "□";
			}
		}
		currentState();
	}

	private void currentState() {
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 12; c++) {
				System.out.printf(sits[r][c] + " ");
				if (c == 5) {
					System.out.printf("    ");
				}
			}
			if (r == 1) {
				System.out.println();
			}
			System.out.println();
		}
	}
}
