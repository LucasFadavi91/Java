package ejercicioempresa;

public class Empleado {
	private int codigoEmp;
	private String nombreEmp;
	private double sueldo;
	
	public Empleado(int codigoEmp, String nombreEmp, double sueldo) {
		this.codigoEmp = codigoEmp;
		this.nombreEmp = nombreEmp;
		this.sueldo = sueldo;
		
	}	
	public Empleado() {
		
	}
	
	//METODO INCREMENTAR SUELDO
	
	public double incrementarSueldo(){
		//Empleado empAux = new Empleado (codigoEmp, nombreEmp, sueldo);
		
		return (this.sueldo+this.sueldo*0.10);}
	
	
	

	public int getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(int codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
		
	}

	@Override
	public String toString() {
		return "Empleado [codigoEmp=" + codigoEmp + ", nombreEmp=" + nombreEmp + ", sueldo=" + sueldo + "]";
	}
	
	
}
