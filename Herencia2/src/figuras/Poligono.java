package figuras;

public abstract class Poligono extends Figura {
	
	private int numlados;

	
	//constructor
	public Poligono(String color, int numlados) {
		super(color);
		this.numlados = numlados;
	}
	public Poligono(){}

	//Gets y sets
	public int getNumlados() {
		return numlados;
	}


	public void setNumlados(int numlados) {
		this.numlados = numlados;
	}

	@Override
	public String toString() {
		return super.toString() + "Poligono [numlados=" + numlados + "]";
	}


}
