package APUNTES;

import java.io.File;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
			Scanner leer = new Scanner(System.in);
			String nombre;
			
			System.out.println(" Introduce el nombre de la carpeta a crear en la ruta del espacio de trabajo actual: ");
			nombre = leer.next();
			
			File carpeta = new File(nombre);
			
			if(carpeta.exists()) {
				if(carpeta.isDirectory()) {
				System.out.println(" La carpeta ya existe. ");
				} else {
					System.out.println(" El nombre corresponde a un fichero.");
				}
				
			} else {
				carpeta.mkdir();
				System.out.println(" Se ha creado una carpeta en :"+carpeta.getAbsolutePath());				
			}
			
		leer.close();
		System.out.println(" Fin del programa. ");
	}

}
