
package ejercicio4;

	/**
	 * 	Clase Motor:
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */

public class Motor {
	
	/**
	 * Atributos cilindrada, potencia, consumo.
	 */
	
	private int cilindrada;
	private int potencia;
	private double consumo;

	/**
	 * Constructor vacio
	 * Aqui creas un nuevo Motor
	 * 
	 */
	public Motor() {
	}

	/**
	 * Gets la getCilindrada.
	 *
	 * @return  getCilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Sets  getCilindrada.
	 *
	 * @param cilindrada la nueva getCilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Gets la getPotencia.
	 *
	 * @return  getPotencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * Sets la getPotencia.
	 *
	 * @param potencia la nueva getPotencia
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * Gets el getConsumo.
	 *
	 * @return el getConsumo
	 */
	public double getConsumo() {
		return consumo;
	}

	/**
	 * Sets el getConsumo.
	 *
	 * @param consumo el nuevo getConsumo
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}