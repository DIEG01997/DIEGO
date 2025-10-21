package PROGRAMAS;

import java.io.*;
import java.util.Scanner;
public class FlujoDeLecturaDeObjetosDesdeFicheros {
 static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la ruta del fichero donde vas a leer objetos:");
		String ruta = leer.next();
		
		File fichero = new File(ruta);
		FileInputStream flujoEntrada = new FileInputStream(fichero);
		ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);
		
		
		
		ClaseParaTrabajarConFlujosDeObjetos persona2 = new ClaseParaTrabajarConFlujosDeObjetos();
		
		persona2 = (ClaseParaTrabajarConFlujosDeObjetos)flujoObjetoEntrada.readObject();
		
		System.out.println("El nombre es: "+persona2.obtenerNombre());		
		System.out.println("El nombre es: "+persona2.obtenerEdad());
		System.out.println("El nombre es: "+persona2.obtenerEstado());
		System.out.println("El nombre es: "+persona2.obtenerSueldo());

		flujoObjetoEntrada.close();
		flujoEntrada.close();
		leer.close();
		System.out.println("Fin del programa.");

	}

}
