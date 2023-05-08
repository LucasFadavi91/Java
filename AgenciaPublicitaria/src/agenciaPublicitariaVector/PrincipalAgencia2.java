package agenciaPublicitariaVector;

import java.util.*;

public class PrincipalAgencia2  {

	public static void main(String[] args) {
		//Creamos un objeto Vector vAnuncios y le añadimos tres anuncios
		Vector<Anuncio> vAnuncios=new Vector<Anuncio>();
		
		AnuncioRadioTV aRTV1=new AnuncioRadioTV("Dixan", "Detergente", 5, "SER", 2, 3);
		AnuncioPrensa aP1=new AnuncioPrensa("Dixan", "Detergente", 6, "Detergente Dixan", 20);
		AnuncioRadioTV aRTV2=new AnuncioRadioTV("Audi 3", "Coche", 10, "SER", 3, 5);
		
		vAnuncios.add(aRTV1); vAnuncios.add(aP1);vAnuncios.add(aRTV2); //le añadimos los tres anuncios
		
		//creamos un objeto ArrayList alAnuncios pasando como parámetro el vectorvAnuncios e insertamos un nuevo anuncio
		ArrayList<Anuncio> alAnuncios=new ArrayList<Anuncio>(vAnuncios);
		AnuncioPrensa aP2=new AnuncioPrensa("London nº 1", "Ginebra", 10, "London nº 1", 30);
		alAnuncios.add(2,aP2); //insertamos el anuncio en la posición 2
		System.out.println();
		System.out.println("Imprimimos el arrayList construido a partir del arrayList");
		System.out.println();		
		for(int i=0; i<alAnuncios.size(); i++){
			System.out.println(alAnuncios.get(i).toString());
		}
		System.out.println();
		//ahora podemos crear un nuevo vector v2Anuncios pasándole como parémtro el arrayList 
		System.out.println("Imprimimos el vector construido a partir del arrayList");
		System.out.println();
		Vector<Anuncio> v2Anuncios=new Vector<Anuncio>(alAnuncios);
		for (int i = 0; i < v2Anuncios.size(); i++) {
			System.out.println(v2Anuncios.get(i).toString());			
		}
		
//		List<Anuncio> lista1 =new Vector<Anuncio> ();
//		List <Anuncio> lista2 =new ArrayList<Anuncio> ();
//		List<Anuncio> lista3 =new Vector<Anuncio> (v2Anuncios);
//		List <Anuncio> lista4 =new ArrayList<Anuncio> (alAnuncios);
		
		System.out.println();
		System.out.println("usamos el método addAll para añadir el arrayList al vector v2Anuncios");
		System.out.println();
		
		v2Anuncios.addAll(alAnuncios);
		for (int i = 0; i < v2Anuncios.size(); i++) {
			System.out.println(v2Anuncios.get(i).toString());
			}
		System.out.println();
		System.out.println("Borramos un anuncio");
		System.out.println();
		v2Anuncios.remove(aP1);
		System.out.println();
		System.out.println("Insertamos un nuevo anuncio que no está en ninguna colección");
		System.out.println();
		Anuncio a=new AnuncioPrensa("Lauki", "Leche", 12, "Lauki semi", 15);
		v2Anuncios.add(3, a);
		for (int i = 0; i < v2Anuncios.size(); i++) {
			System.out.println(v2Anuncios.get(i).toString());
			}
		System.out.println();
		System.out.println("Borramos la colección arrayList");
		System.out.println();
		v2Anuncios.removeAll(alAnuncios);
		System.out.println();
		for (int i = 0; i < v2Anuncios.size(); i++) {
			System.out.println(v2Anuncios.get(i).toString());
			}
		System.out.println();
		
		System.out.println(v2Anuncios.retainAll(alAnuncios));
		

		
		
		
	}

}
