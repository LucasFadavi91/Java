	
	/**
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */

package ejercicio3empresaDptos;


/**
 * Interface IDepartamento.
 */
public interface IDepartamento {

	/**
	 * Gets el codigoDpto.
	 *
	 * @return el codigoDpto
	 */
	int getCodigoDpto();

	/**
	 * Sets el codigoDpto.
	 *
	 * @param codigoDpto nuevo codigoDpto
	 */
	void setCodigoDpto(int codigoDpto);

	/**
	 * Gets el getNombre.
	 *
	 * @return el getNombre
	 */
	String getNombre();

	/**
	 * Sets el getNombre.
	 *
	 * @param nombre nuevo getNombre
	 */
	void setNombre(String nombre);

	/**
	 * Gets el numeroEmp.
	 *
	 * @return el numeroEmp
	 */
	int getNumeroEmp();

	/**
	 * Sets el numeroEmp.
	 *
	 * @param numeroEmp nuevo numeroEmp
	 */
	void setNumeroEmp(int numeroEmp);

	/**
	 * Gets el arrayEmp.
	 *
	 * @return el arrayEmp
	 */
	Empleado[] getArrayEmp();

	/**
	 * buscar.
	 *
	 * @param codEmp el codEmp
	 * @return el ArrayEmp
	 */
	Empleado buscar(int codEmp);

	/**
	 * buscarNb.
	 *
	 * @param nbEmpl el nbEmpl
	 * @return el codEmp
	 */
	Empleado buscarNb(String nbEmpl);

	/**
	 * asignarEmp.
	 *
	 * @param emp 
	 */
	void asignarEmp(Empleado emp);

	/**
	 * visualizarEmp.
	 */
	void visualizarEmp();

	/**
	 * borrar.
	 *
	 * @param emp 
	 */
	void borrar(Empleado emp);

	/**
	 * verDptoVacio.
	 *
	 * @return true
	 */
	boolean verDptoVacio();

	/**
	 * mayorSueldoDpto.
	 *
	 * @return true or false
	 */
	Empleado mayorSueldoDpto();

	/**
	 * To string.
	 *
	 * @return el string
	 */
	String toString();

}