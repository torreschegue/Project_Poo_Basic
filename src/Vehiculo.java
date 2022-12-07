
public class Vehiculo {
	
	// Atributos
	String serie;
	String modelo;
	String marca;
	String color;
	
	/*
	 * Metodos
	 * Sintaxis del un metodo
	 * 
	 * <Modificador de Acceso> <Valor de Retorno> <Nombre de Metodo> (){
	 * 		tarea 1
	 * 		tarea 2	
	 * }
	 * 
	 * 
	 * */
	
	// El metodo detalleVehiculo es publico y no tiene valor de retorno
	// void -> significa Vacio
	// Public -> se puede tener Acceso desde cualquier clase 
	// private -> solamente se puede acceder en la misma clase
	public void detalleVehiculo() {
		System.out.println("Detalle Veniculo ... !");
		System.out.println("Numero de Serie: " + this.serie);
		System.out.println("Modelo del Vehiculo: " + this.modelo);
		System.out.println("Marca del Vehiculo: " + this.marca);
		System.out.println("Color del Vehiculo: " + this.color);
	}
	
	
	
}
