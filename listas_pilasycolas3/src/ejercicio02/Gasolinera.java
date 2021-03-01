package ejercicio02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Gasolinera {
	
	private Surtidor surtidores[];
	Queue<Coche>auxcolaSurt; //esto es una cola auxiliar que he visto necesario crear para respetar el orden de salida de surtidores

	//CONSTRUCTOR
	public Gasolinera() {
		this.surtidores = new Surtidor[4];
			for (int i = 0; i < surtidores.length; i++) {
				surtidores[i]= new Surtidor();	
			}
		auxcolaSurt = new LinkedList<Coche>();
	}
	
	//en el constructor definimos el array, y no arriba en los atributos, e instanciamos los new Surtidor(). ESTO ES MUY IMPORTANTE
	
	//METODOS
	public Surtidor[] getSurtidores() {
		return surtidores;
	}

	public void setSurtidores(Surtidor[] surtidores) {
		this.surtidores = surtidores;
	}

	@Override
	public String toString() {
		return "Gasolinera [surtidores=" + Arrays.toString(surtidores) + "]";
	}

	//PRUEBAS
	/*
	Surtidor s1 = new Surtidor();
	Surtidor s2 = new Surtidor();
	Surtidor s3 = new Surtidor();
	Surtidor s4 = new Surtidor();
	
	
	Surtidor repsol[] = {s1, s2, s3, s4};
	*/


	
	//Metodos
	public void updateColas() {
		Coche cocheAux;
		for (int i = 0; i < surtidores.length; i++) {
			if (surtidores[i].getColaCoches().isEmpty())
				surtidores[i].setLibre(true);
		 /* else{
				cocheAux = repsol[i].getColaCoches().poll();
				repsol[i].setCoche(cocheAux);
				repsol[i].setLibre(false);
			}*/
		}	
	}

	public int comprobarColaCorta() {
		int minAux=Integer.MAX_VALUE;
		int auxpos=0;
		
		for (int i = 0; i < surtidores.length; i++) {
			if(surtidores[i].getColaCoches().size()<minAux) {
				auxpos=i;
				minAux=surtidores[i].getColaCoches().size();
			}
		}
		return auxpos;
	}
	
	
	public void addCocheSurtidor (Coche coche) {
		for (int i = 0; i < surtidores.length; i++) {
			if(surtidores[i].isLibre()==true) {
				surtidores[i].setCoche(coche);
				surtidores[i].setLibre(false);
				System.out.println("Añadido al Surtidor"+(i+1));
				auxcolaSurt.add(coche);
				return;}
		}
				System.out.println("Lo añado a la COLA del S"+(comprobarColaCorta()+1));
				surtidores[comprobarColaCorta()].getColaCoches().add(coche);
				auxcolaSurt.add(coche);
				
			
		
	}
	//metodo classic
	public void salidaCocheGasolinera () {
		Coche cocheAux;
		for (int i = 0; i < surtidores.length; i++) {
			if (surtidores[i].getCoche()==auxcolaSurt.peek()) {
				surtidores[i].setCoche(null);
				auxcolaSurt.poll();
				
				if(!(surtidores[i].getColaCoches().isEmpty())) {
					cocheAux = surtidores[i].getColaCoches().poll();
					surtidores[i].setCoche(cocheAux);
					return;
					}
				else if (surtidores[i].getColaCoches().isEmpty()) {
					surtidores[i].setLibre(true);
					return;}
					
			}
		}
	} 
	
	//metodo idea jorge
/*	public void salidaCocheGasolinera (Coche coche) {
		Coche cocheAux;
		for (int i = 0; i < repsol.length; i++) {
			if (surtidores[i].getCoche()==coche) {
				surtidores[i].setCoche(null);
				
				if(!(surtidores[i].getColaCoches().isEmpty())) {
					cocheAux = surtidores[i].getColaCoches().poll();
					surtidores[i].setCoche(cocheAux);
					return;}
				else if (surtidores[i].getColaCoches().isEmpty()){
					surtidores[i].setLibre(true);
					return;}
			}
		}
	} */
	
	
	
	public void listarDatos() {
		for (int i = 0; i < surtidores.length; i++) {
			System.out.println(surtidores[i].toString());
		}
	}
	
}
