package gondor;

public class Main {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.printf("*");
			}
			for(int o=0; o<i;o++){
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++){
			for (int j = 0; j <= i+1; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < 4-i; k++) {
				System.out.printf("*");
			}
			for(int o=0; o<3-i;o++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
