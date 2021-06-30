/*
 * El progama es un menu con opciones numericos. Se seleccionas distintas partes de una
 * computadora. Se pueden agregar hasta 10 computadoras y luego se imprime la orden
 * mostrando los datos de todas las computadoras ingresadas.
 * 
 * */

package mundopc;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.gm.mundopc.*;

public class MundoPC {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		// Creamos array de objetos necesarios
		Raton ratones[] = new Raton[3];
		Teclado teclados[] = new Teclado[3];
		Monitor monitores[] = new Monitor[3];
		String[] computadoras = {"Windows","Linux","Mac"};
		
		// Cargamos los arrays mediante metodos
		ratones = cargaRatones();
		teclados = cargaTeclados();
		monitores = cargaMonitores();
		
		// Creamos variables para las opciones seleccionadas
		Orden orden = new Orden();
		int opRaton = 1;
		int opTeclado = 1;
		int opMonitor = 1;
		int opComputadora = 1;
		int opcion = 1;
		boolean repetir = true; // Variable para repetir la seleccion en caso de excepcion
		
		// Bucle menu
		do {
			System.out.println("---- Carga de datos de Computadora ----");
			// SELECCION DE RATON
			repetir = true; // La variable toma el valor de true antes de cada seleccion de opciones
			while(repetir) { // While para repetir la pregunta en caso de excepcion o error
				System.out.println("Seleccione Raton: ");
				for(int i=0; i<ratones.length ; i++) { // Se recorre el array y muestra los datos como opciones
					System.out.println("\t["+(i+1)+". "+ratones[i]+"]");
				}
				try {
					opRaton = input.nextInt();
					if(opRaton>0 && opRaton<=ratones.length) { // Si el numero ingresado esta fuera del rango se repite
						repetir = false;
					}else {
						System.out.println("Error, fuera de rango...");
					}
				}catch(InputMismatchException e) { // Tira una excepcion si se ingresa un valor No numerico
					input.nextLine();
					System.out.println("Error, Debe ingresar un numero...");
				}
			}
			
			// SELECCION DE TECLADO
			repetir = true; // La variable toma el valor de true antes de cada seleccion de opciones
			while(repetir) { // While para repetir la pregunta en caso de excepcion o error
				System.out.println("Seleccione Teclado: ");
				for(int i=0; i<teclados.length ; i++) { // Se recorre el array y muestra los datos como opciones
					System.out.println("\t["+(i+1)+". "+teclados[i]+"]");
				}
				try {
					opTeclado = input.nextInt();
					if(opTeclado>0 && opTeclado<=ratones.length) { // Si el numero ingresado esta fuera del rango se repite
						repetir = false;
					}else {
						System.out.println("Error, fuera de rango...");
					}
				}catch(InputMismatchException e) { // Tira una excepcion si se ingresa un valor No numerico
					input.nextLine();
					System.out.println("Error, Debe ingresar un numero...");
				}
			}
			
			// SELECCION DE MONITOR
			repetir = true; // La variable toma el valor de true antes de cada seleccion de opciones
			while(repetir) { // While para repetir la pregunta en caso de excepcion o error
				System.out.println("Seleccione Monitor: ");
				for(int i=0; i<monitores.length ; i++) { // Se recorre el array y muestra los datos como opciones
					System.out.println("\t["+(i+1)+". "+monitores[i]+"]");
				}
				try {
					opMonitor = input.nextInt();
					if(opMonitor>0 && opMonitor<=ratones.length) { // Si el numero ingresado esta fuera del rango se repite
						repetir = false;
					}else {
						System.out.println("Error, fuera de rango...");
					}
				}catch(InputMismatchException e) { // Tira una excepcion si se ingresa un valor No numerico
					input.nextLine();
					System.out.println("Error, Debe ingresar un numero...");
				}
			}
			
			// SELECCION DE COMPUTADORA
			repetir = true; // La variable toma el valor de true antes de cada seleccion de opciones
			while(repetir) { // While para repetir la pregunta en caso de excepcion o error
				System.out.println("Seleccione una computadora:");
				for(int i=0 ; i<computadoras.length ; i++) { // Se recorre el array y muestra los datos como opciones
					System.out.println("\t["+(i+1)+". "+computadoras[i]+"]");
				}
				try {
					opComputadora = input.nextInt();
					if(opComputadora>0 && opComputadora<=ratones.length) { // Si el numero ingresado esta fuera del rango se repite
						repetir = false;
					}else {
						System.out.println("Error, fuera de rango...");
					}
				}catch(InputMismatchException e) { // Tira una excepcion si se ingresa un valor No numerico
					input.nextLine();
					System.out.println("Error, Debe ingresar un numero...");
				}
			}
			
			// Se crea la computadora y se agrega a la orden
			Computadora computadora = new Computadora(computadoras[opComputadora-1], monitores[opMonitor-1], teclados[opTeclado-1], ratones[opRaton-1]);
			orden.agregarComputadora(computadora);
			System.out.println("Computadora agregada a la orden!!");
			
			// OPCIONES PARA SEGUIR AGREGANDO COMPUTADORAS
			repetir = true; // La variable toma el valor de true antes de cada seleccion de opciones
			while(repetir) { // While para repetir la pregunta en caso de excepcion o error
				System.out.println("Desea agregar otra computadora?: [1. Si] - [2. No]");
				try {
					opcion = input.nextInt();
					if(opcion == 1 || opcion == 2) { // Si el numero ingresado esta fuera del rango se repite
						repetir = false;
					}else {
						System.out.println("Error, fuera de rango...");
					}
				}catch(InputMismatchException e) { // Tira una excepcion si se ingresa un valor No numerico
					input.nextLine();
					System.out.println("Error, Debe ingresar un numero...");
				}
			}
			System.out.println("\n\n");
					
		}while(opcion == 1);
		
		// Muestra todas las computadoras de la orden
		System.out.println("====== Datos de la orden ======");
		orden.mostrarOrden();
		
	}
	
	// Metodo que crea tres Teclados y los retorna en un array
	public static Raton[] cargaRatones() {
		Raton[] ratones = new Raton[3];
		Raton raton1 = new Raton("USB 2.0", "Genius");
		Raton raton2 = new Raton("USB 3.0", "Logitech");
		Raton raton3 = new Raton("Bluetooth", "Gamer");
		ratones[0] = raton1;
		ratones[1] = raton2;
		ratones[2] = raton3;
		return ratones;
	}
	
	// Metodo que crea tres Ratones y los retorna en un array
	public static Teclado[] cargaTeclados() {
		Teclado[] teclados = new Teclado[3];
		Teclado teclado1 = new Teclado("USB 2.0", "Genius");
		Teclado teclado2 = new Teclado("USB 3.0", "Logitech");
		Teclado teclado3 = new Teclado("Bluetooth", "Gamer");
		teclados[0] = teclado1;
		teclados[1] = teclado2;
		teclados[2] = teclado3;
		return teclados;
	}
	
	// Metodo que crea tres Monitores y los retorna en un array
	public static Monitor[] cargaMonitores() {
		
		Monitor[] monitores = new Monitor[3];
		
		Monitor monitor1 = new Monitor("HP", 33);
		Monitor monitor2 = new Monitor("RCA", 19);
		Monitor monitor3 = new Monitor("Sony", 27);
		
		monitores[0] = monitor1;
		monitores[1] = monitor2;
		monitores[2] = monitor3;
		
		return monitores;
	}

}
















