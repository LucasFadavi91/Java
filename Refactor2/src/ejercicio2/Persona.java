package ejercicio2;

	/**
	 * 	clase Padre Persona de:
	 * 
	 *  Alumno
	 *  
	 *  Profesor
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see Alumno
	 *@see Profesor
	 *@date 28 abr. 2020
	 */


public class Persona {
	
	/**
	 * Atributos dni, nombre.
	 */

	protected String dni;
	protected String nombre;

	/**
	 * Constructor vacio:
	 * 
	 */
	
	
	public Persona() {
		super();
	}
	
	/**
	 * Gets el getDni.
	 *
	 * @return el getDni
	 */

	
	public String getDni() {
		return dni;
	}
	
	/**
	 * Sets el setDni.
	 *
	 * @param dni nuevo setDni.
	 */

	public void setDni(String dni) {
		this.dni = dni;
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
	* @return setNombre nuevo setNombre
	*/		

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}