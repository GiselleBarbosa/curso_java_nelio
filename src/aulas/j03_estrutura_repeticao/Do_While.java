package aulas.j03_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double temperaturaCelsius = scanner.nextDouble();
			double temperaturaFahrenheit = 9.0 * temperaturaCelsius / 5.0 + 32.0;
			System.out.printf("A temperatura em Farenheint é de: %.1f °F %n", temperaturaFahrenheit);
			System.out.print("Deseja repetir (S/N)? ");
			resposta = scanner.next().charAt(0);
		} while (resposta != 'n');

		scanner.close();

	}

}
