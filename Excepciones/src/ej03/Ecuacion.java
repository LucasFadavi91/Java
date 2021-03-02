package ej03;



public class Ecuacion {

	private int a;
	private int b;
	private int c;
	
	
	
	public Ecuacion(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		//this.solucion1 = (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
		//this.solucion2 = (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
	}
		

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}

	public void calcSolucion(Ecuacion ecuacion) throws Exception {
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el valor de a");
		int a=entrada.nextInt();
		System.out.println("Escribe el valor de b");
		int b=entrada.nextInt();
		System.out.println("Escribe el valor de c");
		int c=entrada.nextInt();
		
		Ecuacion ecuacion= new Ecuacion(a, b, c);*/

		double solucion1;
		double solucion2;
		int option=0;
	
		if (ecuacion.getA()==0 && ecuacion.getB()==0) 
			option=1;
		else if((Math.pow(ecuacion.getB(),2) - 4*ecuacion.getA()*ecuacion.getC())<0)
			option=2;
		else if (ecuacion.getA()==0)
			option=3;
		else
			option=4;
		
		Exception k;
		
		switch(option) {
		  case 1:
			  	k=new Exception(" Ecuacion degenarada");
				throw k;
		  case 2:
			  	k=new Exception(" Ecuacion compleja");
				throw k;
		  case 3:
			  	k=new Exception(" Unica Raiz, y es x="+ecuacion.getC()/ecuacion.getB());
				throw k;
		  case 4:
			  solucion1 = (-ecuacion.getB()+(Math.sqrt(Math.pow(ecuacion.getB(),2)-4*ecuacion.getA()*ecuacion.getC())))/(2*ecuacion.getA());
			  solucion2 = (-ecuacion.getB()-(Math.sqrt(Math.pow(ecuacion.getB(),2)-4*ecuacion.getA()*ecuacion.getC())))/(2*ecuacion.getA());
			  System.out.println("Las soluciones son x1: "+solucion1+" y x2: "+solucion2);
		  default:
		   
		}
		
	}


	@Override
    public String toString() {
        return "Ecuacion: ["+a +"x^2 + "+b+"x + "+c+"]";
    }



	}		
			
		
	
