// Fazer um programa para ler um número inteiro, 
// e depois dizer se este número é negativo ou não.

package exercicios.aula_36;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;

		numero = scanner.nextInt();

		if (numero > 0)
			System.out.println("NAO NEGATIVO");
		else
			System.out.println("NEGATIVO");

		scanner.close();
	}

}
