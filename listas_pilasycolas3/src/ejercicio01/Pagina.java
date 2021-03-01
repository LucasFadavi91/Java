package ejercicio01;


import java.util.Collections;
import java.util.LinkedList;


public class Pagina  {
	

	private LinkedList<Tarjeta> pagina = new LinkedList<Tarjeta>();
	
	public LinkedList<Tarjeta> getPagina() {
		
		return  pagina;
		
		
	}

	
	
	public void addCardtoPage(Tarjeta cardAuxp) {
		
		pagina.add(cardAuxp);
		
		
	}
	
	
	public void deleteCardtoPage(Tarjeta cardAuxp) {
			
			
			for (int j = 0; j < pagina.size(); j++) {
				if(pagina.get(j).equals(cardAuxp)) {
					pagina.remove(j);
					System.out.println("Tarjeta borrada");
					return;
						}
					}
				
		}
			
	
	
	  public void compararporNombre() { 
		  // TODO Auto-generated method stub
	  
	  Collections.sort(pagina, new compararNombre()); System.out.println(); 
	  for (Tarjeta tarjeta : pagina) {
		  System.out.println("	"+tarjeta.getNombre());
	}
	  
		
		  for(int i = 0; i < pagina.size(); i++)
		  System.out.println("	"+pagina.get(i).getNombre());
		 
	  
	  }
	 

	
}

