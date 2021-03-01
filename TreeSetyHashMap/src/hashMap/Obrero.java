package hashMap;

public class Obrero extends Empleado {
	
	private static int codigoObrero=1;
	
	private Jefe jefe;

	//CONSTRUCTOR
	
	public Obrero(String nombre, int edad, double sueldo,
			Jefe jefe) {
		super(nombre, edad, sueldo, "O"+codigoObrero);
		this.jefe = jefe;
		codigoObrero++;
	}

	//GETS Y SETS
	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}
	
	protected String getCodigo() {
		return "O"+codigoObrero;
	}

	@Override
	public String toString() {
		return super.toString()+ "Obrero [jefe=" + jefe.getNombre() + "]";
	}

	
}

	

	
	


