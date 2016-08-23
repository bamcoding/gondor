package net.gondor;

import java.util.Scanner;

public class Main {
	private final int addDoctor = 1;
	private final int addPatient = 2;
	private final int showPatients = 3;
	private final int exit = 4;
	private int selNum;

	public void management() {

		Scanner input = new Scanner(System.in);
		Hospital hos = new Hospital();

		String name = "";
		String name2 = "";
		while (true) {
			menu();
			selNum = input.nextInt();
			if (selNum == addDoctor) {
				System.out.println("의사등록을 진행합니다.\n의사의 이름을 입력하세요.");
				name = input.nextLine();
				while (true) {
					if (input.hasNextLine()) {
						name = input.nextLine();
					}
					if (name.equals("")) {
						System.out.println("아무것도");
					} else {
						hos.addDoctor(name);
						break;
					}
				}
			} 
			else if (selNum == addPatient) {
				System.out.println("환자를 등록합니다.\n환자의 이름을 입력하세요.");
				name = input.next();
				hos.showDoctor();
				while (true) {
					System.out.println("원하시는 의사의 이름을 입력하세요.");
					name2 = input.next();
					if (hos.addPatient(name2, name)) {
						break;
					}
				}
			} 
			else if (selNum == showPatients) {
				System.out.println("환자를 조회합니다.\n의사의 이름을 입력하세요.");
				hos.showDoctor();
				name = input.next();
				hos.showPatient(name);
			} 
			else if (selNum == exit) {
				System.out.println("안녕히 가세요.");
				break;
			}
		}
	}

	private void menu() {
		System.out.println("원하는 업무를 선택하세요.");
		System.out.println("================================");
		System.out.println("1. 의사 등록");
		System.out.println("2. 환자 등록");
		System.out.println("3. 환자 조회");
		System.out.println("4. 종료");
		System.out.println("================================");
	}

	public static void main(String[] args) {
		System.out.println("근재근재병원입니다.\n");
		new Main().management();
	}
}
