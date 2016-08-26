package net.gondor2;

import net.gondor2.unit.Unit;
import net.gondor2.unit.bionic.Medical;
import net.gondor2.unit.bionic.Special;
import net.gondor2.unit.bionic.Stimpack;
import net.gondor2.unit.terran.bionic.Firebat;
import net.gondor2.unit.terran.structure.Barrack;

public class Terran {
	public void gameStart(){
		Barrack barrack = new Barrack();
		Stimpack marine =(Stimpack) barrack.makeUnit(1);
		marine.Stimpack();
		marine.attack();
		Stimpack firebat =(Stimpack) barrack.makeUnit(2);
		firebat.Stimpack();
		firebat.attack();
		Medical medic =(Medical) barrack.makeUnit(3);
		medic.attack();
		medic.blind();
		medic.restoration();
		Special ghost =(Special) barrack.makeUnit(4);
		ghost.clocking();
		ghost.lockDown();
		ghost.nuclear();
		
		
	}
	
	public static void main(String[] args) {
		new Terran().gameStart();
		
	}
}
