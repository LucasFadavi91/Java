package ejercicio02;

public class Coche {
	private String matricula;
	private String modelo;
	private String marca;
	
	//CONSTRUCTOR
	public Coche(String matricula, String modelo, String marca) {
	
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	
	
	
}

