package net.gondor;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<TeamMembers> teamMembers = new ArrayList<TeamMembers>();
		teamMembers.add(new TeamMembers("이근재", "010119", "미정", "미정", "본인","한국"));
		teamMembers.get(0).setTeamName("한국코리아");
		teamMembers.add(new TeamMembers("리카르도", "010119", "미정", "미정", "본인","영국"));
		teamMembers.get(1).setTeamName("영국잉글랜드");
		teamMembers.add(new TeamMembers("호도", "010119", "미정", "미정", "본인","미국"));
		teamMembers.get(2).setTeamName("미국유나잍스테잍");
		teamMembers.add(new TeamMembers("데끼마스", "010119", "미정", "미정", "본인","일본"));
		teamMembers.get(3).setTeamName("일본제페니즈");

		for (int i = 0; i < teamMembers.size(); i++) {
			System.out.println(teamMembers.get(i)+"팀명 : "+teamMembers.get(i).getTeamName()+"\n");
		}
	}
}
