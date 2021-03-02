package ejer1Interfaz;

public class ListArray implements IArray {
	
	private int [] arrayEnteros;
	
	private int numElem;
	
	//CONSTRUCTOR
	
	public ListArray(int[] arrayEnteros, int numElem) {
		super();
		this.arrayEnteros = arrayEnteros;
		this.numElem = numElem;
	}
	
	public ListArray(int lenght) {
		super();
		this.arrayEnteros = new int [lenght];
	}	


	//GETS Y SETS
	public int[] getArrayEnteros() {
		return arrayEnteros;
	}

	public void setArrayEnteros(int[] arrayEnteros) {
		this.arrayEnteros = arrayEnteros;
	}

	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	//METODOS IMPLEMENTADOS
	
	@Override
	public void addFirst(int elem) {
		

		if(this.numElem < this.arrayEnteros.length){
			for (int i = 0; i < arrayEnteros.length; i--) {
				this.arrayEnteros[i+1]=this.arrayEnteros[i];
			}
			
		}

		}
		

	


	@Override
	public void addLast(int elem) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insertAt(int index, int elem) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean contains(int elem) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getIndexOf(int elem) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int removeAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void removeAll(int elem) {
		// TODO Auto-generated method stub
		
	}
	
	
}
