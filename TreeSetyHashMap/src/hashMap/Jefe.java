package hashMap;

import java.util.ArrayList;

public class Jefe extends Empleado{
	
	private static int codigoJefe=1;
	
	private ArrayList<Obrero> obreros;

	//CONSTRUCTOR
	public Jefe(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo, "J"+codigoJefe);
		this.obreros = new ArrayList<Obrero>();
		codigoJefe++;
	}

	//GETS AND SETS
	public ArrayList<Obrero> getObreros() {
		return obreros;
	}

	public void setObreros(ArrayList<Obrero> obreros) {
		this.obreros = obreros;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}



	
	


