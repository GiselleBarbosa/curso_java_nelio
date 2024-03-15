/*
* EXERCICIO (1)
* uri 1003
*  
* Faça um programa para ler dois valores inteiros, e depois mostrar
* na tela a soma desses números com uma  mensagem explicativa, conforme exemplos. 
* 	
* Exemplos: 
* Entrada: 10 30
* 
* Saída: SOMA = 40 
*/		

package exercicios.aula_29;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 
		 int valor1;
		 int valor2;
		 
		 valor1 = scanner.nextInt();
		 valor2 = scanner.nextInt();
		 
		 int resultado = (valor1 + valor2);
		 
		 System.out.println("SOMA = " + resultado);
		 scanner.close();

		 
		 
		 
	
		 
		 
		 
		 
		

	}

}
