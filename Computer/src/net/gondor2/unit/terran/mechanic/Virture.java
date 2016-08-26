package net.gondor2.unit.terran.mechanic;

import net.gondor2.unit.Mechanic;
import net.gondor2.unit.mechanic.Mine;

public class Virture implements Mine{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 이동합니다");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 정찰합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 멈춤니다");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 기다립니다");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 공격합니다");
	}

	@Override
	public void layUnderTheGroundMine() {
		// TODO Auto-generated method stub
		System.out.println("벌쳐: 지뢰를 매설합니다");
	}
}
