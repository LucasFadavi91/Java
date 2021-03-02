package ejer1Interfaz;

import java.util.Scanner;

public class MainListArray {

	public static void main(String[] args) {
		
		Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Introduce elementos");
		int elem = entrada.nextInt();
	
		ListArray array1 =new ListArray(5);
			
		array1.addFirst(elem);
		
		

	}

}
