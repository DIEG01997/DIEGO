package PROGRAMAS;

import java.util.Scanner;
import java.io.*;

public class FlujoDeLecturaDeCaracteresDesdeFichero {

	/*
	 * EJERCICIO 1: LECTURA DE CARÁCTERES DESDE UN FICHERO.
	 * 
	 * Un programa trabaja con información en dos sentidos: recibe información de 
	 * entrada (inputs) y devuelve información procesada (outputs). Es útil pensar en 
	 * nuestro programa java como una caja negra que acepta datos, los procesa y devuelve
	 * otros datos como resultado. Existen muchos tipos de datos de entrada y salida, así
	 * como muchas fuentes de origen y destino de los datos. Los inputs que llegan a 
	 * nuestro programa .java proceden de un origen (memoria(ficheros), discos, sensores, interacción
	 * con el usuario, etc) y los outputs se dirigen a un destino (memoria(ficheros), discos, ficheros,
	 * red, etc) tras su salida del programa. Para que haya esta comunicación ORIGEN->PROGRAMA->DESTINO
	 * debe habilitarse un canal por donde circule la información (los datos de input y output). A
	 * estos canales se le denominan flujos o streams. 
	 * 
	 * 	Java ofrece un paquete para poder trabajar con clases que lleve a cabo funciones de 
	 * entrada y salida de datos (input/output) llamada: java.io.*; Entre ellas destaca la 
	 * clase Stream, que es la que permite instanciar objetos que hacen referencia a flujos
	 * de datos. Atendiendo al sentido en el que viaja la información, estableciendo nuestro 
	 * programa .java como referencia, los flujos (streams) pueden clasificarse en dos grupos: 
	 * flujos de entrada y flujos de salida. A su vez, cada uno de estos flujos pueden clasificarse
	 * según el tipo de dato que transfieran: flujos de bytes y flujos de caracteres. Entre todos
	 * los orígenes y destinos posibles que pueden intercambiar información con el programa, 
	 * a nosotros nos va a interesar trabajar con ficheros (memoria). Es decir, trabajaremos
	 * con ficheros como fuente de origen de los datos (inputs) que serán enviados al programa 
	 * .java a través de un flujo de entrada y con ficheros como lugar de destino (guardado)
	 * de los datos (outputs) enviados desde el programa .java a través de un flujo de salida.
	 * 	
	 * 	1.- Streams de entrada de datos (para inputs).
	 * 
	 * 		1.1.- Clase java para crear un flujo de entrada desde fichero para datos expresados
	 * 			  en bytes: FileInputStream (subclase de InputStream).
	 * 
	 * 			  -> Método lectura: .read()
	 * 		
	 * 		1.2.- Clase java para crear un flujo de entrada desde fichero para datos expresados
	 * 			  en caracteres: FileReader (subclase de ImputStreamReader, subclase de Reader).
	 * 
	 * 			  -> Método lectura: .read() (este método devuelve int así que hay que convertir 
	 * 				 la salida a char)
	 * 		
	 *  2.- Streams de salida de datos (para outputs).
	 *  	
	 *  	2.1.- Clase java para crear un flujo de salida hacia fichero para datos expresados
	 * 			  en bytes: FileOutputStream (subclase de OutputStream).
	 * 
	 * 			  -> Método escritura: .write()
	 * 		
	 * 		2.2.- Clase java para crear un flujo de salida hacia fichero para datos expresados
	 * 			  en caracteres: FileWriter (subclase de OutputStreamWriter, subclase de Writer).
	 * 
	 * 			  -> Método escritura: .write()
	 */
	
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		String rutaFicheroALeer;
		//Variable que guardará el entero que devuelve el método .read() 
		int enteroByte;
		//Variable que guardará la conversión a tipo character de la variable 'enteroByte'
		char letra;
		
		//Pedimos la ruta del fichero de caracteres que queremos leer:
		System.out.println(" Introduce la ruta del fichero que quieras leer: ");
		rutaFicheroALeer = leer.next();
		//Creamos el objeto que hace referencia a la ruta del fichero a leer:
		File fichero = new File(rutaFicheroALeer);
		
		//Si existe el fichero se podrá leer
		if(fichero.exists()) {
			try {
			//Creamos el objeto 'flujo de lectura de caracteres desde fichero'
			FileReader flujoLecturaDesdeFichero = new FileReader(fichero);
			//Leemos desde el principio del fichero el primer carácter
			enteroByte = flujoLecturaDesdeFichero.read();
			//Convertimos el valor entero que devuelve el método .read() a char
			letra = (char)enteroByte;
			//Leemos los caracteres del fichero hasta que el método lectura devuelva
			// el valor -1 (significa que no hay nada más que leer)
			while(enteroByte != -1) {
				System.out.print(letra);
				enteroByte = flujoLecturaDesdeFichero.read();
				letra = (char)enteroByte;
			}
			//Cerramos el canal de lectura desde fichero
			flujoLecturaDesdeFichero.close();
			} catch( Exception e) {
				e.printStackTrace();
			}
		} else {
			//Si no existe el fichero se informará al usuario
			System.out.println(" El fichero no existe, por lo tanto no se puede leer.");
		}
		
		leer.close();
		System.out.println(" Fin del programa. ");
			
	}

}
