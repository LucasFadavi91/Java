package jefesyObreros;


public class Empleado extends Empresa{
	
	private String nombre;
	private int edad;
	private double sueldo;
	private String codigoEmp;
	
	//CONSTRUCTOR
	public Empleado(String nombre, int edad, double sueldo, String codigoEmp) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.codigoEmp = codigoEmp;
	}

	//GETS AND SETS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", codigoEmp=" + codigoEmp
				+ "]";
	}
	
	

}
