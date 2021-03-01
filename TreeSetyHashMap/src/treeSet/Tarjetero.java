package treeSet;

import java.util.Stack;

public class Tarjetero {
	
	
	public Tarjetero() {
		
	}
	
	private Stack<Tarjeta> tarjetero = new Stack<Tarjeta>();
	
	public Stack<Tarjeta> getTarjetero() {
	
		return tarjetero;
	}
	
	public void addCard(Tarjeta cardAux) {
				
		tarjetero.push(cardAux);
		
		
	}
	public void deleteCard(Tarjeta cardAux) {
		
		tarjetero.pop();
		
		
	}
	
}