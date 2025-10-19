package PROGRAMAS;

import java.util.Scanner;
import java.io.*;

public class BufferDeLecturaDeCaracteresDesdeFichero {

	public static void main(String[] args) {

			Scanner leer = new Scanner(System.in);
			String ruta;
			String linea;
			
			System.out.println(" Introduce la ruta del fichero que quieres leer: ");
			ruta = leer.next();
			
			File fichero = new File(ruta);
			
			try {
				FileReader flujoLectura = new FileReader(fichero);
				BufferedReader bufferLectura = new BufferedReader(flujoLectura);

				linea = bufferLectura.readLine();
				
				while(linea!=null) {
					System.out.println(linea);
					linea = bufferLectura.readLine();

				}
				bufferLectura.close();
				flujoLectura.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			leer.close();
			System.out.println(" Fin del programa.");
		
	}

}
