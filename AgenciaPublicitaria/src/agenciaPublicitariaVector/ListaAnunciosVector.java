package agenciaPublicitariaVector;

import java.util.Vector;

public class ListaAnunciosVector {	
	private Vector <Anuncio> listaAnuncios;	
	public ListaAnunciosVector(){
		listaAnuncios=new Vector <Anuncio>();
	}
	
	public void verAnuncios(){//recorre el vector y muestra cada anuncio. Actua el polimorfismo
		for (int i=0; i<listaAnuncios.size(); i++){
			System.out.println(listaAnuncios.elementAt(i).toString());
			System.out.println("Coste del anuncio "+i+": "+listaAnuncios.elementAt(i).costeAnuncio());
		}
	}
	public double costeTotal(){//recorre el vector y suma el coste de cada anuncio. Actua el polimorfismo
		double total=0;
		for (int i=0; i<listaAnuncios.size(); i++){
			total+=listaAnuncios.elementAt(i).costeAnuncio();	
			//si hay un anuncioPrensa calcula su coste	y si es un anuncioRadioTV calcula su coste
			//está actuando el polimorfismo
		}
		return total;
	}
	public void insertarAnuncio(Anuncio anuncio){
		listaAnuncios.addElement (anuncio);
	}	
	
	public int cantidadAnuncios(){
		return listaAnuncios.size();
	}
	
	//añadimos un método que calcula la suma total de tiempo de una determinada emisora
	public double sumaTiempoEmisora(String emisora){
		double tiempoEmisora=0;
		AnuncioRadioTV aux;
		for (int i=0; i<listaAnuncios.size(); i++)
			if (listaAnuncios.elementAt(i) instanceof AnuncioRadioTV){
				/*para poder comparar las emisora hay que usar el metodo getEmisora()
				y  necesitamos hacer el casting primero a AnuncioRadioTV. Para que el casting no dé error,
				 se comprueba que realmente es un AnuncioRadioTV con instanceof */
				aux=(AnuncioRadioTV) listaAnuncios.elementAt(i);
				if (aux.getEmisora().equals(emisora)) 
					//si la emisora recuperada del vector coincide con el parámetro 
					tiempoEmisora+=aux.getDuracion();
			}
		return tiempoEmisora;
	}
	
}


