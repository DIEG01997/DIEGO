package PROGRAMAS;

import java.io.*;
import java.util.Scanner;

public class FlujoDeLecturaDeDatosPrimitivosDesdeFichero {

	public static void main(String[] args) {

			Scanner leer = new Scanner(System.in);
			String dato;
			
			System.out.println("Introduce la ruta del fichero que quieres leer:");
			String ruta = leer.next();
			File fichero = new File(ruta);
			
			FileInputStream flujoEntrada;
			try {
				flujoEntrada = new FileInputStream(fichero);
				DataInputStream flujoDatosEntrada = new DataInputStream(flujoEntrada);
				
				while(true) {
					try {
						dato = flujoDatosEntrada.readUTF();
						System.out.println(dato);
					}catch (EOFException e) {
						//Se alcanza el final del fichero)
						break;
					}

				}
				flujoDatosEntrada.close();
				flujoEntrada.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			leer.close();
			System.out.println("Fin del programa.");
	}

}
