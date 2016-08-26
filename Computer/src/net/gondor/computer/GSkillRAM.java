package net.gondor.computer;

import net.gondor.RAM;

public class GSkillRAM implements RAM{
	private String capacity;
	private String manufactor;

	public GSkillRAM(String capacity, String manufactor) {
		this.capacity = capacity;
		this.manufactor = manufactor;
		// TODO Auto-generated constructor stub
	}

	public void printRAMInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : " + manufactor);
		System.out.println("용량 : " + capacity);
	}
}
