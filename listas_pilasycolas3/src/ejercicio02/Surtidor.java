package ejercicio02;

import java.util.LinkedList;
import java.util.Queue;

public class Surtidor {
	
	private boolean isLibre;
	private Coche coche;
	private Queue<Coche> colaCoches;
	
	//CONSTRUCTORES
	public Surtidor() {
		this.isLibre = true;
		this.coche = null;
		this.colaCoches = new LinkedList<Coche>();
	}

	//METODOS
	public boolean isLibre() {
		return isLibre;
	}

	public void setLibre(boolean isLibre) {
		this.isLibre = isLibre;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Queue<Coche> getColaCoches() {
		return colaCoches;
	}

	public void setColaCoches(Queue<Coche> colaCoches) {
		this.colaCoches = colaCoches;
	}

	@Override
	public String toString() {
		return "Surtidor [¿Libre?: " + isLibre + ", Repostando: " + coche + ", Cola: " + colaCoches + "]";
	}

}
