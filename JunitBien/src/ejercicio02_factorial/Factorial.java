package ejercicio02_factorial;

import java.util.Scanner;
//EL PROGRAMA HA SIDO DEPURADO Y CORREGIDO.
//SE HA MODIFICADO EL CODIGO, Y PUESTO LAS EXCEPCIONES, Y AHORA SALE CORRECTO.

public class Factorial {
	static Scanner read = new Scanner(System.in);
	int num;	
	public Factorial(int num) {
		this.num = num;
	}
	public int calculo () throws Exception {
		int fact = 0,  i;

	try {
		if (num<0){
			Exception k= new Exception("El número no puede ser negativo");
			//System.out.println("El número no puede ser negativo");
			fact= -1;
			throw k;
		}
		else if (num>15){
				
				Exception k= new Exception("El número excede del rango");
				fact= -2;
				throw k;
			}
			else {
				fact=1;i=1;
				while (i<=num){
					fact*=i;
					i++;
				}
			}
		return fact;
	}
	catch (Exception k) {
		System.out.println(k);
		return fact;
		}
	}

	public static void main(String[] args) throws Exception {
		int n;
		System.out.println("Introduce un número para calcular el factorial");
           //introducirlo con Scanner o LeerTeclado
		n=read.nextInt();
		Factorial f=new Factorial(n); 
		System.out.println("factorial= "+f.calculo());
	}
}