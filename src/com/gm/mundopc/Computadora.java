package com.gm.mundopc;

// La clase Computadora necesita de las clases Raton, Teclado y Monitor
public class Computadora {
	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;
	
	// CONSTRUCTOR
	public Computadora() {
		// Se crea un id al objeto cuando se instancia la clase
		this.idComputadora = Computadora.contadorComputadoras++;
		
	}
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	// GETTERS Y SETTERS
	public int getIdComputadora() {
		return idComputadora;
	}
	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Raton getRaton() {
		return raton;
	}
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Computadora:\nId: "+idComputadora+"\nNombre: "+nombre+"\nMonitor: " + monitor
				+ "\nTeclado: " + teclado + "\nRaton: " + raton;
	}
	
	
	
}
