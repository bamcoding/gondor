package net.gondor.computer;

import net.gondor.CPU;

public class AmdCPU implements CPU {
	private String manufactor;
	private String coreType;

	public AmdCPU(String manufactor, String coreType) {
		this.manufactor = manufactor;
		this.coreType = coreType;
		// TODO Auto-generated constructor stub
	}

	public void printCPUInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : " + manufactor);
		System.out.println("코어 타입 : " + coreType);
	}
}
