package ejercicio01;

import java.util.Scanner;

public class Ej02 {
	
	public static void main(String[] args) {
	
	int array1[] = {1,2,-1,-2,-3,-4,-5,3,4,5,40,50};
	int array2[] = {1,2,3,4,5,-4,-5,3,4,5,40,50};
	int array3[] = {1,2,-1,-2,0,-4,-5,3,4,5,40,50};
	
	
	//SE HAN CREADO TRES METODOS, SE PUEDE HACER DEVOLIVENDO 3 ARRAYS, PERO ASI LO VEO MAS FACIL
	
	System.out.println(numPositivos(array1));
	System.out.println(Ej02.numNegativos(array2));
	System.out.println(Ej02.calcMedia(array1));
	
	}
	
	public static int numPositivos(int array[]) {
		int contPos=0;
		int contNeg=0;
		int acumPos=0;
		boolean bandera=false;
		
		for (int i = 0; i < array.length && bandera==false; i++) {
		

				//if(array[i]<0 && array[i]>-100)
					//contNeg++;
				if(array[i]>0 && array[i]<100) {
					contPos++;}
					//acumPos=acumPos+array[i];}
				if(array[i]==0 || contPos==5)
					bandera=true;
				//else
					//System.out.println("Estás fuera del rango");
		
		}
		return contPos;
		
	}
	

	public static int numNegativos(int array[]) {
		Scanner entrada = new Scanner(System.in);
		int contPos=0;
		int contNeg=0;
		int acumPos=0;
		boolean bandera=false;
		
		for (int i = 0; i < array.length && bandera==false; i++) {
		

				if(array[i]<0 && array[i]>-100)
					contNeg++;
				if(array[i]>0 && array[i]<100)
					contPos++;
				if(array[i]==0 || contPos==5)
					bandera=true;
				//else
					//System.out.println("Estás fuera del rango");
		
		}
		return contNeg;
		
	}
	
	
	public static double calcMedia(int array[]) {
		Scanner entrada = new Scanner(System.in);
		int contPos=0;
		int contNeg=0;
		int acumPos=0;
		boolean bandera=false;
		
		for (int i = 0; i < array.length && bandera==false; i++) {
		

				//if(array[i]<0 && array[i]>-100)
					//contNeg++;
				if(array[i]>0 && array[i]<100) {
					contPos++;
					acumPos=acumPos+array[i];}
				if(array[i]==0 || contPos==5)
					bandera=true;
				//else
					//System.out.println("Estás fuera del rango");
		
		}
		return acumPos/contPos;
		
	}
	
}

