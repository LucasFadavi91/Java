package ejer1Interfaz;

public interface IArray {
	
	void addFirst(int elem); //a�ade el elemento en la primera posici�n del array desplazando todos dem�s a la derecha. Hay que comprobar si hay espacio suficiente.
		
	void addLast(int elem); //a�ade el elemento al final del array
	
	void removeFirst(); // borra el primer elemento del array desplazando todos los dem�s hacia la izquierda. Hay que comprobar que no est� vac�o.
	
	void removeLast(); //�dem el �ltimo
	
	void insertAt(int index, int elem); //inserta el elem en la posici�n index desplazando los dem�s.
	
	boolean	isEmpty();
	
	boolean	contains(int elem); //devuelve si el elem est� o no en el array
	
	int getSize(); //devuelve el tama�o real del array (no length)
	
	int getIndexOf(int elem); //devuelve la posici�n d�nde se encuentra el elem o -1
	
	int	getFirst(); //devuelve el primer elemento
	
	int getLast();
	
	int	removeAt(int index);
	
	void removeAll(int elem); //elimina todas las ocurrencias de elem
	
	String toString(); 


}
