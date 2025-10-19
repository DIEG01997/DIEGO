package PROGRAMAS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferDeEscrituraDeCaracteresHaciaFichero {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String ruta;
		String texto;
		
		System.out.println(" Introduce la ruta del fichero en el que quieres escribir: ");
		ruta = leer.next();
		
		File fichero = new File(ruta);
		
		try {
			FileWriter flujoEscritura = new FileWriter(fichero,true);
			BufferedWriter bufferEscritura = new BufferedWriter(flujoEscritura);

			System.out.println(" Introduce un texto: ");
			texto = leer.nextLine();
			
			while(!texto.equals("salir")) {
				leer.nextLine();
				bufferEscritura.write(texto);
				System.out.println("Introduce un texto:");
				texto = leer.nextLine();

			}
			bufferEscritura.close();
			flujoEscritura.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		leer.close();
		System.out.println(" Fin del programa.");
	

	}

}
