package aulas.j04_orientacao_objeto.entitys;

public class Triangulo {
	public double a;
	public double b;
	public double c;

	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
