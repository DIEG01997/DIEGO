package PROGRAMAS;


import java.io.*;
import java.util.Scanner;

public class FlujoDeEscrituraDeObjetosHaciaFicheros {

	public static void main(String[] args) throws IOException {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la ruta del fichero donde vas a escribir objetos:");
		String ruta = leer.next();
		
		File fichero = new File(ruta);
		FileOutputStream flujoSalida = new FileOutputStream(fichero,false);
		ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);
		
		System.out.println("Introduce le nombre:");
		String nombre = leer.next();
		System.out.println("Introduce la edad:");
		int edad = leer.nextInt();
		System.out.println("Introduce el estado(true/false):");
		boolean estado = leer.nextBoolean();
		System.out.println("Introduce el sueldo:");
		double sueldo = leer.nextDouble();
		
		ClaseParaTrabajarConFlujosDeObjetos persona1 = new ClaseParaTrabajarConFlujosDeObjetos(nombre,edad,estado,sueldo);
		
		flujoObjetoSalida.writeObject(persona1);
		
		flujoObjetoSalida.close();
		flujoSalida.close();
		leer.close();
		System.out.println("Fin del programa.");
	}

}
