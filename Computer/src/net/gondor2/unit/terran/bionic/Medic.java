package net.gondor2.unit.terran.bionic;

import net.gondor2.unit.bionic.Medical;

public class Medic implements Medical{

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 고고고~");

	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 정지합니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 치료합니다");

	}

	@Override
	public void blind() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 상대방의 시야를 차단합니다");
	}

	@Override
	public void restoration() {
		// TODO Auto-generated method stub
		System.out.println("메딕: 아군의 상태이상을 치료합니다");
	}

}
