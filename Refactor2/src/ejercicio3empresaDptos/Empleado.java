
package ejercicio3empresaDptos;
		

	/**
	 * 	Clase Empleado:
	 *
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */
	

public class Empleado {
		
	/**
	 * Atributos variable final_1_1, codigoEmp, nombre, sueldo. 
	 */

	private static final double _1_1 = 1.1;
	private int codigoEmp;
	private String nombre;
	private double sueldo;
	
	/**Constructor
	 * Creas un nuevo Empleado.
	 *
	 * @param codigoEmp el codigoEmp
	 * @param nombre el nombre
	 * @param sueldo el sueldo
	 */
	
	public Empleado(int codigoEmp, String nombre, double sueldo) {
		this.codigoEmp = codigoEmp;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	/**
	 * Gets el codigoEmp.
	 *
	 * @return el codigoEmp
	 */
	public int getCodigoEmp() {
		return codigoEmp;
	}

	/**
	 * Sets el codigoEmp.
	 *
	 * @param codigoEmp nuevo codigoEmp
	 */
	public void setCodigoEmp(int codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	/**
	 * Gets el getNombre.
	 *
	 * @return el getNombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets el setNombre.
	 *
	 * @param nombre nuevo setNombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets el getSueldo.
	 *
	 * @return el getSueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * Sets el setSueldo.
	 *
	 * @param sueldo nuevo setSueldo
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	/**
	 * IncrementarSueldo.
	 */
	public void incrementarSueldo(){
		
		this.sueldo*=_1_1;
	}

	/**
	 * To string.
	 *
	 * @return el string
	 */
	@Override
	public String toString() {
		return "Empleado [codigoEmp=" + codigoEmp + ", nombre=" + nombre
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	
	

}
