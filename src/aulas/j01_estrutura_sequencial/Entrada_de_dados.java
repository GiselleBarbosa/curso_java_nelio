package aulas.j01_estrutura_sequencial;

// import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {
	public static void main(String[] args) {		
		/* 
		 * // String valorSalvo; // int valorSalvo; // double valorSalvo; char
		 * valorSalvo;
		 * 
		 * // valorSalvo = scanner.next(); // next para entrada de string //valorSalvo =
		 * scanner.nextInt(); // next para entrada de numeros inteiros valorSalvo =
		 * scanner.next().charAt(0); // next para entrada de numeros decimais
		 * 
		 * // System.out.println("Você digitou: " + valorSalvo); // saida >> 2.5
		 * 
		 * System.out.printf("Você digitou: " + valorSalvo); // saida >> 2,5
		 * 
		 * // apos importar o Locale a saida de 2,5 foi >> 2.5
		*/	
		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * String x; int y; double z;
		 * 
		 * x = scanner.next(); y = scanner.nextInt(); z = scanner.nextDouble();
		 * 
		 * System.out.println("Você digitou: "); System.out.println(x);
		 * System.out.println(y); System.out.println(z);
		 * 
		 * scanner.close();
		 */				
	
		 // IMPORTANTE
		 // next() serve para ler apenas uma palavra enquanto nextLine() a linha inteira
			/*
			 * Quando você usa um comando de leitura diferente do nextLine() 
			 * e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão
			 * 
			 * Se você então fizer um nextLine(), 
			 * aquela quebra de linha pendente será absorvida pelo nextLine(). 
			 * 
			 * Solução:
			 * Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.
			 */
		
		 Scanner sc = new Scanner(System.in);
		 
		 int x;
		 
		 String s1, s2, s3;
		 
		 x = sc.nextInt();
		 
		 sc.nextLine();
		 
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 s3 = sc.nextLine();
		 
		 System.out.println("DADOS DIGITADOS: ");
		 System.out.println(x);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 sc.close();
			
	} 
}
