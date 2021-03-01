package ejercicio01;


import java.util.Scanner;

public class ej01 {
	
	public static void main(String[] args) {
		
		int n;
		n=introducirNumero();
		int array[];
		
		if (n==-1) {
			System.out.println("El numero introducido es negativo");
		}
		else if (n==0) {
			System.out.println("El número es positivo, pero está fuera de los límites: 5 y 10");
			}
		else {
			array=leerNumeros(n);
			System.out.println("La media es: "+sumarNumeros(array));
			}
		
		
	}

	
	public static int introducirNumero() {
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entre 5 y 10");
		n=entrada.nextInt();
	
		if ((n>=5)&&(n<=10))
			return n;
		else {
			if (n<0)
				return -1;
			else
				return 0;
			}
			
	}
	
	public static int[] leerNumeros(int n) {
		Scanner entrada = new Scanner(System.in);
		int array[]= new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escribe un numero");
			array[i]=entrada.nextInt();
		}
		return array;
	}
	
	public static int sumarNumeros(int[] array) {
		int resultado=0;
		for (int i = 0; i < array.length; i++) {
			resultado=resultado+array[i];
		}
		return resultado;
		
		
	}
}