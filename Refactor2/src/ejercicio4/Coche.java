


package ejercicio4;

	/**
	 * 	Clase Coche:
	 * 
	 * 
	 * 
	 *@author Lucas Fadavi Solanilla
	 *@version 1.0
	 *@date 28 abr. 2020
	 */
	

public class Coche {
	
	/**
	 * Atributos numeroBastidor, data, posicion=new Rueda=4, chasis.
	 * cada coche tiene un array de ruedas que contiene como maximo 4
	 */
	
	private int numeroBastidor;
	private Motor data = new Motor();
	private Rueda []posicion;
	private Chasis chasis;
	
	/**
	 * Constructor de coche al que solo le pasamos el parametro 
	 * Rueda
	 * 
	 */
	
	public Coche(){
		posicion=new Rueda[4];
		
	}
	
	/**
	 * Constructor de coche
	 * creamos un nuevo coche.
	 * recorriendo el array de ruedas con un for
	 *
	 * @param numeroBastidor el numeroBastidor
	 * @param chasis el chasis
	 * @param rueda la rueda
	 */

	 
	public Coche(int numeroBastidor, Chasis chasis, Rueda rueda){
		this.numeroBastidor=numeroBastidor;
		this.chasis=chasis;
		posicion=new Rueda[4];
		for(int i=0;i<posicion.length;i++)
			posicion[i]=rueda;
	}
	
	/**
	 * Otro Constructor de coche con todos los parametros
	 * Creamos un nuevo coche.
	 *
	 * @param numeroBastidor el numeroBastidor
	 * @param cilindrada la cilindrada
	 * @param potencia la potencia
	 * @param consumo el consumo
	 * @param posicion la posicion
	 * @param chasis el chasis
	 */
	public Coche(int numeroBastidor, int cilindrada, int potencia,
			double consumo, Rueda[] posicion, Chasis chasis) {
		this.numeroBastidor = numeroBastidor;
		this.data.setCilindrada(cilindrada);
		this.data.setPotencia(potencia);
		this.data.setConsumo(consumo);
		this.posicion = posicion;
		this.chasis = chasis;
	}
	
	/**
	 * Gets el numeroBastidor.
	 *
	 * @return el numeroBastidor
	 */
	public int getNumeroBastidor() {
		return numeroBastidor;
	}
	
	/**
	 * Sets el numeroBastidor.
	 *
	 * @param numeroBastidor el nuevo numeroBastidor
	 */
	public void setNumeroBastidor(int numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}
	
	/**
	 * Gets la getCilindrada.
	 *
	 * @return la getCilindrada
	 */
	public int getCilindrada() {
		return data.getCilindrada();
	}
	
	/**
	 * Sets la getCilindrada.
	 *
	 * @param cilindrada la nueva getCilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.data.setCilindrada(cilindrada);
	}
	
	/**
	 * Gets la getPotencia.
	 *
	 * @return getPotencia
	 */
	public int getPotencia() {
		return data.getPotencia();
	}
	
	/**
	 * Sets la getPotencia.
	 *
	 * @param potencia la nueva getPotencia
	 */
	public void setPotencia(int potencia) {
		this.data.setPotencia(potencia);
	}
	
	/**
	 * Gets el getConsumo.
	 *
	 * @return el getConsumo
	 */
	public double getConsumo() {
		return data.getConsumo();
	}
	
	/**
	 * Sets el getConsumo.
	 *
	 * @param consumo el nuevo getConsumo
	 */
	public void setConsumo(double consumo) {
		this.data.setConsumo(consumo);
	}
	
	/**
	 * Gets la getPosicion.
	 *
	 * @return la getPosicion
	 */
	public Rueda[] getPosicion() {
		return posicion;
	}
	
	/**
	 * Sets la setPosicion.
	 *
	 * @param posicion la nueva setPosicion
	 */
	public void setPosicion(Rueda[] posicion) {
		this.posicion = posicion;
	}
	
	/**
	 * Gets el getChasis.
	 *
	 * @return getChasis
	 */
	public Chasis getChasis() {
		return chasis;
	}
	
	/**
	 * Sets setChasis.
	 *
	 * @param chasis le nuevo setChasis
	 */
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	
	/**
	 * ponerChasis.
	 *
	 * @param chasis
	 */
	public void ponerChasis(Chasis chasis){
		this.chasis=chasis;
	}
	
	/**
	 * ponerRueda.
	 *
	 * @param rueda 
	 */
	public void ponerRueda(Rueda rueda){
		for(int i=0;i<posicion.length;i++)
			this.posicion[i]=rueda;
	}
	
	/**
	 * Gets el numeroBastidor.
	 *
	 * @return el numeroBastidor
	 */
	public int getnumeroBastidor(){
		return numeroBastidor;
	}
	
	/**
	 * To string.
	 *
	 * @return string
	 */
	public String toString(){
		String salida="DATOS DEL COCHE\n";
		salida+="-----------------\n";
		salida+="numero de bastidor: "+numeroBastidor + "\n";
		salida+=chasis.toString() + "\n";
		for(int i=0;i<posicion.length;i++)
		salida+=posicion[i].toString() +"\n";
		return salida;
	}
}
