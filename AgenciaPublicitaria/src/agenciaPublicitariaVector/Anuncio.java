package agenciaPublicitariaVector;

public abstract class Anuncio {
	private String nombre;
	private String producto;
	private int diasEmision;
	
	public Anuncio(String nombre, String producto, int diasEmision){
		this.nombre=nombre;
		this.producto=producto;
		this.diasEmision=diasEmision;
	}
	
	public abstract double costeAnuncio();
	
	public String toString() {
		return "nombre=" + nombre + ", producto=" + producto
				+ ", dias de emision=" + diasEmision;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getDiasEmision() {
		return diasEmision;
	}
	public void setDiasEmision(int diasEmision) {
		this.diasEmision = diasEmision;
	}
	
	
}
