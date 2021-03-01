package ejercicio02;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String respuesta;
		int option;
		Gasolinera cepsa = new Gasolinera();
		
	
		do{
		
			System.out.println("1. Llegada de un coche a la gasolinera");
			System.out.println("2. Salida del coche de la gasolinera después de repostar");
			System.out.println("3. Listar datos de los surtidores");
			System.out.println("4. Salir");
			
			System.out.println();
			System.out.println("Introduce una opción del menú");
			option=sc.nextInt();
		
				switch (option) {
		
					case 1: 
						cepsa.addCocheSurtidor(randomizarCoche());
						break;
					case 2:
						cepsa.salidaCocheGasolinera();
						break;
					case 3:
						cepsa.listarDatos();
						break;
				}
		
		System.out.println();
		//System.out.println("¿Quieres elegir otra opción? (Si/No)");
		//respuesta=sc.next();
		
		}while(option!=4);
		//} while(respuesta.equalsIgnoreCase("Si"));
	
		sc.close();
	}
	
	public static Coche randomizarCoche() {
		Coche c1 = new Coche("1000MX", "Ferrari", "F50");
		Coche c2 = new Coche("2000MH", "Renault", "Megane");
		Coche c3 = new Coche("3000MT", "Seat", "Ibiza");
		Coche c4 = new Coche("4000MR", "BMW", "M3");
		Coche c5 = new Coche("5000MY", "Volkswaggen", "Golf");
		Coche c6 = new Coche("5800MY", "Audi", "A5");
		Coche c7 = new Coche("8000MY", "Porsche", "Cayenne");
		Coche c8 = new Coche("9000MY", "Peugeot", "308");
		
		Coche cocherandom = null;
		
		int res1= (int) (Math.random() * 9);
		
		switch (res1) {	
			case 0:
				cocherandom=c1;
				break;
			case 1:
				cocherandom=c1;
				break;
			case 2:
				cocherandom=c2;
				break;
			case 3:
				cocherandom=c3;
				break;
			case 4:
				cocherandom=c4;
				break;
			case 5:
				cocherandom=c5;
				break;
			case 6:
				cocherandom=c6;
				break;
			case 7:
				cocherandom=c7;
				break;
			case 8:
				cocherandom=c8;
				break;
	}
		return cocherandom;
		
		}

}
