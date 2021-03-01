package ejercicioempresa;

import java.util.Arrays;
import java.util.Scanner;

public class Empresa {
	//Sony
	Scanner entrada=new Scanner(System.in);
	
	private  final int  numDptos=4;
	private Departamento arrayDpto [];

	public Empresa(Departamento[] arrayDpto) {
		this.arrayDpto = arrayDpto;
	}
	
	public Empresa() {
		this.arrayDpto = new Departamento [numDptos];
	}
	
	
	//Metodos Empresa
	
	//METODO ALTA DEPARTAMENTO POR CODIGO: buscando si el cod es null o ya existe el dpto
	public void altaDpto(){

		int codigoDptoaux;
		
		do{
			System.out.println("Introduce el codigo del Departamento (de 1 a 4)");
			codigoDptoaux=entrada.nextInt();
			
		}while(codigoDptoaux<1||codigoDptoaux>4);
		
		Departamento nuevoDep = buscarDpto(codigoDptoaux);
		if  ( buscarDpto(codigoDptoaux)!= null )
			System.out.println("Error: El departamento ya existe");
		else{  //aqui creas el dpto
			//System.out.println("Creando el departamento..."+nuevoDep.toString());
			System.out.println("Creando el departamento...");
			nuevoDpto(codigoDptoaux);}
			
		
			
	}
	//METODO BUSCAR DPTO
	public Departamento buscarDpto(int codigoDptoaux){
		
		return arrayDpto [codigoDptoaux-1];	
	}
	
	//METODO ALTA DPTO  : cuando no existe el dpto utilizamos esto en el metodo altaDpto()
	
	public Departamento nuevoDpto(int codigoDptoaux) {
		//Empleado[] arrayEmpleados;
		System.out.println("Introduce el nombre del Departamento");
		String nombreDpto=entrada.next();
		
		Departamento nuevoDep=buscarDptoNombre(nombreDpto);
		if (nuevoDep!=null)
			System.out.println("El departamento ya existe"+nuevoDep.toString());
		else {
			System.out.println("Introduce el numero de Empleados");
			int numeroEmp=entrada.nextInt();
			nuevoDep=new Departamento(codigoDptoaux, nombreDpto, numeroEmp); // CREACION DEPARTAMENTO
			insertarDpto(nuevoDep);
			//System.out.println("Se procede a insertar el departamento "+nuevoDep.toString());
			System.out.println("Se procede a insertar el departamento ");
		}
	return nuevoDep;
	
	}
	
	//METODO BUSCAR DPTO NOMBRE
	public Departamento buscarDptoNombre(String nombreDptoAux) {
		Departamento nuevoDep=null; boolean encontrado=false;
		//busq. secuencial del nombre en el array
		for (int i = 0; i < arrayDpto.length && !encontrado; i++) {
			if(arrayDpto[i]!=null && arrayDpto[i].getNombreDpto().equalsIgnoreCase(nombreDptoAux)) {
				nuevoDep=arrayDpto[i]; //encontrado y paro la busq.
				encontrado=true;
								
			}		
		}
		
		return nuevoDep;
	}
	
	//METODO INSERTAR
	public void insertarDpto(Departamento nuevoDep) {
		int codDptoAux=nuevoDep.getCodigoDpto();
		arrayDpto[codDptoAux-1]=nuevoDep;
	}
	
	//METODO ALTA EMPLEADO
	public void altaEmpl(){
		int codigoDptoaux;
		
		do{
			System.out.println("Introduce el codigo del Departamento");
			codigoDptoaux=entrada.nextInt();
			
		}while(codigoDptoaux<1||codigoDptoaux>4);
		
		Departamento depAux=buscarDpto(codigoDptoaux); //Creamos auxiliar para buscar datos
		System.out.println("Introduce el codigo del empleado (Empieza por 0)");
		int codigoEmpl =entrada.nextInt();
		depAux.buscarEmpl(codigoEmpl);
		
			if (depAux.buscarEmpl(codigoEmpl)!=null)
				System.out.println("El codigo de empleado ya existe");
			else{
				//System.out.println("Introduce el codigo del empleado"); //estaba mal
				//int codigoEmp=entrada.nextInt(); //estaba mal
			
				depAux.comprobarNumEmpl(codigoEmpl);
			
					if (depAux.comprobarNumEmpl(codigoEmpl)==true)
						System.out.println("Error: El CodigoEmpl no puede ser mayor que el numero de emps del dpto");
					else {
				
						System.out.println("Introduce el nombre del empleado");
						String nombreEmp=entrada.next();
			
						System.out.println("Introduce el Sueldo");
						double sueldo=entrada.nextDouble();
						Empleado nuevoEmpl = new Empleado (codigoEmpl, nombreEmp, sueldo);
		
						depAux.insertarEmpl(nuevoEmpl); }
		
				}
	
		} //cierre metodo altaEmp
	
	//METODO BAJA EMPLEADO
	public void bajaEmpl(){
		/*
		 * int codigoDptoaux; Empresa EmpAux = null;
		 * 
		 * do{ System.out.println("Introduce el codigo del Departamento");
		 * codigoDptoaux=entrada.nextInt();
		 * 
		 * }while(codigoDptoaux<1||codigoDptoaux>4);
		 * 
		 * Departamento depAux=buscarDpto(codigoDptoaux); //Creamos auxiliar para buscar
		 * datos System.out.println("Introduce el codigo del empleado (Empieza por 0)");
		 * int codigoEmpl =entrada.nextInt(); depAux.buscarEmpl(codigoEmpl);
		 * 
		 * if (depAux.buscarEmpl(codigoEmpl)==null) { System.out.
		 * println("Error: El empleado no existe (El codigo de estar comprendido entre 0 y el numero de Dptos)"
		 * ); EmpAux.visualizarEmpNomCod(); } else {
		 * 
		 * 
		 * depAux.comprobarNumEmpl(codigoEmpl);
		 * System.out.println("Empleado encontrado"); }
		 * 
		 * if ((depAux.buscarEmpl(codigoEmpl)!=null)) {
		 * System.out.println("¿Quieres dar de baja al empleado? Si o No");
		 * 
		 * }else if(equalsIgnoreCase("Si"));{
		 * 
		 * Empleado EmplAux = null; } if (equalsIgnoreCase("No"))
		 * System.out.println("No se ha dado de baja al empleado");
		 * 
		 */
		
		 System.out.println("Introduce el codigo del Departamento");
		 int codigoDptoaux=entrada.nextInt();
		 
		 buscarDpto(codigoDptoaux).eliminarEmpleado();
			

	}//cierre metodo BajaaEmp

			
	
	
	//Metodo Visualizar Departamento	
	
	public void visualizarDpto(){
		System.out.println("Introduce un código de departamento que deseas ver");
			int codigoDpto=entrada.nextInt();
		System.out.println( buscarDpto(codigoDpto).toString() );}
	
	
	//METODO VISUALIZAR EMPLEADO POR CODIGO
	public void visualizarEmpCod(){
		
		System.out.println("Introducir codigo dpto");
		int codigoDpto=entrada.nextInt();
	
		System.out.println("introducir codigo Empl");
		int codigoEmp=entrada.nextInt();
		
		if(buscarDpto(codigoDpto).buscarEmpl(codigoEmp)!=null)
		System.out.println( buscarDpto(codigoDpto).buscarEmpl(codigoEmp).toString() );
		else
			System.out.println("El empleado no existe");
		
	}
	
	//Metodo Visualizar empleado por codigo y nombre
	
	public void visualizarEmpNomCod(){
	
		
		System.out.println("Introducir codigo dpto");
		int codigoDpto=entrada.nextInt();
		
		System.out.println("Introducir Nombre Empl");
		String nomEmp=entrada.next();
	
		if(buscarDpto(codigoDpto).buscarEmpNombre(nomEmp)!=null)
		System.out.println( buscarDpto(codigoDpto).buscarEmpNombre(nomEmp).toString() );
		else
			System.out.println("El empleado no existe");
		
	} //cierre visualizarEmpNomCod
	
	//METODO INCREMENTAR SUELDO
	
	public void modificarSueldo(){
		
		System.out.println("Introducir codigo dpto");
		int codigoDpto=entrada.nextInt();
	
		System.out.println("introducir codigo Empl");
		int codigoEmp=entrada.nextInt();
		
		
		System.out.println( buscarDpto(codigoDpto).buscarEmpl(codigoEmp).incrementarSueldo() ); //con esto muestras el nuevo sueldo incrementado
		
		buscarDpto(codigoDpto).buscarEmpl(codigoEmp).setSueldo(buscarDpto(codigoDpto).buscarEmpl(codigoEmp).incrementarSueldo() ); //pero con esto lo estableces
	}
	
	// VISUALIZAR SUELDO MAYOR DPTO
	public void VisualizarMayorSueldoDpto() {
		
		for (int i=0; i<arrayDpto.length; i++) {
			System.out.println("El empleado que más cobra del dpto: "+arrayDpto[i].
					getNombreDpto()+" es: " + arrayDpto[i].mostrarEmpMayorsueldo() );  //la otra parte esta en departamento
				
		} 
		
	} //CIERRE METODO
	
	//METODO PARA VER EL EMPLEADO QUE MAS COBRA DE TODA LA EMPRESA
	
		public void visualizarMayorSueldoEmpresa() {
			
			double sueldoMaxAux= Integer.MIN_VALUE;
			Empleado empAux1 = new Empleado();
			
			for (int i=0; i<arrayDpto.length; i++) {
				arrayDpto[i].mostrarEmpMayorsueldo();  //la otra parte esta en departamentos
				
				if (arrayDpto[i].mostrarEmpMayorsueldo().getSueldo() > sueldoMaxAux) {
					empAux1 = arrayDpto[i].mostrarEmpMayorsueldo();
					sueldoMaxAux=arrayDpto[i].mostrarEmpMayorsueldo().getSueldo(); }
			}
			
			System.out.println("El empleado que mas cobra de toda la empresa es "+empAux1);
			
		}
		


	//GET Y SETS

	public Departamento[] getArrayDpto() {
		return arrayDpto;
	}

	public void setArrayDpto(Departamento[] arrayDpto) {
		this.arrayDpto = arrayDpto;
	}

	public int getNumDptos() {
		return numDptos;
	}

	@Override
	public String toString() {
		return "Empresa [entrada=" + entrada + ", numDptos=" + numDptos + ", arrayDpto=" + Arrays.toString(arrayDpto)
				+ "]";
	}
	
	
	
	
}//CierreClase


