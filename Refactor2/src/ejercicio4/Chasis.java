


package ejercicio4;


	/**
	 * 	Clase Chasis:
	 * 
	 * 
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */

public class Chasis {
	
	/**
	 * Atributos peso, color.
	 */
	
	private double peso;
	
	/**
	 *Metodo enum Color.
	 *nos proporciona uno color aleatorio entre los cinco disponibles
	 */
	
	//tipo enumerado con unos valores predefinidos
	enum Color{

		Azul, 
		Rojo, 
		Negro, 
		Amarillo, 
		Rosita} ;
	
	private Color color;
	public Chasis(){
		peso=50;
		color=Color.Rosita;
	}
	
	/**
	 * Crea un nuevo chasis.
	 *
	 * @param peso the peso
	 * @param color the color
	 */
	
	public Chasis(double peso, Color color){
		this.peso=peso;
		this.color=color;
	}
	
	/**
	 * To string.
	 *
	 * @return string
	 */
	public String toString(){
		String salida="DATOS DEL CHASIS\n";
		salida+="-----------------\n";
		salida+="Peso= " + peso + "\n";
		salida+="Color= " + color +"\n";
		return salida;
	}
}
