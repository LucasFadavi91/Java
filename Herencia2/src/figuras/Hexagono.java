package figuras;

public class Hexagono extends Poligono {
	
	private double lado;
	private double apotema;
	
	//Constructor
	public Hexagono(String color, int numlados, double lado, double apotema) {
		super(color, numlados);
		this.lado = lado;
		this.apotema = apotema;
	}

	//Gets y Sets
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	
	
	//METODOS
	public double calcPerimetro(){
		
		//return this.lado*getNumlados();
		return this.lado*6;
		
	}
	
	public double calcArea(){
		
		 double area=(calcPerimetro()*apotema)/2;
		 return area;
		
	}
	
	 @Override
	public String toString() {
		return "[Soy una figura de color " + super.getColor() + ". Adem�s soy un " + super.getClass().getSuperclass().getSimpleName() + 
				" y un "+ getClass().getSimpleName() +" con " +super.getNumlados() 
		+ " lados :  Mi �rea es " + calcArea() + " y mi per�metro es "+ calcPerimetro() +"]";
	} 
	
	 //�Soy una figura de color ____. Adem�s soy un pol�gono y un rect�ngulo con 4 lados: Mi �rea es ___ y mi per�metro es ____� )
	
	

}
