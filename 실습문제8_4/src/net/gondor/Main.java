package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<ClassList> classLists = new ArrayList<ClassList>();
		List<TeamMembers> tempAddress = new ArrayList<TeamMembers>();		
		classLists.add(new ClassList("1반"));
		tempAddress = classLists.get(0).getTeamMembers();
		tempAddress.add(new TeamMembers("이근재", "010119", "미정", "미정", "본인","한국"));
		tempAddress.add(new TeamMembers("이근재2", "010119", "미정", "미정", "본인","한국"));
		
		classLists.add(new ClassList("2반"));
		tempAddress = classLists.get(1).getTeamMembers();
		tempAddress.add(new TeamMembers("리카르도", "010119", "미정", "미정", "본인","영국"));
		
		classLists.add(new ClassList("3반"));
		tempAddress = classLists.get(2).getTeamMembers();
		tempAddress.add(new TeamMembers("호도", "010119", "미정", "미정", "본인","미국"));
		tempAddress.add(new TeamMembers("호도2", "010119", "미정", "미정", "본인","미국"));
		
		classLists.add(new ClassList("4반"));
		tempAddress = classLists.get(3).getTeamMembers();
		tempAddress.add(new TeamMembers("데끼마스", "010119", "미정", "미정", "본인","일본"));

		for (int i = 0; i < classLists.size(); i++) {
			System.out.println(classLists.get(i));
		}
	}
}
