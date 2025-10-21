package PROGRAMAS;

import java.io.*;
import java.util.Scanner;
public class FlujoDeLecturaDeObjetosDesdeFicheros {
 static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la ruta del fichero donde vas a leer objetos:");
		String ruta = leer.next();
		
		File fichero = new File(ruta);
		FileInputStream flujoEntrada = null;
		try {
			flujoEntrada = new FileInputStream(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream flujoObjetoEntrada = null;
		try {
			flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		ClaseParaTrabajarConFlujosDeObjetos persona2 = new ClaseParaTrabajarConFlujosDeObjetos();
		
		try {
			persona2 = (ClaseParaTrabajarConFlujosDeObjetos)flujoObjetoEntrada.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("El nombre es: "+persona2.obtenerNombre());		
		System.out.println("El nombre es: "+persona2.obtenerEdad());
		System.out.println("El nombre es: "+persona2.obtenerEstado());
		System.out.println("El nombre es: "+persona2.obtenerSueldo());

		try {
			flujoObjetoEntrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			flujoEntrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leer.close();
		System.out.println("Fin del programa.");

	}

}

