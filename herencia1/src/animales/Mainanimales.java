package animales;

public class Mainanimales {

	public static void main(String[] args) {
		
		Animal rana1; 
		Mamifero perro1,ballena1;
		Ave paloma1,avestruz1;
		
		
		rana1=new Animal ("Rana","Toro",0.25,5.5);
		ballena1=new Mamifero("Ballena","Azul",150.000,2500,1,12);
		perro1=new MamiferosTerrestre("Perro","fox",30,110,2,4,4);
		paloma1=new Ave("Paloma","Columbidae",0.360,29,2,true);
		avestruz1=new Ave("Avestruz","Struthio camelus",120,2.80,8,false);
		
		System.out.println("Datos Iniciales");
		
		//RANA
		System.out.println("Datos : "+rana1);
		//BALLENA
		System.out.println("Datos : "+ballena1);
		//PERRO
		System.out.println("Datos : "+perro1);
		//PALOMA
		System.out.println("Datos : "+paloma1);
		//AVESTRUZ
		System.out.println("Datos : "+avestruz1);
		
		
		System.out.println();
		//apartado3
		rana1.setPeso(0.30);
		//apartado4
		ballena1.setPeso(140.000);
		//apartado7
		ballena1.setMesesEmbarazo(11);
		//apartado5
		paloma1.setNumeroHuevos(3);
		//apartado6
		perro1.setTamaño(perro1.incrementarTamaño());
		//apartado8
		//No se puede porque la rana es un Animal y no un mamifero y por lo tanto no se puede invocar el setMesesEmbarazo de la clase Mamifero
		
		System.out.println("Nuevos Datos");
		//RANA
		System.out.println("Datos : "+rana1);
		//BALLENA
		System.out.println("Datos : "+ballena1);
		//PERRO
		System.out.println("Datos : "+perro1);
		//PALOMA
		System.out.println("Datos : "+paloma1);
		//AVESTRUZ
		System.out.println("Datos : "+avestruz1);
	
		
	}

}
