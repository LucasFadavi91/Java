package animales;

public class MamiferosTerrestre extends Mamifero {
	
	private int numeroPatas;

	//CONSTRUCTOR
	public MamiferosTerrestre(String nombrecomun, String nombrespecifico, double peso, double tama�o, int numeroCrias,
			int mesesEmbarazo, int numeroPatas) {
		super(nombrecomun, nombrespecifico, peso, tama�o, numeroCrias, mesesEmbarazo);
		this.numeroPatas = numeroPatas;
	}
	
	//CONSTRUCTOR VACIO
	
	  public MamiferosTerrestre() {
	  
	  
	  }
	 
	//GETS Y SETS
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		
		return super.toString()+ "MamiferosTerrestre [numeroPatas=" + numeroPatas + "]";
	}
	

}
