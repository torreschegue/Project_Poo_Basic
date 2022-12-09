import java.util.Scanner;

import javax.swing.JOptionPane;

public class Figuras_Geometricas {
	
	public static double areaCirculo(double radio) {
		return (Math.pow(radio, 2)*Math.PI);
	}
	
	public static double areaTriangulo(double base, double altura) {
		return ((base*altura)/2);
	}
	
	public static double areaCuadrado(double lado) {
		return (lado*lado);
	}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double resultado=0;
		
		System.out.println("Introduce la Opcion de una Figura:\n"+
							"1.- Circulo\n" +
							"2.- Triangulo \n" + 
							"3.- Cuadrado  \n" + 
							"Elige una Opcion >>>");		
		int elegir = teclado.nextInt();
		
		switch (elegir) {
		case 1:
			System.out.println("Ingresa el radio");
			double radio = teclado.nextDouble();
			resultado = areaCirculo(radio);
			break;
		case 2:
			System.out.println("Ingresa la base");
			double base = teclado.nextDouble();
			System.out.println("Ingresa la altura");
			double altura = teclado.nextDouble();
			resultado = areaTriangulo(base, altura);
			break;
		case 3:
			System.out.println("Ingresa la medida del lado");
			double lado = teclado.nextDouble();
			resultado = areaCuadrado(lado);
			break;
		default:
			System.out.println("Opcion no valida.");
			break;
		}
		
		System.out.println("El Area a calcular es:" + resultado);
		

	}

}
