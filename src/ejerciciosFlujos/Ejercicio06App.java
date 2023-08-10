package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
		
		String numero = JOptionPane.showInputDialog("Introduce el precio del producto: ");
		double valor = Double.parseDouble(numero);
		
		System.out.println("El valor del producto es: " + valor + ", con el IVA añadido sería: " + (valor+(valor*IVA)));
	}

}
