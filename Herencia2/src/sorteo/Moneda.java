package sorteo;

public class Moneda extends Sorteo{

	public Moneda(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}
	
	//METODO LANZAR
	public void lanzar() {
		
	
		
		if((int) (Math.random()*2+1)<2) 
		
		System.out.println("ha salido cara");
		
		else 
			
		System.out.println("Ha salido cruz");
	
			
		 
		
	}

	@Override
	public String toString() {
		return "Moneda [posibilidades=" + posibilidades + "]";
	}
	
	

}
