// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
// A seguir, calcule e mostre o valor da conta a pagar
package exercicios.aula_36;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int codigo;
		int quantidade;
		double total;

		codigo = scanner.nextInt();
		quantidade = scanner.nextInt();

		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		} else {
			total = 0;
			System.out.println("Nenhum produto válido foi selecionado.");
		}

		System.out.printf("Total: R$ %.2f", total);

		scanner.close();

	}

}
