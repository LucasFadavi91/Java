package ejVinilo;

public class Cancion {

	private String titulo;
	private double duracion;
	private static int contD=0;
	
	//Constructor
	
	public Cancion(String titulo, double duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}
	public Cancion() {
		this.titulo = "Cancion"+contD;
		contD++;
		this.duracion = Math.random()*5+1;
	}
	
	//Gets y Sets
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", duracion=" + duracion + "]";
	}
	
}
