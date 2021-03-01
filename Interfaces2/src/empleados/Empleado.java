package empleados;


public abstract class Empleado{
	
	private String nombre;
	private String dni;
	private String telefono;
	
	
	//CONSTRUCTOR
	public Empleado(String nombre, String dni, String telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}

	//GETS Y SETS
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}
	public abstract double calcSalario();
		
	
}
