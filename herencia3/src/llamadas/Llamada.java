package llamadas;

public abstract class Llamada {
	
	private String numOrigen;
	private String numDestino;
	private double duracion;
	
	//CONSTRUCTOR
	public Llamada(String numOrigen, String numDestino, double duracion) {
		super();
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}
	
	//GETS y SETS
	public String getNumOrigen() {
		return numOrigen;
	}

	public void setNumOrigen(String numOrigen) {
		this.numOrigen = numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	//METODO TIPO DE LLAMADA
	public abstract void tipollamada();

	@Override
	public String toString() {
		return "Llamada [numOrigen=" + numOrigen + ", numDestino=" + numDestino + ", duracion=" + duracion + "]";
	}
	
	

}
