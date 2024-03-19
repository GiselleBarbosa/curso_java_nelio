package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Digite as medidas do triangulo X: ");
		xA = scanner.nextDouble();
		xB = scanner.nextDouble();
		xC = scanner.nextDouble();

		System.out.println("Digite as medidas do triangulo Y: ");
		yA = scanner.nextDouble();
		yB = scanner.nextDouble();
		yC = scanner.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("O Triangulo X possui a MAIOR area");
		} else if (areaY > areaX) {
			System.out.printf("O Triangulo Y possui a MAIOR area");
		} else {
			System.out.printf("As areas dos triangulos são IGUAIS");
		}

		scanner.close();
	}

}
