
public class Coche {
	
	//Atributos -> Variables
	String serie;
	String modelo;
	String marca;
	String color;
	int numerPuerta;
	int velocidades;
	int cilindros;
	int numeroLlantes;
	String tipoRines;
	
	public static void main(String[] args) {
		// Instancia de clase
		// <Nomble_Clase> <Objeto> = new <Nombre_clase>();
		
		// Buena Practica
		Coche coche = new Coche();
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		
		// Mala Practica
		Coche a = new Coche();
		Coche ab = new Coche();
		Coche abc1 = new Coche();
		
		
		coche.serie = "AB2304WL";
		coche.modelo = "Supra";
		coche.marca = "Toyota";
		coche.color = "Azul";
		coche.numerPuerta = 2;
		coche.velocidades = 6;
		coche.cilindros = 6;
		coche.numeroLlantes = 4;
		coche.tipoRines = "Deportivos";
		
		coche2.serie = "EE2604GT";
		coche2.modelo = "Jetta";
		coche2.marca = "Volkswagen";
		coche2.color = "Negro";
		coche2.numerPuerta = 4;
		coche2.velocidades = 6;
		coche2.cilindros = 6;
		coche2.numeroLlantes = 4;
		coche2.tipoRines = "Clasico";
		
		coche3.serie = "HG666JXMX";
		coche3.modelo = "Skyline r34";
		coche3.marca = "Nisssa";
		coche3.color = "Gris";
		coche3.numerPuerta = 2;
		coche3.velocidades = 6;
		coche3.cilindros = 6;
		coche3.numeroLlantes = 4;
		coche3.tipoRines = "Deportivo";
		
		System.out.println("Modelo de tu Coche: " + coche.modelo + "\n"
							+ "Con Numero de Serie: " + coche.serie + ", Tus Rines son:  " + coche.tipoRines);
		System.out.println("Modelo de tu Coche: " + coche2.modelo + "\n"
				+ "Con Numero de Serie: " + coche2.serie + ", Tus Rines son:  " + coche2.tipoRines);
		System.out.println("Modelo de tu Coche: " + coche3.modelo + "\n"
				+ "Con Numero de Serie: " + coche3.serie + ", Tus Rines son:  " + coche3.tipoRines);
		
	}
	
}
