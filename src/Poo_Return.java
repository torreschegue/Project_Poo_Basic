
public class Poo_Return {
	// Cuando metodo tiene como valor de retorno void
	// este no regresa nada solo ejecuta una opcion
	
	// Cuando el metodo esta definido por con valor de retorno que corresponde
	// a un tipo de dato tiene que devolver una respuesta del mismo

	public void saludar(String Nombre) {
		System.out.println("Bienvenido: " + Nombre);
	}
	
	public String saludo(String nombre) {
		// Todas las variables dentro de un metodo
		// Se le conoce como variable loca
		String saludo = "Bienvenido: " + nombre;
		return saludo;
	}
	
	
	public void datos(String nombre, int edad, char sexo) {
		System.out.println("Tu Nombre es:" + nombre + "\n" +
							"Tienes " + edad + " años  y tu sexo es:" + sexo);
	}
	
	public String dato(String nombre, int edad, char sexo) {
		String dato = "Tu Nombre es:" + nombre + "\n" +
				"Tienes " + edad + " años  y tu sexo es:" + sexo;
		return dato;
	}
	
	
	
	
	public static void main(String[] args) {
		Poo_Return obj = new Poo_Return();
		
		obj.saludar("Omar");
		System.out.println(obj.dato("Ulises", 30, 'M'));
		System.out.println(obj.saludo("Jorge"));
		
		

	}

}
