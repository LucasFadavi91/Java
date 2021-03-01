package ejercicioempresa;

import java.util.Arrays;
import java.util.Scanner;


public class Departamento {
	Scanner entrada = new Scanner(System.in);
	
	private int codigoDpto;
	private String nombreDpto;
	private int numeroEmpleados;
	Empleado arrayEmpleados[];

	//CONSTRUCTOR
	public Departamento(int codigoDpto, String nombreDpto, int numeroEmpleados) {
		this.codigoDpto = codigoDpto;
		this.nombreDpto = nombreDpto;
		this.numeroEmpleados = numeroEmpleados;
		this.arrayEmpleados = new Empleado[numeroEmpleados];
	}
	
	//METODOS
	
	
	public boolean comprobarNumEmpl(int codEmpl){
		boolean mayor=false;
		
		if (arrayEmpleados.length<codEmpl) {
			//System.out.println("Error: El CodigoEmpl no puede ser mayor que el numero de emps del dpto");
			return mayor=true;}
		else
			return mayor=false;

	}
	
	// METODO BUSCAR EMPLEADO
	public Empleado buscarEmpl(int codigoEmpl){
		return arrayEmpleados [codigoEmpl];}
	

	
	
	//METODO BUSCAR EMPLEADO POR NOMBRE
	public Empleado buscarEmpNombre(String nombreEmpl) {
		
		Empleado nuevoEmp=null;
		boolean encontrado=false;
		
		//busq. secuencial del nombre en el array
		for (int i = 0; i < arrayEmpleados.length && !encontrado; i++) {
			if(arrayEmpleados[i]!=null && arrayEmpleados[i].getNombreEmp().equalsIgnoreCase(nombreEmpl)) {
				nuevoEmp=arrayEmpleados[i]; //encontrado y paro la busq.
				encontrado=true;
				
			}
		}
		return nuevoEmp;
	}
	
	
	public void insertarEmpl(Empleado nuevoEmpl) {
		int codEmplAux=nuevoEmpl.getCodigoEmp();
		arrayEmpleados[codEmplAux]=nuevoEmpl;
	
	}//Parte del metodo bajaempleado
	public void eliminarEmpleado() {
		
		System.out.println("Introduce el codigo del empleado (Empieza por 0)");
		int codigoEmpl =entrada.nextInt();
		
		if(buscarEmpl(codigoEmpl)==null)
			System.out.println("Error: El empleado no existe (El codigo de estar comprendido entre 0 y el numero de Dptos)");
			else
				arrayEmpleados[codigoEmpl]=null;
	}
	//BUSCAR EMPLEADO MAYOR SUELDO
	public Empleado mostrarEmpMayorsueldo() {
		int i=0;
		double sueldoMaxAux= Integer.MIN_VALUE;
		Empleado empAux = new Empleado();
		
		while (i<arrayEmpleados.length) {
			
			if (arrayEmpleados[i].getSueldo() > sueldoMaxAux) {
				sueldoMaxAux = arrayEmpleados[i].getSueldo();
				empAux = arrayEmpleados[i];
				
				}
			i++;
	}
		
		//System.out.println("El empleado con mayor sueldo del departamento es "+empAux);
		return empAux;
	}
	
	
	//GETs y SETs
	public int getCodigoDpto() {
		return codigoDpto;
	}

/*	public void setCodigoDpto(int codigoDpto) {
		this.codigoDpto = codigoDpto;
	}*/

	public String getNombreDpto() {
		return nombreDpto;
	}

	public void setNombreDpto(String nombreDpto) {
		this.nombreDpto = nombreDpto;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	/*public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;}*/
	

	public Empleado[] getArrayEmpleados() {
		return arrayEmpleados;
	}

	public void setArrayEmpleados(Empleado[] arrayEmpleados) {
		this.arrayEmpleados = arrayEmpleados;
	}

	@Override
	public String toString() {
		return "Departamento [codigoDpto=" + codigoDpto + ", nombreDpto=" + nombreDpto + ", numeroEmpleados="
				+ numeroEmpleados + ", arrayEmpleados=" + Arrays.toString(arrayEmpleados) + "]";
	}

	
	
}
