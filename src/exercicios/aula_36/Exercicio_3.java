// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente

package exercicios.aula_36;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A;
		int B;

		A = scanner.nextInt();
		B = scanner.nextInt();

		if (A % B == 0 || B % A == 0)
			System.out.println("Sao Multiplos");

		else
			System.out.println("Nao sao Multiplos");

		scanner.close();
	}

}
