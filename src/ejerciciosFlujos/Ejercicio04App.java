package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio = JOptionPane.showInputDialog("Introduce un radio: ");
		double area = Math.pow(Double.parseDouble(radio),2)*Math.PI;
		System.out.println("El área del circulo es: " + area);
	}

}
