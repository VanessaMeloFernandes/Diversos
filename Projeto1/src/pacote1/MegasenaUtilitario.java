package pacote1;

import java.util.Random;

public class MegasenaUtilitario {

	public static int sortearNumero() {

		Random sorteador = new Random();
		int numero = sorteador.nextInt();

		return numero;

	}

}
