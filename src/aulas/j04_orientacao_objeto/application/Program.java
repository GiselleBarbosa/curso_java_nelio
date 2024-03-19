package aulas.j04_orientacao_objeto.application;

import java.util.Locale;
import java.util.Scanner;

import aulas.j04_orientacao_objeto.entitys.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite as medidas do triangulo X: ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("MAIOR area: X");
		} else {
			System.out.printf("MAIOR area: Y");
		}

		scanner.close();
	}

}
