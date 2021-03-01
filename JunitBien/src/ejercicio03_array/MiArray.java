package ejercicio03_array;

import java.util.Arrays;

public class MiArray {
	
		private int longitud;
		private int[] array;
		
		public MiArray (int longitud){
			this.longitud=longitud;
			array=new int[longitud];		
		}
		
		public MiArray(int[]array){
			this.longitud=array.length;
			this.array=array;
		}
		
		public int getLongitud() {
			return longitud;
		}

		public void setLongitud(int longitud) {
			this.longitud = longitud;
		}

		public int[] getArray() {
			return array;
		}

		public void setArray(int[] array) {
			this.array = array;
		}

		public void inicializar (){
			for (int i = 0; i < array.length; i++) {
				array[i]=(int)(Math.random()*10);
			}
		}
		
		public int minimo(){
			int min=Integer.MAX_VALUE;
			for (int i = 0; i < array.length; i++) {
				if (array[i]<min)
					min=array[i];
			}
			return min;
		}
		
		public MiArray ordenar(){
			int [] arrayAux=this.getArray();
			int aux;
			for (int i=0; i<arrayAux.length-1; i++)
				for (int j=i+1; j<arrayAux.length; j++)
					if (arrayAux[i]>arrayAux[j]) // si la componente i es menor que la siguiente las intercambio 
					     {						
							aux=arrayAux[i]; //intercambio la componente i con la siguiente
							arrayAux[i]=arrayAux[j]; //siempre se usa una variables auxiliar para no perder los valores durante el cambio
							arrayAux[j]=aux;
						}
			
			
			return (new MiArray(arrayAux));
		}
		
		public MiArray invertir(){ //este metodo genera un objeto Array que contiene ul array invertido
			MiArray inverso=new MiArray(this.longitud);//creo un objeto de la clase Array 
			//con la misma longitud que el atributo longitud
			for (int i=0; i<array.length; i++){
				inverso.array[this.longitud-1-i]=this.array[i]; //
			}
			return inverso;
			
		}
		
		public boolean buscar(int n){
			boolean enc=false;
			for (int i = 0; i < array.length; i++) {
				if (this.array[i]==n){
					enc=true;
					break;
				}			
			}
			return enc;
		}
		@Override
		public boolean equals (Object o){
			MiArray otro=(MiArray)o;
			if (otro.longitud!=this.longitud)
				return false;
			for (int i = 0; i < array.length; i++) {
				if(this.array[i]!=otro.array[i])
					return false;
			}
			return true;
		}
		
		//METODO BOOLEAN BUSQUEDA BINARIA
		public static boolean busquedaBinaria(int[] array, int numeroaBuscar) {
		    
			  int size = array.length;  // Número de elementos
			  int medio = size/2;        // Mitad del array
			    
			  System.out.println("tamano: " + size);
			  System.out.println("Mitad: " + medio);
			  System.out.println("Array: " + Arrays.toString(array));
			    
			  if (array[medio] == numeroaBuscar)
			    return true;
			  else if (size == 1)
			    return false;
			  else if (array[medio] > numeroaBuscar)
			    return busquedaBinaria(Arrays.copyOfRange(array,0,medio),numeroaBuscar);
			  else
			    return busquedaBinaria(Arrays.copyOfRange(array,medio+1,size),numeroaBuscar);    //copyOfRange Copia un array y lo devuelve en un nuevo array. 
			  																					 //Le indicamos la posición de origen y de destino.
			}

}
		
		
		
	
