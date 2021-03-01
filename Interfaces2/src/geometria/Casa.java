package geometria;

public class Casa implements Geometria{

	String direccion;
	int num_Habita;
	int superficie;
	int perimetro;
	
	public Casa(String direccion, int num_Habita, int superficie, int perimetro){
		this.direccion=direccion;
		this.num_Habita=num_Habita;
		this.superficie=superficie;
		this.perimetro=perimetro;
	}
	
	@Override
	public double calcularArea() {
		
		return this.superficie;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.perimetro;
	}

}
