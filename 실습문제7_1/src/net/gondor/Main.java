package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<TeamMembers> teamMembers = new ArrayList<TeamMembers>();
		teamMembers.add(new TeamMembers("이근재", "010119", "미정", "미정", "본인","한국"));
		teamMembers.add(new TeamMembers("리카르도", "010119", "미정", "미정", "본인","영국"));
		teamMembers.add(new TeamMembers("호도", "010119", "미정", "미정", "본인","미국"));
		teamMembers.add(new TeamMembers("데끼마스", "010119", "미정", "미정", "본인","일본"));


		for (int i = 0; i < teamMembers.size(); i++) {
			System.out.println(teamMembers.get(i)+"팀명 : "+teamMembers.get(i).getTeamName()+"\n");
		}
	}
}
