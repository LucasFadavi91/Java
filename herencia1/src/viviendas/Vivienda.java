package viviendas;

public class Vivienda {
	
	private int numerohabitaciones;
	private double metroscuadrados;
	private String calle;
	private String telefono;
	
	//CONSTRUCTOR
	public Vivienda(int numerohabitaciones, double metroscuadrados, String calle, String telefono) {
		this.numerohabitaciones = numerohabitaciones;
		this.metroscuadrados = metroscuadrados;
		this.calle = calle;
		this.telefono = telefono;
	}
	
	public Vivienda(){
		
		
	}	
		
	//GETS Y SETS
	

	public int getNumerohabitaciones() {
		return numerohabitaciones;
	}

	public void setNumerohabitaciones(int numerohabitaciones) {
		this.numerohabitaciones = numerohabitaciones;
	}

	public double getMetroscuadrados() {
		return metroscuadrados;
	}

	public void setMetroscuadrados(double metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Vivienda [numerohabitaciones=" + numerohabitaciones + ", metroscuadrados=" + metroscuadrados
				+ ", calle=" + calle + ", telefono=" + telefono + "]";
	}
	
	
	
	

}
