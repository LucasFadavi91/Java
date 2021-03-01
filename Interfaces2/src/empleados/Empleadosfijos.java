package empleados;

import java.util.Scanner;

import interfaces2.Ordenable;

public class Empleadosfijos extends Empleado implements Ordenable{
	
	private double salariomensual;

	//CONSTRUCTOR	
	public Empleadosfijos(String nombre, String dni, String telefono, double salariomensual) {
		super(nombre, dni, telefono);
		this.salariomensual = salariomensual;
	}

	//GETS Y SETS
	public double getSalariomensual() {
		return salariomensual;
	}

	public void setSalariomensual(double salariomensual) {
		this.salariomensual = salariomensual;
	}

	@Override
	public String toString() {
		return super.toString()+ "Empleadosfijos [salariomensual=" + salariomensual + "]";
	}
	
	//METODO CALCULAR SALARIO MENSUAL
	public double calcSalario() {
		
		Scanner  entrada=new Scanner(System.in);
		
		System.out.println("Introduce la ganancia total de la jornada del trabajador");
		int ganancia = entrada.nextInt();
		
		System.out.println("Introduce los dias que trabaja en un mes");
		int dias = entrada.nextInt();
		
		setSalariomensual(salariomensual=(ganancia*dias));
		
		return this.salariomensual;
		
		
	}

	@Override
	public boolean esMenor(Ordenable o) {
		
		if (o==null)
			return false;
		if (o instanceof Empleadosfijos)
			return (this.calcSalario()<((Empleadosfijos)o).calcSalario());
		else
			return false;

	}

	@Override
	public boolean esMayor(Ordenable o) {
		
		if (o==null)
			return false;
		if (o instanceof Empleadosfijos)
			return (this.calcSalario()>((Empleadosfijos)o).calcSalario());
		else
			return false;
	}
	
	

}
	
	


