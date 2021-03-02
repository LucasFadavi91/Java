package llamadas;

import java.util.Scanner;

public class LLamadaslocales extends Llamada {

	private final double coste=0.15;

	//CONSTRUCTOR
	public LLamadaslocales(String numOrigen, String numDestino, double duracion) {
		super(numOrigen, numDestino, duracion);
		// TODO Auto-generated constructor stub
	}
	
	//GET
	public double getCoste() {
		return coste;
	}

	
	//METODO TIPO DE LLAMADA
	public void tipollamada(){
		
		Scanner  entrada=new Scanner(System.in);
		
		
		System.out.println("Introduce la duracion de la llamada");
		int tiempo = entrada.nextInt();
		
		LLamadaslocales llamadalocalaux = new LLamadaslocales("623535336", "776353756", tiempo);
	
		
		System.out.println("El coste de tu llamada es: "+(tiempo*coste)+" Centimos ");
		
		setDuracion(llamadalocalaux.getDuracion());
		
		
			
	}

	@Override
	public String toString() {
		return super.toString()+"LLamadaslocales [coste=" + coste + "]";
	}
		
	
}
	
	


