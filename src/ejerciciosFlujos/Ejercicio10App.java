package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numVentas = JOptionPane.showInputDialog("Introduce el número de ventas: ");
		int valor = Integer.parseInt(numVentas);
		int sumaTotal = 0;
		
		for(int i = 1; i <= valor; i++) {
			String precioVenta = JOptionPane.showInputDialog("Introduce el precio de la " +  i + " venta: ");
			sumaTotal += Integer.parseInt(precioVenta);
		}			
		
		System.out.println(sumaTotal);
	}

}
