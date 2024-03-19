package aulas.j06_orientacao_objeto.application;

import java.util.Locale;
import java.util.Scanner;

import aulas.j06_orientacao_objeto.utils.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		// Removida a instancia de Calculator e adicionada a propria Classe
		System.out.print("Enter radius: ");
		double radius = scanner.nextDouble();

		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		scanner.close();
	}

}
