package animales;

public class Mamifero extends Animal{

	private int numeroCrias;
	private int mesesEmbarazo;

	//CONSTRUCTOR
	
	public Mamifero(String nombrecomun, String nombrespecifico, double peso, double tamaño, int numeroCrias,
			int mesesEmbarazo) {
		super(nombrecomun, nombrespecifico, peso, tamaño);
		this.numeroCrias = numeroCrias;
		this.mesesEmbarazo = mesesEmbarazo;
	}

	//CONSTRUCTOR VACIO
	public Mamifero() {
		
		
	}

	//GETS Y SETS
	
	public int getNumeroCrias() {
		return numeroCrias;
	}

	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias = numeroCrias;
	}

	public int getMesesEmbarazo() {
		return mesesEmbarazo;
	}

	public void setMesesEmbarazo(int mesesEmbarazo) {
		this.mesesEmbarazo = mesesEmbarazo;

	}
	
		
	public String toString() {

		return super.toString()+ "mesesEmbarazo=" + mesesEmbarazo + ", numeroCrias=" + numeroCrias;



	}

}




