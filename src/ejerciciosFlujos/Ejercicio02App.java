package ejerciciosFlujos;

import java.util.Scanner;

public class Ejercicio02App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		scanner.close();
		
		System.out.println("Bienvenido " + nombre);
	}

}
