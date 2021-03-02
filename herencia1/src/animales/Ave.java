package animales;

public class Ave extends Animal{
	
	private int numeroHuevos;
	private boolean volar;
	
	//CONSTRUCTOR
	public Ave(String nombrecomun, String nombrespecifico, double peso, double tamaño, int numeroHuevos, boolean volar) {
		super(nombrecomun, nombrespecifico, peso, tamaño);
		this.numeroHuevos = numeroHuevos;
		this.volar = volar;
	}
	
	//CONSTRUCTOR VACIO
	public Ave() {
		
		
	}

	//GETS Y SETS
	public int getNumeroHuevos() {
		return numeroHuevos;
	}

	public void setNumeroHuevos(int numeroHuevos) {
		this.numeroHuevos = numeroHuevos;
	}

	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}
	
	//METODO PUEDE VOLAR O NO
	public String puedeVolar(){
		
		if(volar==true)
			return "Si";
		else
			return "No";
		
		
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Ave [numeroHuevos=" + numeroHuevos + ", volar=" + volar + ", puedeVolar=" + puedeVolar() 
				+ "]";
	}

	
	
}
	
	
