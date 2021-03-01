package ordenables;

import empleados.Empleadosfijos;
import interfaces2.Ordenable;
import algoritmos.Algoritmos;


public class TestOrdenables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleadosfijos Fer,Noemi,Cletus,Ivness,Diego; 
		
		Noemi=new Empleadosfijos ("Noemi","562278t","63453633",2600); 
		
		Fer=new Empleadosfijos("Fer","353466r","74356353",1300);
		 
		Cletus=new Empleadosfijos("Cletus","11111t","62324525",300);
		 
		Diego=new Empleadosfijos("Diego","21535y","73225435",2500);
		
		Ivness=new Empleadosfijos("Ivness","55535c","63225435",3000);
		
		
		Ordenable [] arrayOrdenables ={Noemi,Fer,Cletus,Ivness,Diego}; 
		
		arrayOrdenables[0]=Noemi;
		arrayOrdenables[1]=Fer;
		arrayOrdenables[2]=Cletus;
		arrayOrdenables[3]=Ivness;
		arrayOrdenables[4]=Diego;
		
		for (int i=0;i<arrayOrdenables.length;i++)
			System.out.println("nombre: "+((Empleadosfijos)arrayOrdenables[i]).getNombre()+" "
					+ "sueldo: "+((Empleadosfijos)arrayOrdenables[i]).calcSalario());
		
		System.out.println();

		Algoritmos.ordenar(arrayOrdenables);
		
		System.out.println();
		
		for (int i=0;i<arrayOrdenables.length;i++)
			System.out.println("nombre: "+((Empleadosfijos)arrayOrdenables[i]).getNombre()+" "
					+ "sueldo: "+((Empleadosfijos)arrayOrdenables[i]).calcSalario());
		System.out.println();
	
		System.out.println("El empleado con sueldo minimo es: "+((Empleadosfijos)Algoritmos.minimo(arrayOrdenables))
				.getNombre()+" Con sueldo: "+((Empleadosfijos)Algoritmos.minimo(arrayOrdenables)).calcSalario());
		System.out.println();
		
		System.out.println("El empleado con sueldo minimo es: "+((Empleadosfijos)Algoritmos.maximo(arrayOrdenables))
				.getNombre()+" Con sueldo: "+((Empleadosfijos)Algoritmos.maximo(arrayOrdenables)).calcSalario());
		
	}
	
}