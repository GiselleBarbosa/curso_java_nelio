package aulas;

public class Processamento_dados {

	public static void main(String[] args) {

		int x, y;

		x = 5;

		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		System.out.println();

		// x = 5;
		double z;

		z = 2 * x;

		System.out.println(z);
		System.out.println();
		// -------------------------------------------------------

		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.println(area);

		System.out.println();
		// -------------------------------------------------------

		int num1, num2;
		double resultado;

		num1 = 5;
		num2 = 2;

		// resultado = num1 / num2 ; // dessa forma o resultado seria 2.0 e nao 2.5 que
		// seria o correto
		resultado = (double) num1 / num2; // feito o CASTING para fazer a conversao dos valores
		System.out.println(resultado);

		System.out.println();
		// -------------------------------------------------------

		double n1;
		int n2;

		n1 = 5.0;
		// n2 = n1; // cannot convert from double to int
		n2 = (int) n1; // casting do double para inteiro

		System.out.println(n2);

	}
}
