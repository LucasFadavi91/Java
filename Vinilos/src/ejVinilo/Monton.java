package ejVinilo;

import java.util.Stack;

public class Monton {
	
	
	public Monton() {
		
	}
	
	private Stack<Vinilo> Monton = new Stack<Vinilo>();
	
	public Stack<Vinilo> getMonton() {
	
		return Monton;
	}
	
	public void addVinilo(Vinilo viniloAux) {
				
		Monton.push(viniloAux);
		
		
	}
	public void deleteVinilo(Vinilo viniloAux) {
		
		Monton.pop();
		
		
	}
	
}