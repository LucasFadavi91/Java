package ejercicio1;
import java.util.Scanner;
public class NPrimerosPrimos {
	public static void main(String[] args) {
		int n, cont;
		boolean primo = true;
		
		
		
		System.out.println ("Introduce un nº");	
		Scanner entrada=new Scanner(System.in);
		n=entrada.nextInt();
		if (n<=0)
			System.out.println ("No hay primos");
		else 
		{int numero=2;
		cont=1; //si contador empieza en 1 el while termina en la vuelta n+1
		System.out.println ("los "+n+" primeros primos son: ");				
		while (cont<=n){//si cont=0 el bucle seria while(cont<n)	
		primo = esPrimo(numero);
			if(primo) { 
				System.out.println ("El "+numero);
				cont++;}
			numero++;}	
		}
		entrada.close();
	}
	public static boolean esPrimo(int numero) {

	
		boolean primo=true;

		
			for (int i=2;  i<=numero/2 && primo;i++) {
				if (numero%i==0)primo=false;}


		return primo;



	}

}
	
	
