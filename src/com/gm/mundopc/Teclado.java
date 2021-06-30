package com.gm.mundopc;

//CLASE HIJA DE DISPOSITIVOENTRADA
public class Teclado extends DispositivoEntrada{
	private final int idTeclado;
	private static int contadorTeclado;
	
	// CONSTRUCTOR
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		// Se crea un id al objeto cuando se instancia la clase
		this.idTeclado = ++Teclado.contadorTeclado;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "(Id: " + this.idTeclado+", "+super.toString()+")";
	}

}
