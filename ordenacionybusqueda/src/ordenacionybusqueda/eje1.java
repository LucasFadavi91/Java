package ordenacionybusqueda;

import java.util.Scanner;

public class eje1 {

	public static void main(String[] args) {

		int[] arrayl = new int[30];
		
		visualizarArray(arrayl);
		ordenarArray(arrayl);
		buscarSecuen(arrayl);
		//buscarSecuenOpti(arrayl);
		//buscarBinaria(arrayl);
		
	}
	
	public static void visualizarArray(int arrayl[]) {	
	
		System.out.println("El array es: ");	
		for (int i = 0; i < arrayl.length; i++) {
			arrayl[i]=(int)(Math.random()*100+1);
				System.out.print(arrayl[i]);
				System.out.println();
			
		}

}
	public static void buscarSecuen(int arrayl[]) {
	
	//Apartado A

	Scanner entrada=new Scanner(System.in);

	int numero;
	int posicion= -1;

	System.out.println("Introduce el numero a buscar de manera secuencial");
	numero=entrada.nextInt();
	

	for (int i = 0; i < arrayl.length; i++) {
		if(arrayl[i]==numero) {
			posicion=i;
			i = arrayl.length;
			
		}	
		entrada.close();
	}
	System.out.println("El numero esta en la posicion " +posicion);
	
	}

	public static void buscarSecuenOpti(int arrayl[]) {
		
		//Apartado C

		Scanner entrada=new Scanner(System.in);

		int numero;
		

		System.out.println("Introduce el numero a buscar de manera secuencial optimizada");
		numero=entrada.nextInt();

		boolean encontrado=false;
		for (int i = 0; i < arrayl.length && !encontrado; i++) {
			if(arrayl[i]==numero) {
				encontrado=true;
				numero=i+1;
				
				}	
			
		}
		
		if (encontrado) 
			System.out.println("Numero encontrado: " +numero);
		
		else 
			System.out.println("Numero no se ha encontrado");
		entrada.close();
	}
	
	//Apartado B
	
	public static void ordenarArray(int arrayl[]) {
		
		int aux;
		
		for (int i = 0; i < arrayl.length-1; i++)
			for (int j = 0; j < arrayl.length; j++) {
				if(arrayl[i]<arrayl[j])
				{
					aux=arrayl[i];
					arrayl[i]=arrayl[j];
					arrayl[j]=aux;
				}
				
			}
		System.out.println("El array ordenado es: ");
		for (int i = 0; i < arrayl.length; i++)
			System.out.println(arrayl[i]);
		
	}
	
	//Apartado D

	public static void buscarBinaria(int arrayl[]) {
		
		Scanner entrada=new Scanner(System.in);



		System.out.println("Introduce el numero a buscar de manera binaria");
		int buscar=entrada.nextInt();


		int limiteSuperior = arrayl.length;
		int mitad = 0;
		int limiteinferior = 0;
		boolean encontrado = false;


		do {

			mitad = (limiteinferior + limiteSuperior) /2;

			if (arrayl[mitad]==buscar) {
				encontrado = true;
				buscar = mitad+1;
			}

			if  (arrayl[mitad]>buscar) 
				limiteSuperior = mitad-1;

			else {
				limiteinferior = mitad+1;
			}

		}while (!encontrado && limiteinferior<=limiteSuperior);


		if (encontrado)
			System.out.println("El numero se ha encontrado en la posicion " + buscar) ;
		else
			System.out.println("El numero no esta en el array");	
		
		entrada.close();
	}
	
}//cierre
