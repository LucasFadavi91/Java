package animales;

public class Animal {
	
	private String nombrecomun;
	private String nombrespecifico;
	private double peso;
	private double tamaño;
	
	//CONSTRUCTOR
	public Animal(String nombrecomun, String nombrespecifico, double peso, double tamaño) {
		super();
		this.nombrecomun = nombrecomun;
		this.nombrespecifico = nombrespecifico;
		this.peso = peso;
		this.tamaño = tamaño;
	}
	
	//CONSTRUCTOR VACIO
	public Animal() {
		
		
	}
	
	//GETS Y SETS

	public String getNombrecomun() {
		return nombrecomun;
	}

	public void setNombrecomun(String nombrecomun) {
		this.nombrecomun = nombrecomun;
	}

	public String getNombrespecifico() {
		return nombrespecifico;
	}

	public void setNombrespecifico(String nombrespecifico) {
		this.nombrespecifico = nombrespecifico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//METODO INCREMENTAR TAMAÑO
	public double incrementarTamaño(){
	
		return (this.tamaño+this.tamaño*0.10);
		
	}
	

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Animal [nombrecomun=" + nombrecomun + ", nombrespecifico=" + nombrespecifico + ", peso=" + peso
				+ ", tamaño=" + tamaño + "]";
	}
	

}
