package ejercicio4BIS;

public class Motor {
	
	public static Motor createMotor() {
		return new Motor();
	}

	private int cilindrada;
	private int potencia;
	private double consumo;

	private Motor() {
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}