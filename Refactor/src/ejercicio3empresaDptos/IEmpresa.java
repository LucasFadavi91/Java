
	 /**
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */

package ejercicio3empresaDptos;

/**
 * Interface IEmpresa.
 */
public interface IEmpresa {

	/**
	 * *********************************ALTA DE DEPARTAMENTO*************************************.
	 */

	void alta();

	/**
	 * *********************************INTRODUCIR Y VALIDAR  CÓDIGO DE DPTO****************************************.
	 *
	 * @return the CodDpto
	 */
	int introducirCodDpto();

	/**
	 * buscar.
	 *
	 * @param codDpto 
	 * @return IDepartamento
	 */
	IDepartamento buscar(int codDpto);

	/**
	 * buscarNb.
	 *
	 * @param nbDpto 
	 * @return the iDepartamento
	 */
	IDepartamento buscarNb(String nbDpto);

	/**
	 * *********************************INSERTAR DPTO EN EL ARRAY DE DEPARTAMENTOS****************************************.
	 *
	 * @param dpto
	 */

	void insertarDpto(IDepartamento dpto);

	/**
	 * **********************************ASIGNAR EMPLEADO AL DPTO*************************************.
	 */

	void asignarEmpDpto();

	/**
	 * *********************************INTRODUCIR Y VALIDAR  CÓDIGO DE EMPLEADO****************************************.
	 *
	 * @param numeroEmp 
	 * @return numeroEmp
	 */
	int introducirCodEmpl(int numeroEmp);

	/**
	 * **********************************LISTAR DPTO*************************************.
	 */

	void listarDpto();

	/**
	 * borrar.
	 */
	void borrar();

	/**
	 * *********************************BAJA DE UN DPTO EN EL EMPRESA**************************************.
	 *
	 * @param dpto 
	 */

	void bajaDpto(IDepartamento dpto);

	/**
	 * **********************************BUSCAR UN EMPLEADO EN UN DPTO*************************************.
	 */

	void buscarEmpDptoCod();

	/**
	 * **********************************BUSCAR UN EMPLEADO EN UN DPTO  POR NOMBRE*************************************.
	 */

	void buscrEmpDptoNombre();

	/**
	 * **********************************INCREMENTAR SUELDO DE UN EMPLEADO *************************************.
	 */

	void incremSueldoEmpl();

	/**
	 * **********************************BORRAR UN EMPLEADO DE UN DPTO*************************************.
	 */

	void borrarEmpl();

	/**
	 * *********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO*************************.
	 */

	void mayorSueldoDpto();

	/**
	 * *********************************EMPLEADO DE MAYOR SUELDO EN LA EMPRESA*************************.
	 */
	void mayorSueldo();

}