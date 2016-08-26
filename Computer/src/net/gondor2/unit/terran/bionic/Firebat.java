package net.gondor2.unit.terran.bionic;

import net.gondor2.unit.bionic.Stimpack;

public class Firebat implements Stimpack {
	private boolean stimpack;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 고고고~");
		if (stimpack) {
			System.out.println("파이어벳: 빨리빨리!");
			stimpack = false;
		}
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 정지합니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 공격합니다");
		if (stimpack) {
			System.out.println("파이어벳: 공격공격!");
			stimpack = false;
		}
	}

	@Override
	public void Stimpack() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳: 으아아아아앙");
		stimpack = true;
	}

}
