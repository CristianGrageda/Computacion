package com.gm.mundopc;

// Clase padre de los dispositivos de entrada (Raton y Teclado)
public abstract class DispositivoEntrada {
	private String tipoEntrada;
	private String marca;
	
	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	// GETTERS Y SETTERS
	public String getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Tipo de entrada: " + tipoEntrada + ", Marca: " + marca;
	}
	
	
	
}
