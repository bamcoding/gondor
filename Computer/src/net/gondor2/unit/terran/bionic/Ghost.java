package net.gondor2.unit.terran.bionic;

import net.gondor2.unit.bionic.Special;

public class Ghost implements Special{
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 고고고~");

	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 정지합니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 공격합니다");

	}

	@Override
	public void clocking() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 몸을 숨깁니다");
	}

	@Override
	public void lockDown() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 적을 무력화합니다");
	}

	@Override
	public void nuclear() {
		// TODO Auto-generated method stub
		System.out.println("고스트: 핵을 날립니다");
	}
}
