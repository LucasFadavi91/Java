package sorteo;

public class Dado extends Sorteo{

	public Dado(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}
	
	//METODO LANZAR
	public void lanzar() {
		
		 System.out.println("El numero del dado es : "+(int) (Math.random()*6+1));
		  
		 
		
	}


	@Override
	public String toString() {
		return "Dado [posibilidades=" + posibilidades + "]";
	}
	
	
		
}


