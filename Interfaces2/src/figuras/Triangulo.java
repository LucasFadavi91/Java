package figuras;

import interfaces2.Ordenable;
import operable.Operable;

public class Triangulo extends Poligono {
	
	private double base;
	private double altura;
	
	//Constructor
	public Triangulo(String color, int numlados, double base, double altura) {
		super(color, numlados);
		this.base = base;
		this.altura = altura;
	}
	public Triangulo(){}
	
	//Gets y Sets
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcArea(){
		
		return ((this.base*this.altura)/2);
	}
	 
	public double calcPerimetro(){
		
		double hipotenusa;
		
		hipotenusa = Math.sqrt( Math.pow((this.base/2),2) + Math.pow(this.altura, 2)  );
		return (hipotenusa*2+this.base);
	}

/*	@Override
	public String toString() {
		
		return super.toString()+ "Triangulo [base=" + base + ", altura=" + altura + "]";
	}*/
	 @Override
		public String toString() {
			return "[Soy una figura de color " + super.getColor() + ". Adem�s soy un " + super.getClass().getSuperclass().getSimpleName() + 
					" y un "+ getClass().getSimpleName() +" con " +super.getNumlados() 
			+ " lados :  Mi �rea es " + calcArea() + " y mi per�metro es "+ calcPerimetro() +"]";
		}
	@Override
	public boolean esMenor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean esMayor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void sumar(Operable op) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void multiplicar(Operable op) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void restar(Operable op) {
		// TODO Auto-generated method stub
		
	} 
	

}

