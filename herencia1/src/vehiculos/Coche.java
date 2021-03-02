package vehiculos;

import java.util.Scanner;

public class Coche extends Vehiculo{
	

	private  final int  numRuedas=4;
	private String color;
	private int numeropasajeros;
	private boolean descapotable;
	
	//CONSTRUCTOR
	public Coche(String marca, String matricula, int autonomia, String color, int numeropasajeros,
			boolean descapotable) {
		super(marca, matricula, autonomia);
		this.color = color;
		this.numeropasajeros = numeropasajeros;
		this.descapotable = descapotable;
	}

	//GETS Y SETS
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeropasajeros() {
		return numeropasajeros;
	}

	public void setNumeropasajeros(int numeropasajeros) {
		this.numeropasajeros = numeropasajeros;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	public int getNumRuedas() {
		return numRuedas;
	}
	
	//METODO PINTAR COCHE
	public void pintar(){
		
		
		Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Dime de que color quieres pintar el coche");
		String option = entrada.next();
		setColor(option);
		System.out.println("El color que has elegido es " +color);
		
	}
	
	//METODO LISTAR COCHE
	public void listar(){
		
		System.out.println(toString());
	}
	
	//METODO ES O NO DESCAPOTABLE
	public String esDescapotable(){
		
		if(descapotable==true)
			return "Si";
		else
			return "No";
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Coche [numRuedas=" + numRuedas + ", color=" + color + ", numeropasajeros=" + numeropasajeros
				+ ", descapotable=" + descapotable + esDescapotable() + "]";
	}
	
	
}	

