package com.gm.mundopc;

// CLASE HIJA DE DISPOSITIVOENTRADA
public class Raton extends DispositivoEntrada{
	private final int idRaton;
	private static int contadorRaton;
	
	// CONSTRUCTOR
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		// Se crea un id al objeto cuando se instancia la clase
		this.idRaton = ++Raton.contadorRaton;
	}

	// TO STRING
	@Override
	public String toString() {
		return "(Id: "+idRaton+", "+super.toString()+")";
	}
	
	
	
}
