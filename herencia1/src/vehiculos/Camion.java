package vehiculos;

import java.util.Scanner;

public class Camion extends Vehiculo{
	
	
	private  int  numRuedas;
	private int limitecarga;
	private int carga;
	private String conductor;
	
	//CONSTRUCTOR
	public Camion(String marca, String matricula, int autonomia, int numRuedas, int limitecarga, int carga,
			String conductor) {
		super(marca, matricula, autonomia);
		this.numRuedas = numRuedas;
		this.limitecarga = limitecarga;
		this.carga = carga;
		this.conductor = conductor;
	}

	
	//GETS Y SETS
	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getLimitecarga() {
		return limitecarga;
	}

	public void setLimitecarga(int limitecarga) {
		this.limitecarga = limitecarga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	//METODO CAMBIAR CONDUCTOR
	public void cambiarConductor(){
		
		
		Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Llama a un nuevo conductor para el camion");
		String option = entrada.next();
		setConductor(option);
		System.out.println("Has seleccionado a " +conductor);
		
	}
	//METODO AUMENTAR LA CARGA
	public int cargar(){
		
		Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Carga el camion");
		int cargamento = entrada.nextInt();
		if((cargamento+carga)<=limitecarga){
			setCarga(carga+cargamento);
			return this.carga;}
		else
			return this.limitecarga;
		
		}
	
	//METODO DISMINUIR LA CARGA
	public int disminuirCarga(){
		
	Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Disminuye la carga");
		int dismi = entrada.nextInt();
		if ((dismi-carga)<=carga){
			setCarga(carga-dismi);
			return this.carga;}
		else
			return this.carga=0;
	
		
	}
	//METODO LISTAR CAMION
	public void listarCamion(){
		
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return super.toString()+ "Camion [numRuedas=" + numRuedas + ", limitecarga=" + limitecarga + ", carga=" + carga + ", conductor="
				+ conductor + "]";
	}
	
	

	
}
	

	


