package Ej5;

public class Ejercicio5App {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 30;
		int D = 40;
		
		System.out.println("Valor inicial de A -> " + A);
		System.out.println("Valor inicial de B -> " + B);
		System.out.println("Valor inicial de C -> " + C);
		System.out.println("Valor inicial de D -> " + D + "\n");

		B = C;
		System.out.println("Valor B -> " + B);
		
		C = A;
		System.out.println("Valor C -> " + C);
		
		A = D;
		System.out.println("Valor A -> " + A);
		
		D = B;
		System.out.println("Valor D -> " + D);

	}

}
