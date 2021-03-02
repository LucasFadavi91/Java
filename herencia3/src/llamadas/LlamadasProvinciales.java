package llamadas;

import java.util.Scanner;

public class LlamadasProvinciales extends Llamada {
	
	private final double costefranja1=0.20;
	private final double costefranja2=0.25;
	private final double costefranja3=0.30;
	
	
	//CONSTRUCTOR
	public LlamadasProvinciales(String numOrigen, String numDestino, double duracion) {
		super(numOrigen, numDestino, duracion);
		// TODO Auto-generated constructor stub
	}
	//GETS
	
	public double getCostefranja1() {
		return costefranja1;
	}
	public double getCostefranja2() {
		return costefranja2;
	}
	public double getCostefranja3() {
		return costefranja3;
	

	}
	
	//METODO TIPO LLAMADA
	public void tipollamada(){
		
		Scanner  entrada=new Scanner(System.in);
		
		
		String horario;
		
		
		do{
			

			System.out.println("Introduce la duracion de la llamada");
			int tiempo = entrada.nextInt();
			
			LlamadasProvinciales llamadaProvinaux = new LlamadasProvinciales("615385738", "623563275", tiempo);
			
			System.out.println("Selecciona la franja horaria");
			int option = entrada.nextInt();

				switch (option) {
				
				case 1: 
					llamadaProvinaux.getCostefranja1();
					System.out.println("El coste de tu llamada es: "+(tiempo*getCostefranja1()+" Centimos "));
					break;
					
				case 2: 
					llamadaProvinaux.getCostefranja2();
					System.out.println("El coste de tu llamada es: "+(tiempo*getCostefranja2()+" Centimos "));
					break;
					
				case 3: 
					llamadaProvinaux.getCostefranja3();
					System.out.println("El coste de tu llamada es: "+(tiempo*getCostefranja3()+" Centimos "));
					break;
				
				default:
					System.out.println("Opcion Incorrecta");
					break;}
			
			System.out.println("SI o NO ¿Quieres hacer otra llamada?");
			horario=entrada.next();
			
			setDuracion(llamadaProvinaux.getDuracion());
			
			
		}while(horario.equalsIgnoreCase("Si"));
		
		
		
		
		
	}

	@Override
	public String toString() {
		return super.toString()+" Costes de las franjas provinciales : [costefranja1=" + costefranja1 + ", costefranja2=" + costefranja2
				+ ", costefranja3=" + costefranja3 + "]";
		
	
	}
	
		
		
}
	
	
	
	

