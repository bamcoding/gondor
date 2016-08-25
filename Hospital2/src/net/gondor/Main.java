package net.gondor;
/**
 * 추상화, 캡슐화, 정보은닉, 상속, 다형성
 */
import java.util.Scanner;

import net.gondor.constant.HospitalAction;

public class Main {
	private int selNum;
	Scanner input = new Scanner(System.in);
	Hospital hos = new Hospital();
	
	public void management() {
		while (true) {
			menu();
			selNum = input.nextInt();
			input.nextLine();
			if (selNum == HospitalAction.ADD_DOCTOR) {
				addDoctor();//수정된 코드를 이클립스로 올립니다.
			} 
			else if (selNum == HospitalAction.ADD_DOCTOR) {
				addPatient();
			} 
			else if (selNum == HospitalAction.SHOW_PATIENT) {
				showPatient();
			} 
			else if (selNum == HospitalAction.QUIT) {
				System.out.println("안녕히 가세요.");
				break;
			}
			System.out.println();
		}
	}

	private void showPatient() {
		String name;
		System.out.println("환자를 조회합니다.\n의사의 이름을 입력하세요.");
		hos.showDoctor();
		name = input.next();
		hos.showPatient(name);
	}

	private void addPatient() {
		String name;
		String name2;
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

	private void addDoctor() {
		System.out.println("의사등록을 진행합니다.\n의사의 이름을 입력하세요.");
		String name = input.nextLine();
		while (true) {
			name = input.nextLine();
			if (name.length()==0) {
				System.out.println("아무것도 입력하지 않았습니다.");
			} else {
				hos.addDoctor(name);
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
		System.out.println("근재근재병원입니다.");
		new Main().management();
	}
}
