package aulas.j05_orientacao_objeto.application;

import java.util.Locale;
import java.util.Scanner;

import aulas.j05_orientacao_objeto.entitys.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scanner.next();
		System.out.print("Price: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be add in stock: ");

		int quantity;
		quantity = scanner.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");

		quantity = scanner.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		scanner.close();
	}

}
