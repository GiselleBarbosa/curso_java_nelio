// Uma operadora de telefonia cobra R$ 50,00 por um plano basico que da direto a 100 min de ligações;
// Cada minuto excedido destra franquia, sofre incidencia de tarifa de R$ 2,00.
// Crie um programa que receba a quantidade de minutos que o cliente consumiu e exiba o valor a ser pago.
package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Operadores_atribuicao_acumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int minutosUtilizados = scanner.nextInt();

		double conta = 50.0;

		if (minutosUtilizados > 100) {
			conta = conta + (minutosUtilizados - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %2.2f%n", conta);
		scanner.close();

	}

}
