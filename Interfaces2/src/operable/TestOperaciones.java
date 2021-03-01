package operable;

import figuras.Circulo;
import figuras.Figura;
import figuras.Rectangulo;


public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura f1 = new Rectangulo("Negro", 7, 3,9);
		Figura f2 = new Rectangulo("Gris", 1, 4,5);
		Figura f3 = new Circulo("Purpura", 8);
		Figura f4 = new Circulo("Verde", 62);


		System.out.println(f1.toString());
		System.out.println();
		f1.sumar(f2);
		System.out.println(f1.toString());
		System.out.println();
		System.out.println(f2.toString());
		System.out.println();
		f2.restar(f1);
		System.out.println(f2.toString());
		System.out.println();
		f2.multiplicar(f1);
		System.out.println(f2.toString());
		System.out.println();



		System.out.println(f3.toString());
		System.out.println();
		f3.sumar(f4);
		System.out.println(f3.toString());
		System.out.println();
		System.out.println(f4.toString());
		System.out.println();
		f4.restar(f3);
		System.out.println(f4.toString());
		System.out.println();
		f4.multiplicar(f3);
		System.out.println(f4.toString());
		System.out.println();
	}

}
