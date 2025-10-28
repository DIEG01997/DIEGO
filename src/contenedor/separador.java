package contenedor;

import java.io.File;

public class separador {

	public static void main(String[] args) {
		
		File fichero = new File("C:"+File.separator+"AccesoDatos"+File.separator+"documento1.txt");
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		System.out.println(fichero);
		

		
	}

}
