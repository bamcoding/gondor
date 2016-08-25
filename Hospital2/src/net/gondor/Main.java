package net.gondor;

import java.util.Scanner;

public class Main {
	private final int addDoctor = 1;
	private final int addPatient = 2;
	private final int showPatients = 3;
	private final int exit = 4;
	
	/**
	 * 의사나 환자의 추가, 조회를 총괄적으로 담당하는 메소드
	 */
	public void management() {
		Scanner input = new Scanner(System.in);
		Hospital hos = new Hospital();
		String patientName = "";
		String doctorName = "";
		int selNum = 0;
		while (true) {
			menu();
			selNum = input.nextInt();
			input.nextLine();
			//nextInt는 숫자만 공백이나 줄띄기는 무시합니다.
			//그러므로 input.nextLine의 역할은 줄띄기입니다. 입력 기능은 무시됩니다.
			if (selNum == addDoctor) {
				System.out.println("의사등록을 진행합니다.\n의사의 이름을 입력하세요.");
				while (true) {
					doctorName = input.nextLine();
					if (doctorName.equals("")) {
						System.out.println("아무것도 입력하지 않았습니다.\n의사의 이름을 입력하세요.");
					} 
					else {
						hos.addDoctor(doctorName);
						break;
					}
				}
			} 
			else if (selNum == addPatient) {
				System.out.println("환자를 등록합니다.\n환자의 이름을 입력하세요.");
				patientName = input.next();
				hos.showDoctor();
				while (true) {
					System.out.println("원하시는 의사의 이름을 입력하세요.");
					doctorName = input.next();
					if (hos.addPatient(doctorName, patientName)) {
						//의사의 이름을 잘 입력해야 환자의 추가가 올바르게 됩니다
						break;
					}
				}
			} 
			else if (selNum == showPatients) {
				System.out.println("환자를 조회합니다.\n의사의 이름을 입력하세요.");
				hos.showDoctor();
				//입력을 돕기위해 의사목록을 보여줍니다.
				doctorName = input.next();
				hos.showPatient(doctorName);

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

	/**
	 * 선택 메뉴를 출력합니다.
	 */
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
