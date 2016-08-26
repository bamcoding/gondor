package net.gondor;

public class Track {
	public static void main(String[] args) {
		Car nomal = new Car();
		nomal.go();
		nomal.stop();
		System.out.println("================");
		
		Car fCar = new F1Car();
		fCar.go();
		fCar.turbo();
		fCar.stop();

		
		System.out.println("================");
		nomal.go();
		nomal.stop();
		
	}
}
