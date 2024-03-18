/*
* EXERCICIO (5)
* uri 1010
Fazer um programa para ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário 
de cada peça 2. Calcule e mostre o valor a ser pago.

*/
package exercicios.aula_29;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantidadePeca1, quantidadePeca2;
		double precoUnitarioPeca1, precoUnitarioPeca2;
		double totalPeca1, totalPeca2;

		quantidadePeca1 = scanner.nextInt();
		precoUnitarioPeca1 = scanner.nextDouble();

		quantidadePeca2 = scanner.nextInt();
		precoUnitarioPeca2 = scanner.nextDouble();

		totalPeca1 = precoUnitarioPeca1 * quantidadePeca1;
		totalPeca2 = precoUnitarioPeca2 * quantidadePeca2;

		double valorTotal = totalPeca1 + totalPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

		scanner.close();
	}
}