
package ejercicio3empresaDptos;


	/**
	 * 	Clase Departamento:
	 * 
	 * implementa IDepartamento
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see IDepartamento
	 *@date 28 abr. 2020
	 */

public class Departamento implements IDepartamento {
	
	/**
	 * Atributos codigoDpto, nombre, numeroEmp, arrayEmp.
	 */
	
	
	private int codigoDpto;
	private String nombre;
	private int numeroEmp;
	private Empleado[] arrayEmp;
	
	/**Constructor
	 * Creas un nuevo Departamento.
	 *
	 * @param codigoDpto el codigoDpto
	 * @param nombre el nombre
	 * @param numeroEmp el numeroEmp
	 */
	
	public Departamento(int codigoDpto, String nombre, int numeroEmp) {
		this.codigoDpto = codigoDpto;
		this.nombre = nombre;
		this.numeroEmp = numeroEmp;
		arrayEmp=new Empleado[numeroEmp];
	}

	/**
	 * Gets el getCodigodpto.
	 *
	 * @return el CodigoDpto
	 */
	@Override
	public int getCodigoDpto() {
		return codigoDpto;
	}

	/**
	 * Sets el getCodigodpto.
	 *
	 * @param codigoDpto nuevo getCodigodpto
	 */
	@Override
	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}

	/**
	 * Gets el getNombre.
	 *
	 * @return el getNombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets el getNombre.
	 *
	 * @param nombre nuevo getNombre
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets el numeroEmp.
	 *
	 * @return el numeroEmp
	 */
	@Override
	public int getNumeroEmp() {
		return numeroEmp;
	}

	/**
	 * Sets el NumeroEmp.
	 *
	 * @param numeroEmp nuevo numeroEmp
	 */
	@Override
	public void setNumeroEmp(int numeroEmp) {
		this.numeroEmp = numeroEmp;
	}
	
	
	/**
	 * Gets el arrayEmp.
	 *
	 * @return el arrayEmp
	 */
	@Override
	public Empleado[] getArrayEmp() {
		return arrayEmp;
	}
	
	/**
	 * buscar.
	 *
	 * @param codEmp 
	 * @return el arrayEmp
	 */
	@Override
	public Empleado buscar(int codEmp){		
		return arrayEmp[codEmp];
	}	
	
	/**
	 * buscarNb nbEmpl.
	 *
	 * @param nBEmpl 
	 * @return emplAux
	 */
	@Override
	public Empleado buscarNb(String nbEmpl){
		
		boolean encontrado=false;
		Empleado emplAux=null;
		for (int i=0; i<arrayEmp.length&&!encontrado ; i++){
			if (arrayEmp[i]!=null && arrayEmp[i].getNombre().compareTo(nbEmpl)==0){
				encontrado=true;
				emplAux=arrayEmp[i];				
				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condición del for
			}
		}
		return emplAux;
	}

	/**
	 * asignarEmp.
	 *
	 * @param emp
	 */
	@Override
	public void asignarEmp (Empleado emp){
		
		int codEmp=emp.getCodigoEmp();

		arrayEmp[codEmp]=emp;
		System.out.println("Se ha dado da alta el empleado en el dpto"+emp.toString());
		}
	
	/**
	 * visualizarEmp.
	 */
	@Override
	public void visualizarEmp (){
		
		System.out.println("Datos de los empleados");
		for (int i=0; i<arrayEmp.length;i++){
			if (arrayEmp[i]!=null)
				System.out.println(arrayEmp[i].toString());
		}
	}
	
	/**
	 * borrar.
	 *
	 * @param emp
	 */
	@Override
	public void borrar(Empleado emp){ //se pone a null la componente del array que viene indicada por el codigo de empleado
		arrayEmp[emp.getCodigoEmp()]=null;
	}
	
	/**
	 * verDptoVacio.
	 *
	 * @return false or true,
	 * 
	 */
	@Override
	public boolean verDptoVacio(){
		boolean vacio=true;
		for (int i=0; i<arrayEmp.length && vacio; i++){
			if (arrayEmp[i]!=null) //si encuentra algún empleado distinto de null, es que el dpto no está vacío
				vacio=false;
		}
		return vacio;
	}
	
	
	/**
	 *mayorSueldoDpto.
	 *
	 * @return el empMax
	 */
	@Override
	public Empleado mayorSueldoDpto(){
		Empleado empMax=null;
		double max=0;
		for (int i=0;i<arrayEmp.length; i++){
			if (arrayEmp[i]!=null)
				if (arrayEmp[i].getSueldo()>max){
					max=arrayEmp[i].getSueldo();
					empMax=arrayEmp[i];
				}
		}
		return empMax;
	}

	/**
	 * To string.
	 *
	 * @return el string
	 */
	@Override
	public String toString() {
		return "Departamento [codigoDpto=" + codigoDpto + ", nombre=" + nombre
				+ ", numero de empleados=" + numeroEmp + "]";
	}
	
	
	
	
	
	

}
