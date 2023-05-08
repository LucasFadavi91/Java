
package ejercicio3empresaDptos;

import java.util.Scanner;	

	/**
	 * 	Clase Empresa:
	 * 
	 * implementa IEmpresa
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@see IEmpresa
	 *@date 28 abr. 2020
	 */


public class Empresa implements IEmpresa {
	
	/**
	 * Atributos IDepartamento, Scanner entrada. 
	 */
	
	private IDepartamento[] arrayDpto;
	private static Scanner entrada=new Scanner(System.in);
	
	/**Constructor
	 * Creas una nueva empresa con un maximo de 4 departamentos
	 */
	
	public Empresa(){
		arrayDpto=new IDepartamento[4];
	}
	
	
	/**
	 * *********************************ALTA DE DEPARTAMENTO*************************************.
	 * da de alta un departamento
	 */
	
	@Override
	public void alta (){

		System.out.println("Alta de departamento");
		String resp;
		int codDpto, numEmp;
		String nbDpto;
		IDepartamento dptoAux;

		do { //tambi�n se podr�a haber hecho con un for (int i=0; i<4; i++)

			codDpto = introducirCodDpto();
			
			/*Para ver si el departamento est� ya dado de alta en este ejemplo podr�amos preguntar if (arrayDpto[codDpto]!=null) 
			 * o llamar al m�todo buscarDptoCod(codDpto) que devuelve un dpto y luego preguntar si ha devuelto null*/
			dptoAux=buscar(codDpto);
			
			if (dptoAux!=null) 
			
				System.out.println("El departamento ya est� dado de alta "+dptoAux.toString());
			
			else //el departamento no existe
			{
				System.out.println("Introduce nombre de departamento");
				nbDpto=entrada.next();
				//podemos validar tambi�n que no exista el nombre del departamento 
				dptoAux=buscarNb(nbDpto);
				
				if (dptoAux!=null) 
					
					System.out.println("El departamento ya est� dado de alta "+dptoAux.toString());
				
				else //el departamento no existe
				{
				
				System.out.println("Introduce el n�mero de empleados del departamento");
				numEmp=entrada.nextInt();
				dptoAux=new Departamento(codDpto,nbDpto,numEmp);
				insertarDpto(dptoAux);
				
				/*Tambi�n podr�a haberse hecho aqu�:
				 * arrayDpto[codDpto]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto
				System.out.println("Se ha dado de alta el departamento "+dpto.toString());
				*/
				}
			}
			System.out.println("�Deseas dar de alta otro departamento(s/n)");
			resp=entrada.next();

		}

		while (resp.toLowerCase().equals("s"));

	}

	/**
	 * *********************************INTRODUCIR Y VALIDAR  C�DIGO DE DPTO****************************************.
	 * Valida el codigo de un departamento
	 *
	 * @return codDpto
	 */
	@Override
	public int introducirCodDpto() {
		int codDpto;
		do{ //valida que el codigo de departamento sea correcto
			System.out.println("Introduce codigo de departamento (entre 0 y 3)");
			codDpto=entrada.nextInt();
		}
		while (codDpto<0||codDpto>3);
		return codDpto;
	}
	
	/**
	 * buscar.
	 * busca por codigo el departamento
	 *
	 * @param codDpto
	 * @return codDpto
	 */
	@Override
	public IDepartamento buscar(int codDpto){
		return arrayDpto[codDpto];
	}
	
	/**
	 * buscarNb.
	 * busca por nombre el departamento
	 *
	 * @param nbDpto 
	 * @return dptoAux
	 */
	@Override
	public IDepartamento buscarNb(String nbDpto){
		
		boolean encontrado=false;
		IDepartamento dptoAux=null;
		for (int i=0; i<arrayDpto.length&&!encontrado ; i++){
			if (arrayDpto[i]!=null && arrayDpto[i].getNombre().compareTo(nbDpto)==0){
				encontrado=true;
				dptoAux=arrayDpto[i];
				
				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condici�n del for
			}
		}
		return dptoAux;
	}
	
	/**
	 * *********************************INSERTAR DPTO EN EL ARRAY DE DEPARTAMENTOS****************************************.
	 * introduce un departamento dentro del array de departamentos
	 *
	 * @param dpto
	 */
	
	@Override
	public void insertarDpto (IDepartamento dpto){
		arrayDpto[dpto.getCodigoDpto()]=dpto;//guarda el objeto dpto en el array en la posicion que indica codDpto
		System.out.println("Se ha dado de alta el departamento "+dpto.toString());
	}
	
	
	
	/**
	 * **********************************ASIGNAR EMPLEADO AL DPTO*************************************.
	 * introduce un empleado en un departamento concreto
	 */

	@Override
	public void asignarEmpDpto(){
		
		System.out.println("Asignaci�n de un empleado a un departamento");

		String resp;
		int codDpto,codEmp;
		String nombre;
		double sueldo;
		int numeroEmp;
		IDepartamento dptoAux;
		Empleado emp;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a dar de alta un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el n�de empleados del departamento introducido

			do{ //valida que el c�digo de empleado est� comprendido entre 0 y el n�mero m�ximo de empleados del dpto
				System.out.println("Alta del empleado");
				codEmp = introducirCodEmpl(numeroEmp);

				if (dptoAux.buscar(codEmp)!=null)//existe el codigo de empleado
					System.out.println("El empleado ya existe ");

				else {

					System.out.println("Introduce nombre del empleado");
					nombre=entrada.next();
					System.out.println("Introduce sueldo del empleado");
					sueldo=entrada.nextDouble();

					emp=new Empleado(codEmp,nombre,sueldo);
					dptoAux.asignarEmp(emp);//asigna el empleado al dpto

				}

				System.out.println("�Deseas dar de alta otro empleado en el departamento(s/n)");
				resp=entrada.next();
			}

			while (resp.toLowerCase().equals("s"));	
		}


	}

	/**
	 * *********************************INTRODUCIR Y VALIDAR  C�DIGO DE EMPLEADO****************************************.
	 * al introducir un codigo de empleado lo valida
	 *
	 * @param numeroEmp 
	 * @return codEmp
	 */
	@Override
	public int introducirCodEmpl(int numeroEmp) { //recibe el n� m�ximo de empleados del dpto 
		int codEmp;
		do {
			System.out.println("Introduce codigo del empleado (0-"+numeroEmp+")");
			codEmp=entrada.nextInt();
		}
		while (codEmp<0||codEmp>numeroEmp);
		return codEmp;
	}

	/**
	 * **********************************LISTAR DPTO*************************************.
	 * Muestra los datos de un departamento
	 */
		
	@Override
	public void listarDpto(){
		
		int codDpto;
		IDepartamento dptoAux;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
		
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");
		
		else {//existe el dpto
			
			System.out.println(dptoAux.toString());
			dptoAux.visualizarEmp(); 
		
		}
	}
	
	/**
	 * borrar.
	 * borra un departamento siempre que no tenga empleados
	 * 
	 */
	@Override
	public void borrar(){
		
		int codDpto;
		IDepartamento dptoAux;
		String borrar;
		
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
		
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");
		
		else {//existe el dpto
			
			System.out.println(dptoAux.toString());
			System.out.println("�Es este el departamento a borrar (s/n)?");
			borrar=entrada.next();
			if (borrar.equalsIgnoreCase("s"))
				if (dptoAux.verDptoVacio()){
					System.out.println("El departamento se puede borrar porque no tiene empleados");
					bajaDpto(dptoAux);
				}
					
				else{
					System.out.println("Lo sentimos el departamento tiene empleados y no se puede dar de baja");
					dptoAux.visualizarEmp();
				}
		}
	}
	
	/**
	 * *********************************BAJA DE UN DPTO EN EL EMPRESA**************************************.
	 * da de baja un departamento concreto de la empresa
	 *
	 * @param dpto 
	 */
	
	@Override
	public void bajaDpto (IDepartamento dpto){
		arrayDpto[dpto.getCodigoDpto()]=null;//guarda el objeto dpto en el array en la posicion que indica codDpto
		System.out.println("Se ha dado de baja el departamento ");
	}
	
	/**
	 * **********************************BUSCAR UN EMPLEADO EN UN DPTO*************************************.
	 * busca un empleado en un departamento concreto por codigo
	 */
	
	@Override
	public void buscarEmpDptoCod(){
		
		int codDpto, numeroEmp, codEmp;
		IDepartamento dptoAux;
		Empleado emplAux;
		String resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a buscar un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el n�de empleados del departamento introducido

			do{ //valida que el c�digo de empleado est� comprendido entre 0 y el n�mero m�ximo de empleados del dpto
				System.out.println("B�squeda del empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println(emplAux.toString());
					
				}
			System.out.println("�Deseas buscar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
/**
 * **********************************BUSCAR UN EMPLEADO EN UN DPTO  POR NOMBRE*************************************.
 * busca un empleado dentro de un departamento por su nombre
 */
	
	@Override
	public void buscrEmpDptoNombre(){
		
		int codDpto;
		IDepartamento dptoAux;
		Empleado emplAux;
		String nombreAux, resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a buscar un empleado en el departamento "+dptoAux.toString());
			
			

			do{ //valida que el c�digo de empleado est� comprendido entre 0 y el n�mero m�ximo de empleados del dpto
				System.out.println("B�squeda del empleado: Introduzca el nombre ");
				nombreAux=entrada.next();
				emplAux=dptoAux.buscarNb(nombreAux);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println(emplAux.toString());
					
				}
			System.out.println("�Deseas buscar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}

/**
 * **********************************INCREMENTAR SUELDO DE UN EMPLEADO *************************************.
 * incrementa el sueldo de un empleado
 */
	
	@Override
	public void incremSueldoEmpl(){
		
		int codDpto, numeroEmp, codEmp;
		IDepartamento dptoAux;
		Empleado emplAux;
		String resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el n�de empleados del departamento introducido

			do{ //valida que el c�digo de empleado est� comprendido entre 0 y el n�mero m�ximo de empleados del dpto
				System.out.println("Incremento del sueldo de un empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					System.out.println("El empleado cuyo sueldo se va a incrementar es "+emplAux.toString());
					emplAux.incrementarSueldo();
					System.out.println("El nuevo sueldo es ahora "+emplAux.getSueldo());
					
				}
			System.out.println("�Deseas incrementar el sueldo de otro empleado en el departamento(s/n)?");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
/**
 * **********************************BORRAR UN EMPLEADO DE UN DPTO*************************************.
 * borra un empleado de un departamento concreto
 */
	
	@Override
	public void borrarEmpl(){
		
		int codDpto, numeroEmp, codEmp;
		IDepartamento dptoAux;
		Empleado emplAux;
		String borrar, resp;
			
		codDpto = introducirCodDpto();

		dptoAux=buscar(codDpto);
		
		if (dptoAux==null)//no existe el dpto en el array de dpto
			System.out.println("Lo sentimos. No se ha dado de alta este departamento");

		else {//existe el dpto

			System.out.println("Se va a borrar un empleado en el departamento "+dptoAux.toString());
			numeroEmp=dptoAux.getNumeroEmp()-1;
			//guardo el n�de empleados del departamento introducido

			do{ //valida que el c�digo de empleado est� comprendido entre 0 y el n�mero m�ximo de empleados del dpto
				System.out.println("B�squeda del empleado");
				codEmp = introducirCodEmpl(numeroEmp);
				emplAux=dptoAux.buscar(codEmp);
				if (emplAux==null)//existe el codigo de empleado
					System.out.println("El empleado no existe ");

				else {
					
					System.out.println(emplAux.toString());
					System.out.println("�Es este el empleado a borrar (s/n)? ");
					borrar=entrada.next();
					if (borrar.equalsIgnoreCase("s")){
						dptoAux.borrar(emplAux);
						System.out.println("Se ha borrado al empleado");						
					}	
					
				}
			System.out.println("�Deseas borrar otro empleado en el departamento(s/n)");
			resp=entrada.next();
		}
		
		while (resp.toLowerCase().equals("s"));	
			 
		}
	}
	
	/**
	 * *********************************EMPLEADO DE MAYOR SUELDO EN EL DPTO*************************.
	 * devuelve el empleado de mayor sueldo de un departamento
	 */
	
	@Override
	public void mayorSueldoDpto(){

		int codDpto;
		IDepartamento dptoAux;
		String resp;
		
		do{
			codDpto = introducirCodDpto();
	
			dptoAux=buscar(codDpto);
			
			if (dptoAux==null)//no existe el dpto en el array de dpto
			
				System.out.println("Lo sentimos. No se ha dado de alta este departamento");
			
			else {//existe el dpto
				
					System.out.println("Se va a dar a buscar el empleado de mayor sueldo en el departamento "+dptoAux.toString());
					System.out.println("El empleado de mayor sueldo es "+dptoAux.mayorSueldoDpto().toString());
	
				}
				System.out.println("�Deseas buscar en otro departamento(s/n)");
				resp=entrada.next();
			
			}
			while (resp.toLowerCase().equals("s"));	
	}

	/**
	 * *********************************EMPLEADO DE MAYOR SUELDO EN LA EMPRESA*************************.
	 * devuelve el empleado con mayor sueldo de la empresa
	 */
	@Override
	public void mayorSueldo(){
		
		double max=0;
		Empleado empMaxEmpresa=null, empMaxDpto;		
		IDepartamento dpto;
		
		for (int i=0;i<arrayDpto.length;i++){
			if (arrayDpto[i]!=null){
				dpto=arrayDpto[i];
				empMaxDpto=dpto.mayorSueldoDpto();
				if (max<empMaxDpto.getSueldo()){
					max=empMaxDpto.getSueldo();
					empMaxEmpresa=empMaxDpto;
				}
			}			
		}
		System.out.println("El empleado de mayor sueldo de la empresa es "+empMaxEmpresa.toString());
	}
}
	




			
		
		
	
	
	
