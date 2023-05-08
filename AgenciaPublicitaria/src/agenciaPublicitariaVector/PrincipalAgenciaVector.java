package agenciaPublicitariaVector;

public class PrincipalAgenciaVector {
	
	public static void main(String[] args) {
		ListaAnunciosVector lvAnuncios=new ListaAnunciosVector();
		
		//creamos unos anuncios de radio y tv y los insertamos en el vector
		
		AnuncioRadioTV aRTV1=new AnuncioRadioTV("Dixan", "Detergente", 5, "SER", 2, 3);
		AnuncioPrensa aP1=new AnuncioPrensa("Dixan", "Detergente", 6, "Detergente Dixan", 20);
		AnuncioRadioTV aRTV2=new AnuncioRadioTV("Audi 3", "Coche", 10, "SER", 3, 5);
		
		lvAnuncios.insertarAnuncio(aRTV1);
		lvAnuncios.insertarAnuncio(aP1);
		lvAnuncios.insertarAnuncio(aRTV2);
		
		lvAnuncios.verAnuncios();
		
		System.out.println("Coste total de todos los anuncios "+lvAnuncios.costeTotal());
		
		System.out.println("Tiempo total de la emisora SER "+lvAnuncios.sumaTiempoEmisora("SER"));
	
	}

}
