package net.gondor;

public class F1Car extends Car{
	public F1Car() {
		super.goSound ="부르르릉~~";
		super.stopSound ="끼이이익~~";
		// TODO Auto-generated constructor stub
	}
	@Override
	public void turbo(){
		super.goSound = "부오우웡콰콰코카콰!!!";
		super.stopSound = "지지지직끼이이이익!!~~~";
		super.go();
	}
}
