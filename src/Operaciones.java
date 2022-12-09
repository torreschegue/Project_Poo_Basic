import javax.swing.JOptionPane;

public class Operaciones {
	
	// Atributos
	//int numero1;
	//int numero2;
	int suma, resta, multiplicacion, division;
	
	// Metodo para leer Datos
	//public void leerDatos() {
		//numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		//numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	//}
	
	// Metodo para sumar
	public void suma(int numero1, int numero2){
		suma = (numero1+numero2);
	}
	
	// Metodo Resta
	public void resta(int numero1, int numero2) {
		resta = (numero1 - numero2);
	}
	
	// Metodo Multiplicar
	public void multiplicar(int numero1, int numero2) {
		multiplicacion = (numero1*numero2);
	}
	
	// Metodo Dividir
	public void divivir(int numero1, int numero2) {
		division = (numero1/numero2);
	}
	
	public void mostrarResultado() {
		System.out.println("Detalle de Operaciones");
		System.out.println("La Suma es: " + this.suma);
		System.out.println("La Resta es: " + this.resta);
		System.out.println("La Multiplicacion es: " + this.multiplicacion);
		System.out.println("La Division es: " + this.division);
	}

	
	

}
