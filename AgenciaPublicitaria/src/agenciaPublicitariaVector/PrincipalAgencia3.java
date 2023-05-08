package agenciaPublicitariaVector;

import agenciaArrayList.ArrayListAnuncios;

public class PrincipalAgencia3 {

	public static void main(String[] args) {
		
		ListaAnunciosVector lAnuncios=new ListaAnunciosVector();
		ArrayListAnuncios alAnuncios=new ArrayListAnuncios();
		
		//creamos unos anuncios de radio y tv y los insertamos en el vector y en el arrayList
		
		AnuncioRadioTV aRTV1=new AnuncioRadioTV("Dixan", "Detergente", 5, "SER", 2, 3);
		AnuncioPrensa aP1=new AnuncioPrensa("Dixan", "Detergente", 6, "Detergente Dixan", 20);
		AnuncioRadioTV aRTV2=new AnuncioRadioTV("Audi 3", "Coche", 10, "SER", 3, 5);
		
		System.out.println();
		System.out.println("Lo vamos a manipular como un vector");
		System.out.println();
		lAnuncios.insertarAnuncio(aRTV1);lAnuncios.insertarAnuncio(aP1);lAnuncios.insertarAnuncio(aRTV2);
		
		lAnuncios.verAnuncios();		
		System.out.println("Coste total de todos los anuncios del vector"+lAnuncios.costeTotal());		
		System.out.println("Tiempo total de la emisora SER en el vector"+lAnuncios.sumaTiempoEmisora("SER"));

		System.out.println();
		System.out.println("Lo vamos a manipular como un arrayList");
		System.out.println();
		
		alAnuncios.insertarAnuncio(aRTV1);alAnuncios.insertarAnuncio(aP1);alAnuncios.insertarAnuncio(aRTV2);
		
		alAnuncios.verAnuncios();		
		System.out.println("Coste total de todos los anuncios en el arrayList"+alAnuncios.costeTotal());		
		System.out.println("Tiempo total de la emisora SER en el arrayList"+alAnuncios.sumaTiempoEmisora("SER"));
		
		
			

	}

}
