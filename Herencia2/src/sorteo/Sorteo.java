package sorteo;

public abstract class Sorteo {
	
	protected int posibilidades;

	public Sorteo(int posibilidades) {
		
		super();
		this.posibilidades = posibilidades;
	}

	public int getPosibilidades() {
		return posibilidades;
	}

	public void setPosibilidades(int posibilidades) {
		this.posibilidades = posibilidades;
	}
	
	//METODO LANZAR
	public abstract void lanzar();
	
	public double probabilidad(){
		
		
		
		return (1/posibilidades);
		
	}
	public void verDatos(){
		
		getPosibilidades();
		
		probabilidad();
		
		
	}

	@Override
	public String toString() {
		return "Sorteo [posibilidades=" + posibilidades + "]";
	}
	

}
