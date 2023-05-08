
package ejercicio2;

	/**
	 * 	Clase Padre Persona:
	 * 
	 * 	Clase Alumno hija de persona
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see Persona
	 *@date 28 abr. 2020
	 */


public class Alumno extends Persona {

	/**
	 * Atributos numMatricula, numeroAsignaturas, calificaciones, indice, media 
	 */


	private int numMatricula;
	private int numeroAsignaturas;
	private CalificacionAsignatura[] calificaciones;
	private int indice;//cuantas asignaturas llevas rellenas en el array
	private double media;

	/**
	 * Constructor con todos los parametros:
	 * @param dni de la persona
	 * @param nombre de la persona
	 * @param numMatricula del alumno
	 * @param numeroAsginaturas del alumno
	 * @param calificaciones del alumno
	 * @param indice del alumno
	 */


	public Alumno(String dni, String nombre, int numMatricula,
			int numeroAsignaturas) {
		this.dni = dni;
		this.nombre = nombre;
		this.numMatricula = numMatricula;
		this.numeroAsignaturas = numeroAsignaturas;
		this.calificaciones = new CalificacionAsignatura[numeroAsignaturas];
		this.indice=0;

	}

	/**
	 * Gets el getDni.
	 *
	 * @return el getDni
	 */

	public String getDni() {
		return dni;

	/**
	 * Sets el getDni.
	 *
	 * @param dni nuevo getDni
	 */
		
	}
	public void setDni(String dni) {
		this.dni = dni;

	/**
	 * Gets el getNombre.
	 *
	 * @return el getNombre
	 */	

	}
	public String getNombre() {
		return nombre;
	
	/**
	* Sets el getNombre.
	*
	* @return nombre nuevo getNombre
	*/		
			
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	/**
	* Gets el NumMatricula.
	*
	* @return el NumMatricula
	*/		
		
	}
	public int getNumMatricula() {
		return numMatricula;
		
	/**
	* Sets el NumMatricula.
	*
	* @return NumMatricula nueva NumMatricula
	*/			
			
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	/**
	* Gets el NumeroAsignaturas.
	*
	* @return el NumeroAsignaturas
	*/		

	public int getNumeroAsignaturas(){
		return numeroAsignaturas;	
		
	/**
	* Sets el NumeroAsignaturas.
	*
	* @return NumeroAsignaturas nuevo NumeroAsignaturas
	*/		
		
	}
	public void setNumeroAsignaturas(int numeroAsignaturas) {
		this.numeroAsignaturas = numeroAsignaturas;
	}
	
	/**
	 * insertarCalificacion.
	 *
	 * @param CalificacionAsignatura la Calificacion, introduce una calificacion en el array de calificaciones. 
	 * @return colocado
	 */

	public boolean insertarCalificacion(CalificacionAsignatura calificacion){
		boolean colocado=false;
		if(indice < numeroAsignaturas){
			calificaciones[indice]=calificacion;
			indice++;
			colocado=true;
		}
		return colocado;	
	}
	
	/**
	 * CalificacionAsignatura.
	 *
	 *Devuelve las calificaciones del alumno.
	 * @return getCalificaciones
	 */

	public CalificacionAsignatura[] obtenerCalificacion(){
		return calificaciones;
	}
	
	/**
	 * calcularmedia.
	 *
	 *Devuelve la  media de las calificaciones del alumno .
	 * @return media
	 */

	public double calcularMedia(){
		double suma=0;
		for (int i = 0; i < indice; i++) {		
			suma+=calificaciones[i].getCalificacion();
		}
		media=suma/indice;
		return media;
	}

}
