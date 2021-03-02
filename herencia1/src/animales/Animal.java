package animales;

public class Animal {
	
	private String nombrecomun;
	private String nombrespecifico;
	private double peso;
	private double tama�o;
	
	//CONSTRUCTOR
	public Animal(String nombrecomun, String nombrespecifico, double peso, double tama�o) {
		super();
		this.nombrecomun = nombrecomun;
		this.nombrespecifico = nombrespecifico;
		this.peso = peso;
		this.tama�o = tama�o;
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
	
	//METODO INCREMENTAR TAMA�O
	public double incrementarTama�o(){
	
		return (this.tama�o+this.tama�o*0.10);
		
	}
	

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Animal [nombrecomun=" + nombrecomun + ", nombrespecifico=" + nombrespecifico + ", peso=" + peso
				+ ", tama�o=" + tama�o + "]";
	}
	

}
