package sorteo;

public class Carta extends Sorteo {
	
	private String [] palo={"espadas","oros","bastos","copas"};
	private String [] numero={"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"}; 

	
	public Carta(int posibilidades) {
		super(posibilidades);
		this.palo = palo;
		this.numero = numero;
		
	}

	public String[] getPalo() {
		return palo;
	}

	public void setPalo(String[] palo) {
		this.palo = palo;
	}

	public String[] getNombre() {
		return numero;
	}

	public void setNombre(String[] numero) {
		this.numero = numero;
	}

	
	//METODO LANZAR
	
	public void lanzar() {
		
		int palo,numero;
		
		
		palo = (int) (Math.random()*4);

		numero = (int) (Math.random()*10);

		System.out.println("Tu Carta es : "+this.numero[numero]+" "+this.palo[palo]);
		
		
	
	}
	
}
