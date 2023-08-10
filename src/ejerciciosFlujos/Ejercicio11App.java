package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana: ");
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println(dia + " es un día laboral");
				break;
			case "martes":
				System.out.println(dia + " es un día laboral");
				break;
			case "miercoles":
				System.out.println(dia + " es un día laboral");
				break;
			case "jueves":
				System.out.println(dia + " es un día laboral");
				break;
			case "viernes":
				System.out.println(dia + " es un día laboral");
				break;
			case "sabado":
				System.out.println(dia + " no es un día laboral");
				break;
			case "domingo":
				System.out.println(dia + " no es un día laboral");
				break;
			default:
				System.out.println(dia + ", no es un día de la semana");
		}
	}

}
