package vz07Tarjetero.ejercicio01;


public class Main_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tarjetero tarjetero = new Tarjetero();
	
		Pagina agenda [] = new Pagina[26];
		
		for (int i = 0; i < agenda.length; i++) {
			agenda[i]=new Pagina();
		}
		
		Tarjeta tar1 = new Tarjeta("Fadavi Solanilla Lucas", "62466246");
		Tarjeta tar2 = new Tarjeta("Gonzalez Bustos Javier", "62356343");
		Tarjeta tar3 = new Tarjeta("Blazquez Alvarez Jorge", "62346634");
		Tarjeta tar4 = new Tarjeta("Gonzalez Carretero Daniel", "77766246");
		Tarjeta tar5 = new Tarjeta("Santiago Gonzalez Marco", "625323653");
		Tarjeta tar6 = new Tarjeta("Garcia Ortiz Enrique", "75346346");
		Tarjeta tar7 = new Tarjeta("Garcia Pinto Sergio", "75645454");
		Tarjeta tar8 = new Tarjeta("Cristea, Alexandru Ionut", "64325253");
		
	
		tarjetero.getTarjetero().push(tar1);
		tarjetero.getTarjetero().push(tar2);
		tarjetero.getTarjetero().push(tar3);
		tarjetero.getTarjetero().push(tar4);
		tarjetero.getTarjetero().push(tar5);
		tarjetero.getTarjetero().push(tar6);
		tarjetero.getTarjetero().push(tar7);
		tarjetero.getTarjetero().push(tar8);
		

		System.out.println("Tarjetas desordenadas: ");
		System.out.println();
		Tarjeta tarjetaAux;
		int tamano=tarjetero.getTarjetero().size();
		for (int i = 0; i  < (tamano); i++) {
				tarjetaAux=tarjetero.getTarjetero().pop();
				int ascii=(int)tarjetaAux.getNombre().charAt(0);
				agenda[(ascii)-65].addCardtoPage(tarjetaAux);
				System.out.println("Guardando la tarjeta de "+tarjetaAux.getNombre()+" en la pagina "+((char)(ascii)));
			}
		
		System.out.println();
		System.out.println("Tarjetas ordenadas por nombre en su pagina correspondiente: ");
		System.out.println();
		for (int j = 0; j < agenda.length; j++) {
			if(!(agenda[j].getPagina().isEmpty())) {
					System.out.println();
					System.out.println("Pagina "+((char)(j+65)));
					agenda[j].compararporNombre();
			}
				
			}
			System.out.println();
			System.out.println("Iterable: ");
			System.out.println();
			int contj=-1;
			for (Pagina pagina : agenda) {
				contj++;
				if(!(pagina.getPagina().isEmpty())) {
					System.out.println("Pagina "+((char)(contj+65)));	
				System.out.println("	"+pagina.getPagina().toString());}
		
			}
		
		}

}
