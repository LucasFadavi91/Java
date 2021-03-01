package jefesyObreros;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		Empresa IndusWayne = new Empresa();
		
		String selecciona;
		
		do{
				int menu;
			
				System.out.println("1. Añadir Empleado");
				System.out.println("2. incrementar Sueldo");
				System.out.println("3. Listar Obreros de un determinado Jefe");
				System.out.println("4. Mostrar el Jefe de un obrero");
				System.out.println("5. Listar los datos de todos los empleados");
				System.out.println("6. Borrar a un Empleado");
				System.out.println();
				System.out.println("Selecciona una opción del menú");
				menu=entrada.nextInt();
			
			switch (menu) {
			
				case 1: 
					IndusWayne.addEmp();
					break;
				case 2:
					IndusWayne.incrementarSueldoEmps();
					break;
				case 3:
					IndusWayne.listarObrJefe();
					break;
				case 4:
					IndusWayne.mostrarJefeObr();
					break;
				case 5:
					IndusWayne.listarLosDatos();
					break;
				case 6:
					IndusWayne.borrarEmp();
					break;
				}
			
			System.out.println();
			System.out.println("SI o NO ¿Quieres seleccionar otra opción del menu?");
			selecciona=entrada.next();
			
			
		} while(selecciona.equalsIgnoreCase("Si"));
			
		entrada.close();			
	}
	
}
