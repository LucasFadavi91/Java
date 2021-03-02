package figuras;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura hex1 = new Hexagono("rojo", 6, 9, 7);
		Figura tri1 = new Triangulo("azul",3,4,4);
		Figura rec1 = new Rectangulo("verde",4,6,8);
		Figura cir1 = new Circulo("amarillo",2.5);
		Figura cir2 = new Circulo("purpura",4);
		
		Figura [] arrayFiguras = {hex1,tri1,rec1,cir1,cir2};
		
		visualizarFiguras(arrayFiguras);
		contarFiguras(arrayFiguras);
	
		
	}



	//METODO VISUALIZAR LOS OBJETOS DEL ARRAY
	public static void visualizarFiguras(Figura [] array){
		
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]+" ");
			
		} 
	
	}
	//METODO CONTAR FIGURAS
	public static void contarFiguras(Figura[] array){
		
		int cont=0;
		int contrec=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Rectangulo){
				cont++;
				contrec++;}
			else if (array[i] instanceof Poligono){	
				cont++;
				}	
		}///cierrefor
		System.out.println("Hay " + cont + " Poligonos ");
		System.out.println("Hay " + contrec + " Rectangulo ");
	}
	

		
}
