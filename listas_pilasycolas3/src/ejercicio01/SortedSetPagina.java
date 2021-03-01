package ejercicio01;

import java.util.TreeSet;

public class SortedSetPagina {


		
		private TreeSet<Tarjeta> sortedsetpagina = new TreeSet<Tarjeta>();
		
		

		public TreeSet<Tarjeta> getsortedSetPagina() {
			
			return  sortedsetpagina;
			
			
		}
		
		
		public void addCardtosortedSetPage(Tarjeta cardAuxp) {
			
			sortedsetpagina.add(cardAuxp);
			
			
		}
		
	/*
	 * public void deleteCardtoPage(Tarjeta cardAuxp) {
	 * 
	 * 
	 * for (int j = 0; j < sortedsetpagina.size(); j++) {
	 * if(sortedsetpagina.get(j).equals(cardAuxp)) { sortedsetpagina.remove(j);
	 * System.out.println("Tarjeta borrada"); return; } }
	 * 
	 * }
	 */
			
	}


