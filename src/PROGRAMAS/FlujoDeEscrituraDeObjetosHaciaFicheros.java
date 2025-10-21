package PROGRAMAS;


import java.io.*;
import java.util.Scanner;

public class FlujoDeEscrituraDeObjetosHaciaFicheros {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la ruta del fichero donde vas a escribir objetos:");
		String ruta = leer.next();
		
		File fichero = new File(ruta);
		FileOutputStream flujoSalida = null;
		try {
			flujoSalida = new FileOutputStream(fichero,false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream flujoObjetoSalida = null;
		try {
			flujoObjetoSalida = new ObjectOutputStream(flujoSalida);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Introduce le nombre:");
		String nombre = leer.next();
		System.out.println("Introduce la edad:");
		int edad = leer.nextInt();
		System.out.println("Introduce el estado(true/false):");
		boolean estado = leer.nextBoolean();
		System.out.println("Introduce el sueldo:");
		double sueldo = leer.nextDouble();
		
		ClaseParaTrabajarConFlujosDeObjetos persona1 = new ClaseParaTrabajarConFlujosDeObjetos(nombre,edad,estado,sueldo);
		
		try {
			flujoObjetoSalida.writeObject(persona1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			flujoObjetoSalida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			flujoSalida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leer.close();
		System.out.println("Fin del programa.");
	}

}
