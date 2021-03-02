package figuras;

public abstract class Figura {
	private String color;

	//constructores
	//public Figura(){}
	
	public Figura(String color) {
			this.color = color;
	}
	
	public Figura(){}


// GET y SET
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

	public abstract double calcPerimetro();
	public abstract double calcArea();
	
	
	
} //cierre class
