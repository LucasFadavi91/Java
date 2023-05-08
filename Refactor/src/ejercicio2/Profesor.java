package ejercicio2;

	/**
	 * 	Clase Padre Persona:
	 * 
	 * 	Clase Profesor hija de persona
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see Persona
	 *@date 28 abr. 2020
	 */
			



public class Profesor extends Persona {
	
	/**
	 * Atributos especialidad, titulacion. 
	 */

	
	private String especialidad;
	private String titulacion;
	
	/**
	 * Constructor con todos los parametros:
	 * @param dni de la persona
	 * @param nombre de la persona
	 * @param especialidad del profesor
	 * @param titulacion del profesor
	 */

	public Profesor(String dni, String nombre, String especialidad,
			String titulacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.titulacion = titulacion;
	}
	
	/**
	 * Gets la Especialidad.
	 *
	 * @return la Especialidad
	 */

	public String getEspecialidad() {
		return especialidad;
		
	/**
	* Sets la getEspecialidad.
	*
	* @return getEspecialidad nueva getEspecialidad
	*/
		
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	
	/**
	* Gets la getTitulacion.
	*
    * @return la getTitulacion
	*/
	
		
	}
	public String getTitulacion() {
		return titulacion;
		
	/**
	* Sets la getTitulacion.
	*
	* @return getTitulacion nueva getTitulacion
	*/
		
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
		
	}
	
	/**
	 * ponerCalificaciones.
	 *
	 *@param Alumno alumno
	 *Introduces un objeto de la clase Alumno y le colocas un asignatura y la 
	 *nota de la misma.
	 * 
	 */
	
	
	public void ponerCalificaciones(Alumno alumno){
		double nota;
		int ident=1;
		for(int i=0;i<alumno.getNumeroAsignaturas();i++){
			nota=Math.random()*10+1;
			CalificacionAsignatura calificacionAsigntura=new CalificacionAsignatura(ident,"asig");
			calificacionAsigntura.setCalificacion(nota);
			boolean colocado=alumno.insertarCalificacion(calificacionAsigntura);
			if(colocado)
				System.out.println("Se ha colocado la asignatura "+ ident +" con nota " + nota );
			ident++;
		}
	}
}
