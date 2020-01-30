package principal;

import java.util.Locale;
import java.util.Scanner;

import entidade.CalculaBigDecimal;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor double muito grande: ");
		double valor = sc.nextDouble();
		
		CalculaBigDecimal cbd = new CalculaBigDecimal(valor);
		
		System.out.println("Apresentado 10%: " + cbd.calculaBigDecimal(valor));
		
		
		
		System.out.println("Apresentado em Formato Monetário: " + cbd.formataEmMonetario());

		
		
		sc.close();
		

	}

}
