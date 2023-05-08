package ejercicio2;

/**
 *@author Lucas Fadavi Solanilla
 *@version 1.0
 *@date 28 abr. 2020
 */

/**
 * La Clase TestCalificaciones.
 */
public class TestCalificaciones {
	
	/**
	 * El principal.
	 *
	 * 
	 */
	
	public static void main(String[]args){
		
		/**
		 * @param Alumno
		 * @param Profesor
		 *
		 *Creas un nuevo alumno y le pasas por parametro dni, nombre, numero de matricula
		 *y asignaturas
		 *
		 *creas un nuevo profesor le pasas por parametro dni, nombre, asignatura y titulacion
		 *
		 *pruebas metodos de alumno y de su calificacion.
		 * 
		 */
		
		
		Alumno alumno=new Alumno("123456-Y", "Pepe", 12345, 3);
		Profesor prof=new Profesor("45678-P", "Juan", "Matematicas", "Licenciado");
		prof.ponerCalificaciones(alumno);
		CalificacionAsignatura[]cal=alumno.obtenerCalificacion();
		for(int i=0;i<cal.length;i++){
			System.out.println(cal[i].getIdentificador());
			System.out.println(cal[i].getNombre());
			System.out.println(cal[i].getCalificacion());
		}
		System.out.println("Media "+alumno.calcularMedia());
	}
}
