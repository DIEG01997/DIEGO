package APUNTES;

import java.io.File;
/*
 * 1. Mostrar la ruta absoluta de la carpeta actual.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		File fichero = new File("Ejercicio1.java");
		System.out.println(fichero.getAbsolutePath());
		
	}

}
