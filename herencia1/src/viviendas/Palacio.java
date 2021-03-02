package viviendas;

public class Palacio extends Vivienda{

	private boolean chofer;



	//CONSTRUCTOR

	public Palacio(double metroscuadrados, String calle, String telefono, boolean chofer) {
		super(10, metroscuadrados, calle, telefono);
		this.chofer = chofer;
	}


	public Palacio(){


	}

	//GETS Y SETS

	public boolean isChofer() {
		return chofer;
	}


	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}
	
	//TIENE O NO CHOFER
	public String tieneChofer(){
		
		if(chofer==true)
			return "Si";
		else
			return "No";
	}

	@Override
	public String toString() {
		return super.toString()+"Palacio [chofer=" + chofer + tieneChofer() + "]";
	}


}


	
	
	
	
		
	
	


