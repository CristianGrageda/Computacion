package com.gm.mundopc;


public class Orden {
	private final int idOrden;
	private Computadora computadoras[]; // Array para agregar computadoras
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 10; // Limite de computadoras
	
	public Orden() {
		// Se crea un id al objeto cuando se instancia la clase
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS]; // Establece tamanio del array
	}
	
	public void agregarComputadora(Computadora computadora) {
		// Cada vez que se agrega una computadora se incrementa en 1 el contadorComputadoras
		// Si se llega al limite de 10 (MAX_COMPUTADORAS) no se agrega y devuelve un mensaje
		if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras] = computadora;
			this.contadorComputadoras++;
		}else {
			System.out.println("No se pueden agregar mas computadoras! Limite: " + Orden.MAX_COMPUTADORAS+" - Cantidad: "+this.computadoras.length);
		}
		
	}
	
	// Imprime la orden con todas las computadoras ingresadas
	public void mostrarOrden() {
		System.out.println("Orden N°"+this.idOrden);
		for(int i=0 ; i<this.contadorComputadoras ; i++) {
			System.out.println(this.computadoras[i] + "\n");
		}
		
	}
}
