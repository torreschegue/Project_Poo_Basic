import java.util.Scanner;

public class AppOperaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		//Instancia
		Operaciones operaciones = new Operaciones();
		// Todo lleva un orden.
		
		// Capturamos Datos
		System.out.println("Ingresa Valor de Numero 1: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingresa Valor de Numero 2: ");
		numero2 = teclado.nextInt();
		
		
		//operaciones.leerDatos();
		operaciones.suma(numero1, numero2);
		operaciones.resta(numero1, numero2);
		operaciones.multiplicar(numero1, numero2);
		operaciones.divivir(numero1, numero2);
		operaciones.mostrarResultado();
		
		
	}

}
