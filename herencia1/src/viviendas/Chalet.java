package viviendas;

public class Chalet extends Vivienda {
	
	private double metrosjardin;
	private boolean piscina;
	
	//CONSTRUCTOR
	public Chalet(int numerohabitaciones, double metroscuadrados, String calle, String telefono, double metrosjardin,
			boolean piscina) {
		super(numerohabitaciones, metroscuadrados, calle, telefono);
		this.metrosjardin = metrosjardin;
		this.piscina = piscina;
		
	//GETS Y SETS	
	}

	public double getMetrosjardin() {
		return metrosjardin;
	}

	public void setMetrosjardin(double metrosjardin) {
		this.metrosjardin = metrosjardin;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	//TIENE O NO PISCINA
	public String tienePiscina(){
		
		if(piscina==true)
			return "Si tiene piscina";
		else
			return "No tiene piscina";
		
	}
	

	@Override
	public String toString() {
		return super.toString()+ "Chalet [metrosjardin=" + metrosjardin + ", piscina=" + piscina + tienePiscina() + "]";
	}
	

}
