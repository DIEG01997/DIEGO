package PROGRAMAS;


import java.util.Scanner;
import java.io.*;


public class FlujoDeEscrituraDeCaracteresHaciaFichero {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String texto;
		String rutaFicheroAEscribir;
		
		
		//Pedimos la ruta del fichero de caracteres en el que queremos escribir:
		System.out.println(" Introduce la ruta del fichero en el que quieres escribir: ");
		rutaFicheroAEscribir = leer.next();
		//Creamos el objeto que hace referencia a la ruta del fichero a escribir:
		File fichero = new File(rutaFicheroAEscribir);
		
		//Si existe el fichero se podrá añadir información (con true) y si no existe
		//se crea y se escribe
		try {
		//Creamos el objeto 'flujo de escritura de caracteres hacia fichero'
		FileWriter flujoEscrituraHaciaFichero = new FileWriter(fichero,true);
			
		System.out.println(" Introduce un texto: ");
		texto = leer.next();
		while(!texto.equals("salir")) {
			flujoEscrituraHaciaFichero.write(texto);
			leer.nextLine();
			System.out.println(" Introduce un texto: ");
			texto = leer.next();

		}
		
		flujoEscrituraHaciaFichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		leer.close();
		System.out.println(" Fin del programa. ");
		
	}

}
