package algoritmos;

import interfaces2.Ordenable;

public class Algoritmos implements Ordenable{

	public static void ordenar(Ordenable[] array) {

		Ordenable aux;
		for (int i=0;i<array.length-1;i++)
			for (int j=i+1; j<array.length;j++)
				if (array[i].esMayor(array[j])){
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;}

		System.out.println("El array esta ordenado");
	}
	public static Ordenable maximo(Ordenable[] array) {

		Ordenable aux=array[0];
		for (int i=1;i<array.length;i++)
			if (array[i].esMayor(aux))
				aux=array[i];

		return aux;
	}


	public static Ordenable minimo(Ordenable[] array){
		Ordenable aux=array[0];
		for (int i=1;i<array.length;i++)
			if (array[i].esMenor(aux))
				aux=array[i];

		return aux;
	}

	@Override
	public boolean esMenor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean esMayor(Ordenable o) {
		// TODO Auto-generated method stub
		return false;
	};




}
