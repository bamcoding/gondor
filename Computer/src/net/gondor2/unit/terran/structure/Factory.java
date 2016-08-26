package net.gondor2.unit.terran.structure;

import net.gondor2.unit.Mechanic;
import net.gondor2.unit.terran.mechanic.Goliath;
import net.gondor2.unit.terran.mechanic.SiegeTank;
import net.gondor2.unit.terran.mechanic.Virture;

public class Factory {
	public Mechanic makeUnit(int type){
		Mechanic unit = null;
		if(type==1){
			unit = new SiegeTank();
			System.out.println("시즈탱크를 만들었습니다");
		}
		else if(type==2){
			unit = new Goliath();
			System.out.println("골리앗을 만들었습니다");
		}
		else if(type==3){
			unit = new Virture();
			System.out.println("벌쳐를 만들었습니다");
		}
		return  unit;
	}
}
