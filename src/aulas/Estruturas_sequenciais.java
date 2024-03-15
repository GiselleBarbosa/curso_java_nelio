package aulas;

import java.util.Locale;

public class Estruturas_sequenciais {

	public static void main(String[] args) {
		int variavel = 32;

		System.out.println("Hello World Java!!!");

		System.out.print("print NÃO pula uma linha");
		System.out.println("printLN pula uma linha");

		System.out.println("Atalhos teclado ECLIPSE: CTRL + ALT + setas => DUPLICA linha");
		System.out.println("Atalhos teclado ECLIPSE: ALT + setas => MOVE linha");
		System.out.println("Atalhos teclado ECLIPSE: CTRL + i => Indenta o codico");

		System.out.println("Testando o printLN");

		System.out.println(variavel);

		double x = 10.35784;

		// formatando casas decimais
		System.out.println(x);

		System.out.printf("%.2f%n", x); // mascara para 2 casas decimais sem pular linha
		System.out.printf("%.2f%n", x); // para quebra de linha, adicionar \n ou %n
		System.out.printf("%.4f%n", x);
		System.out.println("");
		// Locale.setDefault(Locale.US); // COMENTADO PARA REALIZACAO DO DESAFIO
		System.out.printf("%.4f%n", x); // alterada a localizacao do programa para alterar a virgula por ponto

		// concatenando elementos
		// os marcadores servem para incluirem variaveis e serem adicionados juntamente
		// a outros elementos
		// para cada tipo de dado se usa um marcador diferente

		System.out.println("RESULTADO = " + x + " METROS"); // usando println
		System.out.printf("RESULTADO = %.2f METROS %n%n", x); // usando printf e concatenando variaveis e strings

		String nome = "Maria"; // %s
		int idade = 31; // %d
		double salario = 4000.0;// %.2f
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n%n", nome, idade, salario); // marcadores para cada
																								// tipo
																								// de dado

		// desafio aula - 23
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measue = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f", product2, price2);
		System.out.println();

		System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
		System.out.println();
		System.out.println();

		System.out.printf("Measue: with eight decimal places: %.8f", measue);
		System.out.println();

		System.out.printf("Rouded (three decimal places): %.3f", measue);
		System.out.println();

		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measue);
		System.out.println();
	}
}