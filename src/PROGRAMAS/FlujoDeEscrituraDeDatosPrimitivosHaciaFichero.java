package PROGRAMAS;
import java.io.*;
import java.util.Scanner;
public class FlujoDeEscrituraDeDatosPrimitivosHaciaFichero {

	public static void main(String[] args) {



			Scanner leer = new Scanner(System.in);
			String datos;
			
			System.out.println("Introduce la ruta del fichero en el que quieres escribir:");
			String ruta = leer.next();
			File fichero = new File(ruta);
			
			
			try {
			FileOutputStream flujoSalida = new FileOutputStream(fichero,false);
			try (DataOutputStream flujoDatosSalida = new DataOutputStream(flujoSalida)) {
				System.out.println("Introduce los datos a escribir en el fichero:(pulsa salir para terminar)");
				datos = leer.next();

				do {
					try {
					System.out.println("Introduce los datos a escribir en el fichero:(pulsa salir para terminar)");
					flujoDatosSalida.writeUTF(datos);
					datos = leer.next();

					}catch(EOFException e){
						
						break;
					}
				} while(!datos.equals("salir"));
			}
			
			
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			leer.close();
			System.out.println("Fin del programa.");
	}

	}

