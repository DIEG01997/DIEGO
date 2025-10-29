package APUNTES;

import java.util.Scanner;
import java.io.*;

public class Ejercicio2 {
/*
 * 2. Pedir por teclado una ruta de fichero o carpeta y mostrar si lo que se ha introducido existe,
 * si es un fichero o una carpeta y el tamaño
 */
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String ruta;
		
		System.out.println(" Introduzca la ruta de un archivo o carpeta: ");
		ruta = leer.next();
		
		File directorio = new File(ruta);
		
		if(directorio.isDirectory()) {
			System.out.println(" Es una carpeta. Tamaño: "+directorio.length()+" MB.");
		} else if (directorio.isFile()) {
			System.out.println(" Es un archivo. Tamaño: "+directorio.length()+" MB.");
		} else {
			System.out.println(" El directorio no existe en el sistema de archivos. ");
		}
		
		leer.close();
		System.out.println(" Fin del programa. ");
		
	}

}
