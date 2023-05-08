package agenciaPublicitariaVector;


public class AnuncioRadioTV extends Anuncio {

	private static final double costeSegundo= 100;
	private String emisora;
	private int duracion;
	private int frecuencia;
	
	public AnuncioRadioTV(String nombre, String producto,int diasEmision,String emisora,int duracion, int frecuencia){
		super(nombre,producto,diasEmision);
		this.emisora = emisora;
		this.duracion = duracion;
		this.frecuencia = frecuencia;
	}
	
	public double costeAnuncio() {		
		return costeSegundo*duracion*frecuencia*costeSegundo +getDiasEmision();
	}
	public String toString() {
		return super.toString()+ " emisora=" + emisora + ", duracion=" + duracion
				+ ", frecuencia=" + frecuencia;
	}
	public static double getCosteSegundo() {
		return costeSegundo;
	}
	public String getEmisora() {
		return emisora;
	}
	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	
	
	

}
