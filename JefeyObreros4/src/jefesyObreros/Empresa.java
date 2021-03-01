package jefesyObreros;

import java.util.Scanner;
import java.util.Vector;

public class Empresa {

	Scanner  entrada=new Scanner(System.in);

	private Vector<Empleado> empleados;
	
	public Empresa() {
		this.empleados=new Vector<Empleado>();
		
	}

	public Empleado buscarEmpCod(String codEmpAux){

		int posi=0;
		boolean encontrado=false;

		for (int i = 0; i < empleados.size() && !encontrado; i++) {
			if(empleados.get(i).getCodigoEmp().equalsIgnoreCase(codEmpAux)) {
				encontrado=true;
				posi = i;
				break;
			}
		}

		if (encontrado)
			return empleados.get(posi);
		else
			return null; 

	}//Cierre metodo


	public Empleado buscarJefecod(String codJefeAux){

		int posi=0;
		boolean encontrado=false;

		for (int i = 0; i < empleados.size() && !encontrado; i++) {
			if(empleados.get(i) instanceof Jefe) {
				if(empleados.get(i).getCodigoEmp().equalsIgnoreCase(codJefeAux)) {
					encontrado=true;
					posi = i;
					break;
				}
			}
		}
		if (encontrado)
			return (Jefe) empleados.get(posi);
		else
			return null; 

	}//Cierre metodo

	public Empleado buscarObrCod(String codObrAux){

		int posi=0;
		boolean encontrado=false;

		for (int i = 0; i < empleados.size() && !encontrado; i++) {
			if(empleados.get(i) instanceof Obrero) {
				if(empleados.get(i).getCodigoEmp().equalsIgnoreCase(codObrAux)) {
					encontrado=true;
					posi = i;
					break;
				}
			}
		}
		if (encontrado)
			return (Obrero) empleados.get(posi);
		else
			return null; 

	}//Cierre metodo



	public Empleado buscarEmpNom(String nombreJefeAux) {

		int posi=0;
		boolean encontrado=false;

		for (int i = 0; i < empleados.size() && !encontrado; i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(nombreJefeAux)) {
				encontrado=true;
				posi=i;
				break;
			}
		}
		if (encontrado)
			return empleados.get(posi); 
		else
			return null; 

	}//Cierre metodo

	
	public void addEmp(){

		String codJefeAux;
		String empleadoAux;
		String continuar = null;

		boolean valido=false;

		do{
			System.out.println("¿Que tipo de Empleado quieres dar de alta? (Jefe/Obrero)");
			empleadoAux=entrada.next();

			if(empleadoAux.equalsIgnoreCase("Jefe"))
				valido=true;
			else if(empleadoAux.equalsIgnoreCase("Obrero"))
				valido=true;	

		}while(!valido);

		if(empleadoAux.equalsIgnoreCase("Jefe")){

			//Comienza el alta Jefe

			/*
			 * System.out.println("Introduce el codigo del jefe"); codJefeAux =
			 * entrada.next();
			 */
			do {
				System.out.println("Introduce el nombre del Jefe");
				String nombreJefeAux=entrada.next();

				Empleado nuevoJefe = buscarEmpNom(nombreJefeAux);
				if  (nuevoJefe!= null ) {
					System.out.println("Ese nombre ya esta registrado");
					System.out.println("¿Quieres introducir otro Nombre?");
					continuar=entrada.next();
				}
				else{  //aqui creas el empleadoJefe


					System.out.println("Introduce la Edad");
					int edad=entrada.nextInt();

					System.out.println("Introduce el Salario");
					double sueldo=entrada.nextDouble();


					nuevoJefe=new Jefe(nombreJefeAux, edad, sueldo);
					empleados.add(nuevoJefe);
					//inserto el jefe en el ArrayList de empleados
					
					System.out.println();
					System.out.println("El nuevo Jefe ha sido dado de alta...");

					continuar="No";

				}

			}while(continuar.equalsIgnoreCase("Si"));

		}
		else {

		/*	if(empleadoAux.equalsIgnoreCase("Obrero")){*/
				//Esto es lo que hacemos si es un obrero
			
			String nomObrero=null;
			String respuesta=null;
			String respuesta2=null;

			System.out.println("Introduce el nombre del obrero");
			nomObrero = entrada.next();

		
				do {
					
					if(buscarEmpNom(nomObrero)!=null) {
						System.out.println("El nombre ya existe");
						System.out.println("¿Quieres introducir otro nombre?");
						respuesta= entrada.next();
						
						}
					else if (buscarEmpNom(nomObrero)==null){
							
						//aqui creas el empleadoObrero
							System.out.println("Introduce la edad");
							int edad2 = entrada.nextInt();
							System.out.println("Introduce el sueldo");
							double sueldo2 = entrada.nextDouble();
							
							do {
							System.out.println("Introduce el código del jefe");
							codJefeAux = entrada.next();

							
							if (buscarJefecod(codJefeAux) == null) {
								System.out.println("El codigo del Jefe no esta registrado o bien no es un Jefe");
								System.out.println("¿Quieres introducir otro código de Jefe?");
								respuesta2 = entrada.next();
							}
							else {
								
								//Jefe Jefeaux=new Jefe("Peter", 90, 3000, null);
								
								Empleado obreroAux = new Obrero(nomObrero, edad2, sueldo2, (Jefe) buscarJefecod(codJefeAux));
								empleados.add(obreroAux);
								//inserto el Obrero en ArrayList de empleados

								Obrero obrerito=((Obrero) obreroAux);
								// Inserto el obrero en el ArrayList de su Jefe

								//System.out.println(obrerito.toString());
								obrerito.getJefe().getObreros().add(obrerito);
								
								//Jefeaux.getObreros().add((Obrero) obreroAux);
								System.out.println();
								System.out.println("Nuevo Obrero ha sido dado de alta...");
								respuesta2="no";

							}
						} while (respuesta2.equalsIgnoreCase("Si"));
						
					}	
					respuesta="No";
				} while (respuesta.equalsIgnoreCase("Si"));
			}
		
	}//Cierre 1 addEmp

	public void incrementarSueldoEmps(){

		System.out.println("Introduce el porcentaje de subida de sueldo (Entero de 0 a 100)");
		double sueldo=entrada.nextInt();
		double porcentaje=(sueldo/100)+1;

		for (int i = 0; i < empleados.size(); i++) {
			empleados.get(i).setSueldo(empleados.get(i).getSueldo()*porcentaje);
			if (empleados.get(i) instanceof Jefe) //si es un jefe le incrementamos tambien el sueldo en +120
				empleados.get(i).setSueldo(empleados.get(i).getSueldo()+120); 
		}

	}//Cierre 2 Incrementosueldo

	public void listarObrJefe() {

		System.out.println("Introduce el código del jefe");
		String codJefeAux = entrada.next();

		if(buscarJefecod(codJefeAux)!=null) {
			for (int i = 0; i < ((Jefe) buscarJefecod(codJefeAux)).getObreros().size(); i++) {
				System.out.println(((Jefe) buscarJefecod(codJefeAux)).getObreros().get(i).toString());

			}
		}
		else 
			System.out.println("Error: ese codigo no existe");


	}//Cierre 3 ListarobrJefe


	public void mostrarJefeObr() {

		System.out.println("Introduce el código del Obrero");
		String codObrAux = entrada.next();

		if(buscarObrCod(codObrAux)!=null) {
			System.out.println(((Obrero) buscarObrCod(codObrAux)).getJefe().toString()); 

		}
		else 
			System.out.println("El codigo del obrero no existe");	


	}//Cierre 4 mostrarJefeObr


	public void listarLosDatos(){
		
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i)!=null) { 
			System.out.println(empleados.get(i).toString());
			}
		
		else if(empleados.get(i)==null)
			System.out.println("No tienes empleados dados de alta");
			}
		

	}//Cierre 5 listarLosDatos

	public void borrarEmp() {
		
		String codEmpAux=null;
		String contesta=null;
		String contesta2=null;

		do {
			
			System.out.println("Introduce el código del Empleado que quieres borrar");
			codEmpAux = entrada.next();

			if(buscarEmpCod(codEmpAux)!=null) {

				System.out.println("Datos del "+buscarEmpCod(codEmpAux).toString());
				System.out.println();
				System.out.println("¿Estas seguro que quieres dar de baja al empleado?(Si o No)");
				contesta=entrada.next();
				contesta2="No";
			}
			else {
				System.out.println("Error: El codigo del empleado no existe");
				System.out.println("¿Quieres meter otro codigo de empleado?(Si o No)");
				contesta2=entrada.next();}
		
		} while (contesta2.equalsIgnoreCase("Si"));
		
		if (contesta.equalsIgnoreCase("Si")) {


		if(buscarEmpCod(codEmpAux) instanceof Obrero && ((Obrero)buscarObrCod(codEmpAux)).getJefe()!=null){
			for (int i = 0; i < ((Obrero)buscarEmpCod(codEmpAux)).getJefe().getObreros().size(); i++) {
				if (((Obrero)buscarEmpCod(codEmpAux)).getJefe().getObreros().get(i).getCodigo().equalsIgnoreCase(codEmpAux)) 
					((Obrero)buscarEmpCod(codEmpAux)).getJefe().getObreros().remove(i);

			}
			empleados.removeElement(buscarEmpCod(codEmpAux));
			System.out.println("El empleado ha sido dado de baja...");
		}

		if(buscarEmpCod(codEmpAux) instanceof Jefe){
			for (int i = 0; i < ((Jefe)buscarEmpCod(codEmpAux)).getObreros().size(); i++) {
				((Jefe)buscarEmpCod(codEmpAux)).getObreros().get(i).setJefe(null); 
				
			}
			empleados.removeElement(buscarEmpCod(codEmpAux));
			System.out.println("El empleado ha sido dado de baja...");
		}
		contesta="No";
	}
	}//cierre 6 BorrarEmp	
}