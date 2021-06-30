package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitor;
	
	// CONSTRUCTORES
	public Monitor(){
		// Se crea un id al objeto cuando se instancia la clase
		this.idMonitor = ++Monitor.contadorMonitor;
	}
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}
	
	// GETTERS Y SETTERS
	public int getIdMonitor() {
		return idMonitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "(Id: "+this.idMonitor+", Marca: " + this.marca + ", Tamanio: " + this.tamanio+")";
	}
	
	
	
	
}
