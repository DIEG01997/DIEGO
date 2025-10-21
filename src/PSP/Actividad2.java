package PSP;

import java.io.*;

public class Actividad2 {


	public static void main(String[] args) {
		try {
			Process proceso = Runtime.getRuntime().exec("java --version");
			File fichero = new File("programa.txt");
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
			System.out.println("El Código de salida se guardó en el fichero 'programa.txt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			

	}
	}}

