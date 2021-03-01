package ejVinilo;

import java.util.LinkedList;


public class Cara {
	
	private LinkedList<Cancion> cara = new LinkedList<Cancion>();

	public LinkedList<Cancion> getCara() {
		
		return cara;

		
		}
		public void addSongtoCara(Cancion songAux) {
			
			cara.add(songAux);
			
			
		}
		public void deleteSongtoCara(Cancion songAux) {
			
			
			for (int j = 0; j < cara.size(); j++) {
				if(cara.get(j)==songAux){
					cara.remove(j);
					System.out.println("Cancion borrada");
					return;
						}
					}
				
		}
		
}