package PROGRAMAS;

import java.util.Scanner;
import java.io.*;


public class BufferDeLecturaDeBytesDesdeFichero {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String ruta;
		int enteroByte;
		
		System.out.println(" Introduce la ruta del fichero que quieres leer: ");
		ruta = leer.next();
		
		File fichero = new File(ruta);
		
		try {
			FileInputStream flujoLecturaBytes = new FileInputStream(fichero);
			BufferedInputStream bufferLecturaBytes = new BufferedInputStream(flujoLecturaBytes);

			enteroByte = bufferLecturaBytes.read();
			
			while(enteroByte!=-1) {
				System.out.println((char)enteroByte);
				enteroByte = bufferLecturaBytes.read();

			}
			bufferLecturaBytes.close();
			flujoLecturaBytes.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		leer.close();
		System.out.println(" Fin del programa.");

	}

}
