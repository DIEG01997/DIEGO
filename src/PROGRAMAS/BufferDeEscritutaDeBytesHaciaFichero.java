package PROGRAMAS;

import java.io.*;
import java.util.Scanner;

public class BufferDeEscritutaDeBytesHaciaFichero {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		String ruta;
		int codAscii = 0;
		System.out.println(" Introduce la ruta del fichero binario donde escribir: ");
		ruta = leer.next();
		
		try {
			File fichero = new File(ruta);
			FileOutputStream flujoEscrituraBytes = new FileOutputStream(fichero);
			BufferedOutputStream bufferEscrituraBytes = new BufferedOutputStream(flujoEscrituraBytes);
			
			System.out.println(" Introduce codigo ASCII: ");
			codAscii = leer.nextInt();
			while(codAscii!=-1) {
				flujoEscrituraBytes.write(codAscii);
				System.out.println(" Introduce codigo ASCII: ");
				codAscii = leer.nextInt();
			}
			bufferEscrituraBytes.close();
			flujoEscrituraBytes.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		leer.close();
		System.out.println(" Fin del programa.");
	}

}
