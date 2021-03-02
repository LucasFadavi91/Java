package vehiculos;

public class MainVehiculos {

	public static void main(String[] args) {
		
		Vehiculo vehi;
		Coche ferrari;
		Camion loeches,taran;
		
		//VEHICULOS
		vehi = new Vehiculo("Toyoya","123cdf",10);
		System.out.println("informacion del Vehiculo : "+vehi);
		System.out.println();
		
		//COCHES
		ferrari = new Coche("Ferrari","123cdf",12,"Rojo",2,true);
		System.out.println("Informacion del Vehiculo : "+ferrari);
		
		//PINTAR
		
		//ferrari.pintar();
		System.out.println("Nueva informacion del Vehiculo : "+ferrari);
		System.out.println();
		System.out.println("Atributos del coche");
		
		//LISTAR
		ferrari.listar();
		
		//CAMIONES
		loeches = new Camion("Mercedes","343dty",24,5,5000,3200,"Benito");
		taran = new Camion("Citroen","415hkt",20,8,9000,4400,"Ivan");
		System.out.println();
		System.out.println("Datos camion : "+loeches);
		
		//CAMBIAR CONDUCTOR
		//loeches.cambiarConductor();
		System.out.println("Nuevos datos del camion : "+loeches);
		//AUMENTAR LA CARGA
		//System.out.println("La carga total es : "+loeches.cargar());
		//DISMINUIR LA CARGA
		System.out.println("Has disminuido la carga : "+loeches.disminuirCarga());
		//System.out.println("Nuevos datos de la carga camion : "+loeches);
		System.out.println();
		//LISTAR DATOS CAMION
		taran.listarCamion();
		
		
	}

}
