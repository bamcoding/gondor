package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class ClassList {
	private List<TeamMembers> teamMembers = new ArrayList<TeamMembers>();
	private String name;
	
	public List<TeamMembers> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<TeamMembers> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public ClassList(String name) {
		this.name = name;
	}
	public String toString() {
		System.out.println("==========================");
		System.out.println(name + " 학급 명부입니다.");
		System.out.println("--------------------------");
		for (int i = 0; i < teamMembers.size(); i++) {
			System.out.println(teamMembers.get(i)+"팀명 : "+teamMembers.get(i).getTeamName()+"\n");
		}
		System.out.println("==========================");
		return "";
	}
}
