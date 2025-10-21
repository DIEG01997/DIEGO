package PSP;

public class Actividad1 {

	public static void main(String[] args) {

		try {
			Process proceso = Runtime.getRuntime().exec("ls /home/diurno/Escritorio");
			java.io.BufferedReader lector = new java.io.BufferedReader(
					new java.io.InputStreamReader(proceso.getInputStream()));
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
			lector.close();
			proceso.waitFor();
			System.out.println("Código de salida: " + proceso.exitValue());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
