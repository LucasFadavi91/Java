package ej02;

import java.util.Scanner;

public class Main {
static Scanner entrada = new Scanner(System.in);

public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    sumPositivos();


}


public static void sumPositivos() throws Exception {
        int acum=0;
        System.out.println("Introduce un número, no puede ser negativo");
        try {
            int num=0;
         
                do {
                	num=entrada.nextInt();
                    acum=acum +num;
                    
                }while(num>0);
            if(num<0) {
                Exception e=new Exception("Error: Número Negativo, te haré la suma sin contar el negativo");
                throw e;
                }

            System.out.println("La suma es "+acum);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("La suma es "+acum);
        }
    }
}
