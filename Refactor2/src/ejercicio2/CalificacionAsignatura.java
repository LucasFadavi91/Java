package ejercicio2;

	/**
	 * CalificacionAsignatura clase que utilizamos para calificar al Alumno
	 * y donde definimos la propia Asignatura.
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see Alumno
	 *@date 28 abr. 2020
	 */


public class CalificacionAsignatura {
	
	/**
	 * Atributos indetificadorAsig, nombreAsig, calificacionAsig.
	 */
	
	private int identificadorAsig;
	private String nombreAsig;
	private double calificacionAsig;
	
	/**
	 * Constructor con dos parametros:
	 * @param identificadorAsig de la Asignatura
	 * @param nombreAsig de la Asignatura
	 */
	

	public CalificacionAsignatura(int identificadorAsig, String nombreAsig){
		this.identificadorAsig=identificadorAsig;
		this.nombreAsig=nombreAsig;
		
	}
	
	/**
	 * Gets el getIdentificador.
	 *
	 * @return el getIdentificador
	 */
	
	
	public int getIdentificador(){
		return identificadorAsig;
	}
	
	/**
	 * Gets el getNombre.
	 *
	 * @return el getNombre
	 */	
	
	public String getNombre(){
		return nombreAsig;
	}
	
	/**
	 * Gets la getCalificacion.
	 *
	 * @return la getCalificacion
	 */	
	

	public double getCalificacion(){
		return calificacionAsig;
	}
	
	/**
	 * Sets la setCalificacion.
	 *
	 * @return setCalificacion nueva setCalificacion
	 */	

	public void setCalificacion(double calificacionAsig){
		this.calificacionAsig=calificacionAsig;
	}
}
