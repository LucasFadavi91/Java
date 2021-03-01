package empleados;

import interfaces2.Ordenable;

public class Mainempleados {

	public static void main(String[] args) {
		
		Empleadosfijos Fer,Noemi;
		
		Empleadosporhoras Cletus,Diego;
		
		Noemi=new Empleadosfijos ("Noemi","562278t","63453633",0); 
		
		Fer=new Empleadosfijos("Fer","353466r","74356353",0);
		 
		Cletus=new Empleadosporhoras("Cletus","11111t","62324525",0);
		 
		Diego=new Empleadosporhoras("Diego","21535y","73225435",0);
		 
		Empleado [] arrayEmp={Fer,Noemi,Cletus,Diego};
		
		//MOSTRAR TRABAJADORES
		visualizarArray(arrayEmp);
		
		if(Noemi.esMenor(Fer))
		System.out.println("El sueldo de "+Noemi+" es menor");
		else
			System.out.println("El sueldo de "+Fer+" es menor");
		
		if(Noemi.esMayor(Fer))
			System.out.println("El sueldo de "+Noemi+" es mayor");
			else
				System.out.println("El sueldo de "+Fer+" es mayor");
		
		
		System.out.println();
		System.out.println("El salario mensual es de :"+Noemi.calcSalario());
		System.out.println();
		System.out.println("Datos Emp : "+Noemi);
		System.out.println();
		System.out.println("El salario por horas es de :"+Cletus.calcSalario());
		System.out.println();
		System.out.println("Datos Emp : "+Cletus);
		
	}	
		
		//METODO VISUALIZAR LOS OBJETOS DEL ARRAY
		public static void visualizarArray(Empleado [] array){
			
			for (int i=0; i<array.length; i++){
				System.out.println(array[i]+" ");
				
			} 
		
	}
		
		

	}


