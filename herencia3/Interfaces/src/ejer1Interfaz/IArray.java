package ejer1Interfaz;

public interface IArray {
	
	void addFirst(int elem); //añade el elemento en la primera posición del array desplazando todos demás a la derecha. Hay que comprobar si hay espacio suficiente.
		
	void addLast(int elem); //añade el elemento al final del array
	
	void removeFirst(); // borra el primer elemento del array desplazando todos los demás hacia la izquierda. Hay que comprobar que no está vacío.
	
	void removeLast(); //ídem el último
	
	void insertAt(int index, int elem); //inserta el elem en la posición index desplazando los demás.
	
	boolean	isEmpty();
	
	boolean	contains(int elem); //devuelve si el elem está o no en el array
	
	int getSize(); //devuelve el tamaño real del array (no length)
	
	int getIndexOf(int elem); //devuelve la posición dónde se encuentra el elem o -1
	
	int	getFirst(); //devuelve el primer elemento
	
	int getLast();
	
	int	removeAt(int index);
	
	void removeAll(int elem); //elimina todas las ocurrencias de elem
	
	String toString(); 


}
