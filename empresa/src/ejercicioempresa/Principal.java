package ejercicioempresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner  entrada=new Scanner(System.in);
		
		Empresa sony=new Empresa();

		//CREACION DEL MENU
		
		System.out.println("Opcion 1: Alta departamento");
		System.out.println("Opcion 2: Dar de alta un empleado");
		System.out.println("Opcion 3: Visualizar Departamento");
		System.out.println("Opcion 4: Buscar un empleado de un departamento por codigo");
		System.out.println("Opcion 5: Buscar empledo por nombre");
		System.out.println("Opcion 6: Incrementar sueldo de un empleado");
		System.out.println("Opcion 7: Dar de baja un empleado");
		System.out.println("Opcion 8: Visualizar mayor sueldo de un empleado en un departamento");
		System.out.println("Opcion 9: Visualizar mayor sueldo de un empleado en toda la empresa");
		
		
		String respuesta;
		
		
	do{
		System.out.println("Selecciona Una opción del menú");
		int option = entrada.nextInt();

			switch (option) {
			
			case 1: //ALTA DPTO
				sony.altaDpto();
				break;
				
			case 2: //ALTA EMP
				sony.altaEmpl();
				break;
				
			case 3: //VISUALIZAR DEPARTAMENTO
				sony.visualizarDpto();
				break;
				
			case 4: //VISUALIZAR EMP POR CODIGO
				sony.visualizarEmpCod();
				break;
				
			case 5: //VISUALIZAR EMP POR NOMBRE
				sony.visualizarEmpNomCod();
				break;
			case 6: //INCREMENTAR SUELDO
				sony.modificarSueldo();
				break;
			case 7: //BAJA EMPLEADO
				sony.bajaEmpl();
				break;	
			case 8: //VISUALIZAR MAYOR SUELDO DPTO
				sony.VisualizarMayorSueldoDpto();
				break;	
			case 9: //VISUALIZAR MAYOR SUELDO EMPRESA
				sony.visualizarMayorSueldoEmpresa();
				break;		
			
			default:
				System.out.println("Opcion Incorrecta");
				break;}
			
	
		//}while(option>=1 && option <=5);
		
		System.out.println("SI o NO ¿Quieres seleccionar otra opción del menu?");
		respuesta=entrada.next();
		
	}while(respuesta.equalsIgnoreCase("Si"));
	
	entrada.close();
		
	}
	
}
