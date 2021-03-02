package vehiculos;

public class Vehiculo {
	
	private String marca;
	private String matricula;
	private int autonomia;
	
	//CONSTRUCTOR
	public Vehiculo(String marca, String matricula, int autonomia) {
		this.marca = marca;
		this.matricula = matricula;
		this.autonomia = autonomia;
	}
	
	//GETS Y SETS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", autonomia=" + autonomia + "]";
	}
	
	
	

}
