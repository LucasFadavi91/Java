package empleados;

import java.util.Scanner;

public class Empleadosporhoras extends Empleado{
	
	private double salarioporhoras;

	//CONSTRUCTOR
	public Empleadosporhoras(String nombre, String dni, String telefono, double salarioporhoras) {
		super(nombre, dni, telefono);
		this.salarioporhoras = salarioporhoras;
	}

	//GETS Y SETS
	public double getSalarioporhoras() {
		return salarioporhoras;
	}

	public void setSalarioporhoras(double salarioporhoras) {
		this.salarioporhoras = salarioporhoras;
	}

	@Override
	public String toString() {
		return super.toString()+ "Empleadosporhoras [salarioporhoras=" + salarioporhoras + "]";
	}
	
	//METODO CALCULAR SALARIO POR HORAS
		public double calcSalario() {
			
			Scanner  entrada=new Scanner(System.in);
			
			System.out.println("Introduce la retribucion por horas del trabajador");
			int retribucion = entrada.nextInt();
			
			System.out.println("Introduce las horas que trabaja en una jornada");
			int horas = entrada.nextInt();
			
			setSalarioporhoras(salarioporhoras=(retribucion*horas));
			
			return this.salarioporhoras;

		}
}
