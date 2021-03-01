package figuras;

import empleados.Empleadosfijos;
import interfaces2.Ordenable;
import operable.Operable;

public class Rectangulo extends Poligono implements Ordenable {

	private double base;
	private double altura;
	
	
	public Rectangulo(String color, int numlados, double base, double altura) {
		super(color, numlados);
		this.base = base;
		this.altura = altura;
	}
	
	
	
	//GET y SET
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
	/*@Override
	public String toString() {
		return super.toString() + "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}*/
	 @Override
		public String toString() {
			return "[Soy una figura de color " + super.getColor() + ". Además soy un " + super.getClass().getSuperclass().getSimpleName() + 
					" y un "+ getClass().getSimpleName() +" con " +super.getNumlados() 
			+ " lados :  Mi área es " + calcArea() + " y mi perímetro es "+ calcPerimetro() +"]";
		} 
	
	
	//METODOS
	
	public double calcPerimetro(){
		return this.base*2+this.altura*2;
	}
	
	public double calcArea(){
		return this.base*this.altura;
	}



	@Override
	public boolean esMenor(Ordenable o) {
		
		if (o==null)
			return false;
		if (o instanceof Figura)
			return (this.calcArea()<((Rectangulo)o).calcArea());
		else
			return false;
	}



	@Override
	public boolean esMayor(Ordenable o) {
		if (o==null)
			return false;
		if (o instanceof Figura)
			return (this.calcArea()>((Rectangulo)o).calcArea());
		else
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

