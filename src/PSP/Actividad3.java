package PSP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;

public class Actividad3 {

	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("java", "C:\\Users\\dcruz\\git\\PROGRAMACION-1DAM\\src\\unidad4\\Ejercicio10.class");
			pb.inheritIO();
			Process proceso = pb.start();
			File fichero = new File("C:\\AccesoDatos\\programa2.txt");
			Reader flujoEntrada = new InputStreamReader(proceso.getInputStream());
			BufferedReader bufferEntrada = new BufferedReader(flujoEntrada);
			
			
			BufferedWriter bufferSalida = new BufferedWriter(new FileWriter(fichero,true));

			String linea;
			while ((linea = bufferEntrada.readLine()) != null) {
				bufferSalida.write(linea);
				bufferSalida.newLine();
			}
			bufferEntrada.close();
			flujoEntrada.close();
			bufferSalida.close();
		
			proceso.waitFor();
			System.out.println("El Código de salida se guardó en el fichero 'programa2.txt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			

	}
	}

}
