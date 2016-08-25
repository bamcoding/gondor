package net.gondor;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
	private List<String> doctors = new ArrayList<String>();
	private Map<String, List<String>> patient = new HashMap<String, List<String>>();
	private Scanner input = new Scanner(System.in);
	
	public List<String> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<String> doctors) {
		this.doctors = doctors;
	}
	public Map<String, List<String>> getPatient() {
		return patient;
	}
	public void setPatient(Map<String, List<String>> patient) {
		this.patient = patient;
	}
	public void showDoctor() {//123123
		System.out.println("================================");
		for(int i =0; i<doctors.size();i++){
		int dSize = patient.get(doctors.get(i)).size();
		System.out.println((i+1)+". "+doctors.get(i)+"("+dSize+")");
		}
		System.out.println("================================");
	}
	/**
	 * doctors 리스트에 의사 이름을 추가합니다.
	 * @param doctorName
	 */
	public void addDoctor(String doctorName){
		doctors.add(doctorName);
		patient.put(doctorName, new ArrayList<String>());
		System.out.println("\""+doctorName+"\""+"를 등록합니다.");
		showDoctor();
	}
	public boolean addPatient(String doctorName, String patientName){
		boolean isDoctor =doctors.contains(doctorName);
		if(isDoctor){
			patient.get(doctorName).add(patientName);
			System.out.println("입력하신 \""+patientName+"\"환자는 "
		+"\""+doctorName+"\"에게 등록되었습니다.");
		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
		return isDoctor;
	}
	public void showPatient(String doctorName){
	System.out.println("\"" + doctorName + "\"의 환자목록입니다.");
	int pSize=patient.get(doctorName).size();
	System.out.println("================================");
	for(int i=0; i<pSize;i++){
		System.out.println((i+1)+". "+patient.get(doctorName).get(i));
	}
	System.out.println("================================");
	}
}
