package PROGRAMAS;

import java.io.Serializable;

public class ClaseParaTrabajarConFlujosDeObjetos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String nombre;
	protected int edad;
	protected boolean estado;
	protected double sueldo;
	
	
	
	public ClaseParaTrabajarConFlujosDeObjetos() {
	}



	public ClaseParaTrabajarConFlujosDeObjetos(String nombre, int edad, boolean estado, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.sueldo = sueldo;
	}
	
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public int obtenerEdad() {
		return edad;
	}
	
	public boolean obtenerEstado() {
		return estado;
	}
	
	public double obtenerSueldo() {
		return sueldo;
	}
	

}
