package aulas.j02_estrutura_condicional;

import java.util.Scanner;

public class Condicional_ternaria {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 double preco = scanner.nextDouble(); 

		/*
		 * double desconto;
		 * 
		 * if (preco > 100.0) { 
		 * 		desconto = preco * 0.1; 
		 * } 
		 * 
		 * else { 
		 * 		desconto = preco *
		 * 0.05; 
		 * } 
		 */

		// Utilizando ternarios

		double desconto = (preco < 20.0 ? preco * 0.1 : preco * 0.05);
		System.out.println(desconto);

		scanner.close();
	}

}
