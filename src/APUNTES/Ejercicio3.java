package APUNTES;

import java.util.Scanner;
import java.io.*;

public class Ejercicio3 {
/*
 * 3. Mostrar el contenido de una carpeta cuya ruta se pide por teclado comprobando que
 * existe y que es una carpeta. Del contenido se debe mostrar el nombre, si es fichero o
 * carpeta, y las propiedades rwx.
 *
 */
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String ruta;
	
		System.out.println(" Introduzca la ruta de un archivo o carpeta: ");
		ruta = leer.next();
		
		File directorio = new File(ruta);
		
		if(directorio.exists()) {
			System.out.printf(directorio.getAbsolutePath() + " Existe. ");
			if(directorio.isDirectory()) {
				System.out.println(" Es una carpeta. ");
				File contenidos[] = directorio.listFiles();
				for(File contenido : contenidos) {
					System.out.println(" "+contenido);
					if(contenido.canRead()) {
						System.out.printf("  r");
					}else {
						System.out.printf("  -");
					}
					if(contenido.canWrite()) {
						System.out.printf("w");
					}else {
						System.out.printf("-");
					}
					if(contenido.canExecute()) {
						System.out.println("x");
					}else {
						System.out.println("-");
					}
				}
			} else {
				System.out.println(" Es un archivo. ");
				if(directorio.canRead()) {
					System.out.printf("  r");
				}else {
					System.out.printf("  -");
				}
				if(directorio.canWrite()) {
					System.out.printf("w");
				}else {
					System.out.printf("-");
				}
				if(directorio.canExecute()) {
					System.out.println("x");
				}else {
					System.out.println("-");
				}
			}
		} else {
			System.out.println(" El directorio no existe. ");
		}
		
		leer.close();
		System.out.println(" Fin del programa.");
	}

}
