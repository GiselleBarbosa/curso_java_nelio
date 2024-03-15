// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
package exercicios.aula_36;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dia = 24;
		int inicio, termino;
		int duracao;

		inicio = scanner.nextInt();
		termino = scanner.nextInt();

		if (inicio == termino) {
			duracao = 24;
		} else if (inicio < termino) {
			duracao = termino - inicio;
		} else {
			duracao = (dia - inicio) + termino;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

		scanner.close();

	}

}
