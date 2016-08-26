package net.gondor.computer;

import net.gondor.VGA;

public class NVidiaVGA implements VGA {
	private String name;
	private String manufactor;

	public NVidiaVGA(String name, String manufactor) {
		this.name = name;
		this.manufactor = manufactor;
		// TODO Auto-generated constructor stub
	}

	public void printVGAInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : " + manufactor);
		System.out.println("칩셋명 : " + name);
	}
}
