package ejerciciosFlujos;

import javax.swing.JOptionPane;

public class Ejercicio13App {

	private static void calculadoraInversa (String signo, String op1, String op2){
		double operacion;
		switch(signo) {
			case "+":
				operacion = Double.parseDouble(op1) + Double.parseDouble(op2);
				System.out.println(op1 + " + " + op2 + " = " + operacion);
				break;
			case "-":
				operacion = Double.parseDouble(op1) - Double.parseDouble(op2);
				System.out.println(op1 + " - " + op2 + " = " + operacion);
				break;
			case "*":
				operacion = Double.parseDouble(op1) * Double.parseDouble(op2);
				System.out.println(op1 + " * " + op2 + " = " + operacion);
				break;
			case "/":
				operacion = Double.parseDouble(op1) / Double.parseDouble(op2);
				System.out.println(op1 + " / " + op2 + " = " + operacion);
				break;
			case "^":
				operacion = Math.pow(Double.parseDouble(op1), Double.parseDouble(op2));
				System.out.println(op1 + "^" + op2 + " = " + operacion);
				break;
			case "%":
				operacion = Double.parseDouble(op1) % Double.parseDouble(op2);
				System.out.println(op1 + " % " + op2 + " = " + operacion);
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operador1 = JOptionPane.showInputDialog("Introduce el primer operando: ");
		String operador2 = JOptionPane.showInputDialog("Introduce el segundo operando: ");
		String signoOp = JOptionPane.showInputDialog("Introduce el signo de la operación: ");
		
		calculadoraInversa(signoOp, operador1, operador2);
		
	}

}
