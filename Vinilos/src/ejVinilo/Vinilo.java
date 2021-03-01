package ejVinilo;

import java.util.Arrays;

public class Vinilo implements Comparable{
	
	private String titulo;
	private String artista;
	private String tema;
	private Cancion[] caraA;
	private Cancion[] caraB;
	private int numCancionA;
	private int numCancionB;
	
	
	//Constructor
	
	public Vinilo(String titulo, String artista, String tema, int numCancionA, int numCancionB) {
		this.titulo = titulo;
		this.artista = artista;
		this.tema = tema;
		this.caraA = new Cancion[numCancionA];
			for (int i = 0; i < caraA.length; i++){
				caraA[i]=new Cancion();}
		
		this.caraB = new Cancion[numCancionB];
			for (int i = 0; i < caraB.length; i++) {
				caraB[i]=new Cancion();}
	}

	//Gets y Sets
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public Cancion[] getCaraA() {
		return caraA;
	}


	public void setCaraA(Cancion[] caraA) {
		this.caraA = caraA;
	}


	public Cancion[] getCaraB() {
		return caraB;
	}


	public void setCaraB(Cancion[] caraB) {
		this.caraB = caraB;
	}


	public int getNumCancionA() {
		return numCancionA;
	}


	public void setNumCancionA(int numCancionA) {
		this.numCancionA = numCancionA;
	}


	public int getNumCancionB() {
		return numCancionB;
	}


	public void setNumCancionB(int numCancionB) {
		this.numCancionB = numCancionB;
	}

	@Override
	public String toString() {
		return "Vinilo [titulo=" + titulo + ", artista=" + artista + ", tema=" + tema + ", caraA="
				+ Arrays.toString(caraA) + ", caraB=" + Arrays.toString(caraB) + ", numCancionA=" + numCancionA
				+ ", numCancionB=" + numCancionB + "]";
	}

	
	
	
	//generate hashcode y equals
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + Arrays.hashCode(caraA);
		result = prime * result + Arrays.hashCode(caraB);
		result = prime * result + numCancionA;
		result = prime * result + numCancionB;
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vinilo other = (Vinilo) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (!Arrays.equals(caraA, other.caraA))
			return false;
		if (!Arrays.equals(caraB, other.caraB))
			return false;
		if (numCancionA != other.numCancionA)
			return false;
		if (numCancionB != other.numCancionB)
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return this.artista.compareTo(Vinilo.class.cast(o).getArtista());
		Vinilo other=Vinilo.class.cast(o);
		if(this.artista.equals(other.getArtista())) { //si el artista es el mismo
			return this.titulo.compareTo(other.getTitulo());	
		}
		else {
			return this.artista.compareTo(other.getArtista());
		}
			
		
	}
	
	
	
	
	
}
