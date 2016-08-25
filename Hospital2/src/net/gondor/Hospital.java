package net.gondor;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
	/**
	 * 의사들의 이름을 저장하는 배열리스트
	 */
	private List<String> doctors = new ArrayList<String>();
	/**
	 * 의사들의 이름을 키로 저장하고
	 * 값으로 배열리스트 타입을 저장함으로써 1:다수의 저장이 가능합니다.
	 * doctors를 key로 두고 value로 환자를 한 명씩 add할 수 있습니다.
	 */
	private Map<String, List<String>> patient = new HashMap<String, List<String>>();

	/**
	 * doctors 배열리스트에 의사 이름을 추가하는 메소드
	 * 또한 Map에도 키로서 추가를 합니다.
	 * @param doctorName add와 put을 동시에 합니다.
	 */
	public void addDoctor(String doctorName) {
		doctors.add(doctorName);
		patient.put(doctorName, new ArrayList<String>());
		System.out.println("\"" + doctorName + "\"" + "를 등록합니다.");
		showDoctor();
	}

	/**
	 * 의사에게 환자를 추가시켜주는 메소드	 *
	 * @param doctorName : 의사
	 * @param patientName : 환자  배열리스트 추가(add)
	 * @return
	 */
	public boolean addPatient(String doctorName, String patientName) {
		boolean isDoctor = doctors.contains(doctorName);
		if (isDoctor) {
			patient.get(doctorName).add(patientName);
			System.out.println("입력하신 \"" + patientName + "\"환자는 " + "\"" + doctorName + "\"에게 등록되었습니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		return isDoctor;
	}
	
	/**
	 * 의사목록을 보여주는 메소드
	 * 의사가 담당하는 환자의 수도 알 수 있습니다.
	 */
	public void showDoctor() {
		System.out.println("================================");
		for (int i = 0; i < doctors.size(); i++) {
			int pSize = patient.get(doctors.get(i)).size();
			System.out.println((i + 1) + ". " + doctors.get(i) + "(" + pSize + ")");
		}
		System.out.println("================================");
	}
	
	/**
	 * 환자목록을 보여주는 메소드
	 * @param doctorName
	 */
	public void showPatient(String doctorName) {
		System.out.println("\"" + doctorName + "\"의 환자목록입니다.");
		int pSize = patient.get(doctorName).size();
		System.out.println("================================");
		for (int i = 0; i < pSize; i++) {
			System.out.println((i + 1) + ". " + patient.get(doctorName).get(i));
		}
		System.out.println("================================");
	}
}
