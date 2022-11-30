package pacote1;

import java.util.Scanner;

public class TesteTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*** Insira o ano de nascimento ***");
		
		String ano = scan.nextLine();
		int anoInteiro = Integer.parseInt(ano);
		
		System.out.println( "Idade = " + (2022-anoInteiro));
		
		
System.out.println("*** Insira o ano de nascimento ***");
		
		ano = scan.nextLine();
		anoInteiro = Integer.parseInt(ano);
		
		System.out.println( "Idade = " + (2022-anoInteiro));
		
		

	}

}
