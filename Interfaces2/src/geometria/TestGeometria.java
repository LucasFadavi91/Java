package geometria;

import figuras.Circulo;

import figuras.Rectangulo;


public class TestGeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Geometria geo1 = new Casa("Calle bien", 10, 13, 60);
		Geometria geo2 = new Rectangulo("Azul", 4, 6, 8);
		Geometria geo3 = new Casa("Calle muyGuay", 5, 60, 40);
		Geometria geo4 = new Circulo("purpura",4);
		
	

		Geometria arrayGeometria[] = new Geometria[4];
		
		arrayGeometria[0]=geo1;
		arrayGeometria[1]=geo2;
		arrayGeometria[2]=geo3;
		arrayGeometria[3]=geo4;
		
		for (int i=0;i<arrayGeometria.length;i++)
			System.out.println("area "+arrayGeometria[i].calcularArea()+" Perimetro "+arrayGeometria[i].calcularPerimetro());
	}

}
