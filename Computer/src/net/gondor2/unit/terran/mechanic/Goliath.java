package net.gondor2.unit.terran.mechanic;

import net.gondor2.unit.Mechanic;

public class Goliath implements Mechanic{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("골리앗: 이동합니다");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("골리앗: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("골리앗: 멈춤니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("골리앗: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("골리앗: 공격합니다");
	}
}
