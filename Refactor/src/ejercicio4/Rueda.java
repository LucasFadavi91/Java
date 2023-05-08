	

package ejercicio4;

	/**
	 * 	Clase Rueda:
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */

public class Rueda {
	
	/**
	 * Atributos radio, tipo que puede ser seco o mojado.
	 */

	private double radio;
	public enum Tipo {
	Seco,
	Mojado} ;
	public Tipo tipo;
	
	/**
	 * Constructor con todos los parametros
	 * al que le asignas radio determinado y un tipo
	 * aqui creas una nueva rueda.
	 */
	
	public Rueda(){
		radio=0.5;
		tipo=Tipo.Seco;
	}
	
	/**
	 * Constructor con todos los parametros
	 * al que le pasas por parametro radio determinado y le asignas un tipo
	 * aqui creas una nueva rueda.
	 *
	 */
	
	public Rueda(double radio){
		this.radio=radio;;
		tipo=Tipo.Seco;
	}
	
	/**
	 * Constructor con todos los parametros
	 * al que le pasas por parametro un radio determinado y un tipo
	 * aqui creas una nueva rueda.
	 */
	
	public Rueda(double radio, Tipo tipo){
		this.radio=radio;
		this.tipo=tipo;
	}
	
	/**
	 * Tipo.
	 *
	 * @param tipo 
	 */
	
	public void Tipo(Tipo tipo){
		
	}
	
	/**
	 * To string.
	 *
	 * @return string
	 */
	public String toString(){
		 String salida="DATOS DE LA RUEDA\n";
	        salida+="-------------\n";
	        salida+="Radio: "+radio+"\n";
	        salida+="Tipo rueda: "+tipo+"\n";
	        return salida;
	}

}