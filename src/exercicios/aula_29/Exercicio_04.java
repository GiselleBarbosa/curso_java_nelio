/*
* EXERCICIO (4)
* uri 1008

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. 
* 	
 Entrada: 
 25 
 100 
 5.50  
 
Saída: 	NUMBER = 25 
		SALARY = U$ 550.00
*/		

package exercicios.aula_29;

import java.util.Scanner;

import java.util.Locale;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
        int NUMBER;
        int HORAS;
        
        double SALARY_HORA;
        
        double SALARY;        
        
        NUMBER = scanner.nextInt();
        HORAS = scanner.nextInt();
        SALARY_HORA = scanner.nextDouble();
        
        SALARY =  HORAS *  SALARY_HORA ;
                     
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f" , SALARY);
        
        scanner.close();

	}

}
