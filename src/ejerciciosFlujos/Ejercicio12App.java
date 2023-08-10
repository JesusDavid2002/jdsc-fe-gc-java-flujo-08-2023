package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio12App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 3; i++) {
			String contra = "123456";
			String contraIntroducida = JOptionPane.showInputDialog("Introduce la contraseña: ");
			if(contraIntroducida.equals(contra)) {
				System.out.println("Enhorabuena");
				break;
			}			
			System.out.println("Incorrecta, intentalo otra vez");
		}		
	}
}
