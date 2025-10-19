package PROGRAMAS;

import java.util.Scanner;
import java.io.*;

public class FlujoDeLecturaDeBytesDesdeFichero {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String ruta;
		int enteroByte;
		System.out.println(" Introduce la ruta del fichero a leer: ");
		ruta = leer.next();
		
		try {
			File fichero = new File(ruta);
			FileInputStream flujoLecturaBytes = new FileInputStream(fichero);
			
			enteroByte = flujoLecturaBytes.read();
			while(enteroByte!=-1) {
				System.out.println((char)enteroByte);
				enteroByte = flujoLecturaBytes.read();

			}
			flujoLecturaBytes.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		leer.close();
		System.out.println(" Fin del programa.");
	}

}
