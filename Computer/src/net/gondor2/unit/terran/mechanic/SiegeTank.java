package net.gondor2.unit.terran.mechanic;

import net.gondor2.unit.mechanic.SiegeMode;

public class SiegeTank implements SiegeMode{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 이동합니다");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 멈춤니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 공격합니다");
	}

	@Override
	public void siegMode() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 시즈모드");
	}

	@Override
	public void tankMode() {
		// TODO Auto-generated method stub
		System.out.println("탱크: 탱크모드");
	}

}
