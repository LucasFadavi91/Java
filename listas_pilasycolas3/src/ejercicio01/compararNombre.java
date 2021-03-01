package ejercicio01;

import java.util.Comparator;

public class compararNombre implements Comparator<Tarjeta> {

	@Override
	public int compare(Tarjeta o, Tarjeta o2) {
		// TODO Auto-generated method stub
		return o.getNombre().compareToIgnoreCase(o2.getNombre());
	}

	
}
