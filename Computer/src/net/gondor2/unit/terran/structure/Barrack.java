package net.gondor2.unit.terran.structure;

import net.gondor2.unit.Bionic;
import net.gondor2.unit.terran.bionic.Firebat;
import net.gondor2.unit.terran.bionic.Ghost;
import net.gondor2.unit.terran.bionic.Marine;
import net.gondor2.unit.terran.bionic.Medic;

public class Barrack {
	public Bionic makeUnit(int type){
		Bionic unit = null;
		if(type==1){
			unit = new Marine();
			System.out.println("마린을 만들었습니다");
		}
		else if(type==2){
			unit = new Firebat();
			System.out.println("파이어벳을 만들었습니다");
		}
		else if(type==3){
			unit = new Medic();
			System.out.println("메딕을 만들었습니다");
		}
		else if(type==4){
			unit = new Ghost();
			System.out.println("고스트를 만들었습니다");
		}
		return  unit;
	}
}
