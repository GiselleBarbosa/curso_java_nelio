package aulas.j06_orientacao_objeto.utils;

public class Calculator {
	// Adicionado novamente o STATIC e agora nao é mais preciso criar uma instancia
	// da classe para acessar .

	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return (4.0 / 3.0) * PI * Math.pow(radius, 3);
	}

}
