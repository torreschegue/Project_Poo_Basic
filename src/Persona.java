
public class Persona {
	
	//Atributos
	String nombre;
	String apellidos;
	int edad = 25;
	String genero;
	String nacionalidad;

	public static void main(String[] args) {
		
		// Instancia de clase
		// <Nomble_Clase> <Objeto> = new <Nombre_clase>();
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		
		persona.nombre = "Juan Jose";
		persona.apellidos = "Perez Nava";
		persona.edad = 18;
		persona.genero = "Binario";
		persona.nacionalidad = "Española";
		
		String salidaPersona = "Nombre: " + persona.nombre + "\n"+ 
								"Apellidos: " + persona.apellidos + "\n"+
								"Edad: " + persona.edad + "\n"+ 
								"Genero: " + persona.genero + "\n"+ 
								"Nacionalidad: " + persona.nacionalidad;
		
		
		
		persona2.nombre = "Pedro";
		persona2.apellidos = "Hernandez Hernadez";
		//persona2.edad = 30;
		persona2.genero = "Hombre";
		persona2.nacionalidad = "Mexicano";
		
		String salidaPersona2 = "Nombre: " + persona2.nombre + "\n"+ 
				"Apellidos: " + persona2.apellidos + "\n"+
				"Edad: " + persona2.edad + "\n"+ 
				"Genero: " + persona2.genero + "\n"+ 
				"Nacionalidad: " + persona2.nacionalidad;
		
		persona3.nombre = "Antonia";
		persona3.apellidos = "Gutierrez Fernandez";
		//persona3.edad = 25;
		persona3.genero = "Mujer";
		persona3.nacionalidad = "Argentina";
		
		String salidaPersona3 = "Nombre: " + persona3.nombre + "\n"+ 
				"Apellidos: " + persona3.apellidos + "\n"+
				"Edad: " + persona3.edad + "\n"+ 
				"Genero: " + persona3.genero + "\n"+ 
				"Nacionalidad: " + persona3.nacionalidad;
		
		System.out.println(salidaPersona);
		System.out.println();
		System.out.println(salidaPersona2);
		System.out.println();
		System.out.println(salidaPersona3);
		
	}

}
