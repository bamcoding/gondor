package net.gondor;

public class TeamMembers extends Address {

	private String teamName = null;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public TeamMembers(String name, String phone, String address, String detail, String relation, String teamName) {
		super(name, phone, address, detail, relation);
		this.teamName = teamName;
	}
//	public String toString() {
//		return "팀이름 : "+teamName;
//	}
}
