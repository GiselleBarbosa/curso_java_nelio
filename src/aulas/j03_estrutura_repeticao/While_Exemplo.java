package aulas.j03_estrutura_repeticao;

import java.util.Scanner;

public class While_exemplo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		int soma = 0;
		while (x != 0) {
			// soma = soma + x;
			soma += x;
			x = scanner.nextInt();
		}

		System.out.println(soma);
		scanner.close();

	}

}
