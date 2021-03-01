package figuras;

import interfaces2.Ordenable;
import operable.Operable;

public class Circulo extends Figura {
	
	private double radio;

	//constructor
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	public Circulo(){}

	
	//GET y SET
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

	/*@Override
	public String toString() {
		return super.toString() + "Circulo [radio=" + radio + "]";
	}*/
	
	 @Override
		public String toString() {
			return "[Soy una figura de color " + super.getColor() + ". Además soy un " +getClass().getSimpleName() +
					" con " +getRadio() + " de radio :  Mi área es " + calcArea() + " y mi perímetro es "+ calcPerimetro() +"]";
		} 
	

	// METODOS
	public double calcPerimetro() {
		return (2*Math.PI*this.radio);
		
	}
	
	public double calcArea(){
		return ( Math.PI*Math.pow(this.radio, 2) );
		
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
	


} //cierre clase
