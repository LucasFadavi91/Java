package ej01;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num=10;


        int arrayEnteros[] = {2,10,5,0,5};
        try {
            System.out.println(arrayEnteros[6]);
        } catch (Exception e) {
            // TODO: handle exception
        }
        for (int i = 0; i < arrayEnteros.length; i++) {
            try {
                System.out.println(num/arrayEnteros[i]);
            } catch (ArithmeticException e) {
                System.out.println("Error: La posición "+i+" contiene un 0");
            }

        }
    }

}