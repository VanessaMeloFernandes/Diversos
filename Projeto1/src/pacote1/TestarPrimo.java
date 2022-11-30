package pacote1;

public class TestarPrimo {

	public static void main(String[] args) {

		int n1 = 100;
		if ((n1 % 2) != 0 || n1 == 2) {
			if ((n1 % 1) == 0 && (n1 % n1) == 0 && n1 != 1) {

				System.out.println("numero primo");

			} else {

				System.out.println("Numero não é primo");
			}
			
			} else {
			System.out.println("Numero não é primo");
		}

	}

}
