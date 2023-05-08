package agenciaPublicitariaVector;

public class AnuncioPrensa extends Anuncio {

	private static final double costeTexto=58;
	private String titulo;
	private int cantidadTexto;
	
	public AnuncioPrensa(String nombre, String producto, int diasEmision, String titulo, int cantidadTexto) {
		super(nombre, producto, diasEmision);
		this.titulo=titulo;
		this.cantidadTexto=cantidadTexto;
	}
	public double costeAnuncio() {
		return cantidadTexto*costeTexto*super.getDiasEmision();
	}
	public String toString() {
		return super.toString()+" titulo=" + titulo + ", cantidadTexto="
				+ cantidadTexto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public static double getCostetexto() {
		return costeTexto;
	}
	public int getCantidadTexto() {
		return cantidadTexto;
	}
	public void setCantidadTexto(int cantidadTexto) {
		this.cantidadTexto = cantidadTexto;
	}	
	
}
