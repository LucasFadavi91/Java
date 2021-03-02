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
			return "[Soy una figura de color " + super.getColor() + ". Adem�s soy un " +getClass().getSimpleName() +
					" con " +getRadio() + " de radio :  Mi �rea es " + calcArea() + " y mi per�metro es "+ calcPerimetro() +"]";
		} 
	

	// METODOS
	public double calcPerimetro() {
		return (2*Math.PI*this.radio);
		
	}
	
	public double calcArea(){
		return ( Math.PI*Math.pow(this.radio, 2) );
		
	}
	


} //cierre clase
