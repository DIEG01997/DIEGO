package PROGRAMAS;

import java.util.Scanner;
import java.io.*;

public class FlujoDeLecturaDesdeFichero {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String rutaFicheroALeer;
		int enteroByte;
		char letra;
		
		System.out.println(" Introduce la ruta del fichero que quieras leer: ");
		rutaFicheroALeer = leer.next();
		
		File fichero = new File(rutaFicheroALeer);
		
		if(fichero.exists()) {
			try {
				
			FileReader flujoLecturaDesdeFichero = new FileReader(fichero);
			enteroByte = flujoLecturaDesdeFichero.read();
			letra = (char)enteroByte;
			while(enteroByte != -1) {
				System.out.print(letra);
				enteroByte = flujoLecturaDesdeFichero.read();
				letra = (char)enteroByte;
			}
			flujoLecturaDesdeFichero.close();
			} catch( Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(" El fichero no existe, por lo tanto no se puede leer.");
		}
		
		leer.close();
		System.out.println(" Fin del programa. ");
			
	}

}
