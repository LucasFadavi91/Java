package figuras;

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
	


} //cierre clase
