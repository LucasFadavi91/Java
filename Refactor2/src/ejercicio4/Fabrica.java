

package ejercicio4;


/**
 * 	Clase Fabrica:
 * 
 * 
 * 
 *@author Lucas Fadavi Solanilla
 *@version 1.0
 *@date 28 abr. 2020
 */

public class Fabrica {
	
	/**
	 * Atributos nombreFabrica, coches.
	 * 
	 */
	
	private String nombreFabrica;
	private Coche[]coches;

	/**
	 * Constructor todos los parametros
	 * creamos una nueva fabrica.
	 */
	
	public Fabrica(){
		nombreFabrica=null;
		coches=new Coche[100];
	}
	
	/**
	 * Sets el nombreFabrica.
	 *
	 * @param nombreFabrica el nuevo nombreFabrica
	 */
	public void setNombreFabrica(String nombreFabrica){
		this.nombreFabrica=nombreFabrica;
	}
	
	/**
	 * colocarCoche.
	 * coloca un coche en el array de coches
	 *
	 * @param coche 
	 * @return true or false
	 */
	
	public boolean colocarCoche(Coche coche){
		boolean libre=false;
		for(int i=0;i<coches.length;i++){
			if(coches[i]==null){
				coches[i]=coche;
				libre=true;
				break;
			}
		}
		return libre;
	}
	
	/**
	 * buscarCoche.
	 * por numero de bastidor
	 *
	 * @param numeroBastidor 
	 * @return coche
	 */
	public Coche buscarCoche(int numeroBastidor){
		Coche coche=new Coche();
		for(int i=0;i<coches.length;i++){
			if(coches[i].getnumeroBastidor()==numeroBastidor){
				coche=coches[i];
				break;
			}
		}
		return coche;
	}
	
	/**
	 * Gets el nombreFabrica.
	 *
	 * @return el nombreFabrica
	 */
	public String getnombreFabrica(){
		return nombreFabrica;
	}
}
