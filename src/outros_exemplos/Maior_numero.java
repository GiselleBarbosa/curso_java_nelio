package outros_exemplos;

import java.util.Scanner;

public class Maior_numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 3 números: ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int maior = max(a, b, c);

		mostrarResultado(maior);
		scanner.close();
	}

	public static int max(int num1, int num2, int num3) {

		int auxiliar;
		if (num1 > num2 && num1 > num3) {
			auxiliar = num1;
		} else if (num2 > num3) {
			auxiliar = num2;
		} else {
			auxiliar = num3;
		}
		return auxiliar;
	}

	public static void mostrarResultado(int value) {
		System.out.println("O maior numero é: " + value);
	}
}
