import java.util.Scanner;

public class MetodosArgumentosParametros {
	/*
	 * PARAMETROS
	 * Los parametros son variables que se declaran dentro de los parentesis
	 * y estos llevan su tipo de dato.
	 * Ejemplo
	 * 
	 * public void suma( int a, int b ){
	 * suma = (a + b);
	 * }
	 * 
	 * Argumentos 
	 * Los Argumentos son los valores de envio cuando el metodo se Invoca
	 * o se manda a llamar
	 * Ejemplo
	 * 1 .- Crear Instancia
	 * Operaciones operacion = new Operaciones();
	 * 
	 * 2.- Invocar el metodo
	 * operacion.suma(1, 3);
	 * 
	 * */
	
	
	public void saludar(String Nombre) {
		System.out.println("Bienvenido: " + Nombre);
	}
	
	public void datos(String nombre, int edad, char sexo) {
		System.out.println("Tu Nombre es:" + nombre + "\n" +
							"Tienes " + edad + " años  y tu sexo es:" + sexo);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad;
		char sexo;
		
		System.out.println("Cual es tu Nombre ?");
		nombre = teclado.next();
		
		System.out.println("Cual es tu edad ?");
		edad = teclado.nextInt();
		
		System.out.println("Cual es tu sexo ? ");
		sexo =  teclado.next().charAt(0);
		
	// Instancia	
	MetodosArgumentosParametros obj = new MetodosArgumentosParametros();
	
	//obj.saludar("Cristian");
	//obj.datos("Antonio", 25, 'M');
	//obj.datos( "Jose", 35, 'F');
	
	obj.datos(nombre, edad, sexo);
	
	}

}
