/*
* EXERCICIO (2)
* uri 1002
*  
* Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
* o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = π . raio2 
 
Considere o valor de π = 3.14159 */

package exercicios.aula_29;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_02 {

    public static void main(String[] args) {
    	
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);

        double raio;
        double PI = 3.14159;

        raio = scanner.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
