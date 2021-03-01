package treeSet;


import java.util.TreeSet;

public class SortedSetPagina {
	
	private TreeSet<Tarjeta> sortedSetPagina = new TreeSet<Tarjeta>();

	public TreeSet<Tarjeta> getSortedSetPagina() {
		
		return sortedSetPagina;	
	}
	public void addCardtoPage(Tarjeta cardAuxp) {
		
		sortedSetPagina.add(cardAuxp);
		
		
	}
	/*
	 * public void deleteCardtoPage(Tarjeta cardAuxp) {
	 * 
	 * 
	 * for (int j = 0; j < sortedSetPagina.size(); j++) {
	 * if(sortedSetPagina.contains(cardAuxp)) { sortedSetPagina.remove(j);
	 * System.out.println("Tarjeta borrada"); return; } } }
	 */
	
	
	/* public void compararporNombre() {
		// TODO Auto-generated method stub
		Collections.sort(sortedSetPagina, new compararNombre());
		System.out.println();
		for (int i = 0; i < sortedSetPagina.size(); i++) 
			System.out.println("	"+sortedSetPagina.get(i).getNombre());		 
	}	*/
}