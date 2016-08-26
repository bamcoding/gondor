package net.gondor2.unit.terran.bionic;

import net.gondor2.unit.bionic.Stimpack;

public class Marine implements Stimpack{
	private boolean stimpack;
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("마린: 고고고~");
		if(stimpack){
			System.out.println("마린: 빨리빨리!");
			stimpack=false;
		}
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("마린: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린: 정지합니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("마린: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마린: 공격합니다");
		if(stimpack){
			System.out.println("마린: 공격공격!");
			stimpack=false;
		}
	}

	@Override
	public void Stimpack() {
		// TODO Auto-generated method stub
		System.out.println("마린: 으아아아아앙");
		stimpack=true;
	}

}
