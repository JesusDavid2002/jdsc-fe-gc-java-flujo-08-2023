package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un número: ");
		double valor = Double.parseDouble(numero);
		if(valor % 2 == 0) {
			System.out.println("El número " + valor + " es divisible entre 2.");
		}else {
			System.out.println("El número " + valor + " no es divisible entre 2.");
		}
	}

}
