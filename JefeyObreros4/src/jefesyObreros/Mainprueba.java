package jefesyObreros;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Mainprueba {
	
								

		public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
			
			//Empresa IndusWayne2 = new Empresa();
			
		  //Creacion HashMap
		  

			HashMap <String, Empleado> hashMap1 = new HashMap <String, Empleado>();
		  
		  //Empleados de Industrias Wayne 
		  
	        Empleado emp1,emp2,emp3,emp4,emp5,emp6,emp7;
	        
		emp1 = new Empleado ("Robin", 20,3000, "O1");

	        emp2 = new Empleado ("Gordon", 50, 4000, "O2");

	        emp3 = new Empleado ("Oracle", 28, 5000, "O3");
	        
	        emp4 = new Empleado ("NightWing", 30, 6000, "O4");

	        emp5 = new Empleado ("Batman", 35, 60000, "J1");
	        
	        emp6 = new Empleado ("Alfred", 65, 10000, "J2");
	        
	        emp7 = new Empleado ("AbelFox", 60, 10000, "J3");
	        
	        hashMap1.put(emp1.getCodigoEmp(), emp1);
	        hashMap1.put(emp2.getCodigoEmp(), emp2);
	        hashMap1.put(emp3.getCodigoEmp(), emp3);
	        hashMap1.put(emp4.getCodigoEmp(), emp4);
	        hashMap1.put(emp5.getCodigoEmp(), emp5);
	        hashMap1.put(emp6.getCodigoEmp(), emp6);
	        hashMap1.put(emp7.getCodigoEmp(), emp7);
	        
	        System.out.println("Datos de los empleados: ");
	        
	        Iterator<String> it1=hashMap1.keySet().iterator();
	        
	        while(it1.hasNext()) {
	        	String key=it1.next();
	        	System.out.println("Codigo: "+key+" "+hashMap1.get(key));
	        }
	        
	       
	    
	
				
			entrada.close();			
		}

		
	}
