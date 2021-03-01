package ejVinilo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monton monton1 = new Monton();
		
		Monton monton2 = new Monton();
		
		Monton monton3 = new Monton();
		
		Balda estanteria [] = new Balda[6];
		
		for (int i = 0; i < estanteria.length; i++) {
			estanteria[i]=new Balda();	
		}
		
		
		/**************************************/
		Vinilo vin1 = new Vinilo("CorazonLatino", "David Bisbal", "Pop", 2, 2);
		Vinilo vin2 = new Vinilo("Chop Suey", "SystemOfaDown", "Rock", 1, 1);
		Vinilo vin3 = new Vinilo("BattleBorn", "The Killers", "Rock", 1, 1);
		Vinilo vin4 = new Vinilo("Allenrok", "Estopa", "Pop", 1, 1);
		
		Vinilo vin5 = new Vinilo("Comedown Machine", "The Strokes", "Rock", 3, 3);
		Vinilo vin6 = new Vinilo("Three Imaginary Boys", "The Cure", "Rock", 2, 4);
		Vinilo vin7 = new Vinilo("Angels", "The Strokes", "Rap", 4, 2);
		Vinilo vin8 = new Vinilo("Plastic Beach", "Gorillaz", "Pop", 2, 1);
		
		
		Vinilo vin9 = new Vinilo("Agila", "Extremoduro", "Rock", 1, 2);
		Vinilo vin10 = new Vinilo("El Circulo", "KaseO", "Rap", 3, 1);
		Vinilo vin11= new Vinilo("Love", "Britney Spears", "Romantico", 2, 1);
		Vinilo vin12= new Vinilo("Como el Agua", "Camaron", "Cantautor", 1, 1);
		Vinilo vin13 = new Vinilo("Amo a Laura", "Lady Gaga", "Romantico", 2, 2);
		Vinilo vin14 = new Vinilo("La Mandanga", "El Fary", "Cantautor", 3, 3);
		/**************************************/
		
		monton1.getMonton().push(vin1);
		monton1.getMonton().push(vin2);
		monton1.getMonton().push(vin3);
		monton1.getMonton().push(vin4);
		
		monton2.getMonton().push(vin5);
		monton2.getMonton().push(vin6);
		monton2.getMonton().push(vin7);
		monton2.getMonton().push(vin8);
		
		monton3.getMonton().push(vin9);
		monton3.getMonton().push(vin10);
		monton3.getMonton().push(vin11);
		monton3.getMonton().push(vin12);
		monton3.getMonton().push(vin13);
		monton3.getMonton().push(vin14);
		
		/********************************************/
		
		
		System.out.println("Los vinilos descolocados");
		System.out.println();
		
		//monton1
		while (!monton1.getMonton().empty()) {
			Vinilo viniloAux;
			viniloAux=monton1.getMonton().pop();
			
			if(viniloAux.getTema().equalsIgnoreCase("Rock"))
				estanteria[0].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Pop"))
				estanteria[1].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Rap"))
				estanteria[2].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Cantautor"))
				estanteria[3].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Romantica"))
				estanteria[4].addVinilo(viniloAux);
			else
				estanteria[5].addVinilo(viniloAux);
	
			System.out.println("Guardando el vinilo "+viniloAux.getTitulo());
		}
		
		
		System.out.println();
	
		//monton2
		while (!monton2.getMonton().empty()) {
			Vinilo viniloAux;
			viniloAux=monton2.getMonton().pop();
			
			if(viniloAux.getTema().equalsIgnoreCase("Rock"))
				estanteria[0].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Pop"))
				estanteria[1].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Rap"))
				estanteria[2].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Cantautor"))
				estanteria[3].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Romantica"))
				estanteria[4].addVinilo(viniloAux);
			else
				estanteria[5].addVinilo(viniloAux);
	
			System.out.println("Guardando el vinilo "+viniloAux.getTitulo());
		}
		
		System.out.println();
		
		//monton3
		while (!monton3.getMonton().empty()) {
			Vinilo viniloAux;
			viniloAux=monton3.getMonton().pop();
			
			if(viniloAux.getTema().equalsIgnoreCase("Rock"))
				estanteria[0].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Pop"))
				estanteria[1].addVinilo(viniloAux);
			
			else if(viniloAux.getTema().equalsIgnoreCase("Rap"))
				estanteria[2].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Cantautor"))
				estanteria[3].addVinilo(viniloAux);

			else if(viniloAux.getTema().equalsIgnoreCase("Romantica"))
				estanteria[4].addVinilo(viniloAux);
			else
				estanteria[5].addVinilo(viniloAux);
	
			System.out.println("Guardando el vinilo "+viniloAux.getTitulo());
		}
		
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < estanteria.length; i++) {
			System.out.println(estanteria[i].toString());
			
		}
		
	}

}
