package ej03;

public class Main {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        Ecuacion ec = new Ecuacion(0, 5, 30);
        System.out.println(ec);
        try {
        ec.calcSolucion(ec);
        }
        catch (Exception k) {
            System.out.println(k);
            }


    }

}