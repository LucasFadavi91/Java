package viviendas;

public abstract class TestViviendas {

	public static void main(String[] args) {
		
		Vivienda vivi1;
		Chalet chal1,chal2;
		Palacio pal1;
		
		vivi1=new Vivienda(3,300,"Desconocida","656554243");
		chal1=new Chalet(5,600,"Gloria","755524552",100,true);
		chal2=new Chalet(6,700,"Deguay","654433331",85,false);
		pal1=new Palacio(3000,"Ricos","62144358",true);
		
		//ARRAY DE VIVIENDAS
		Vivienda [] arrayViviendas={vivi1,chal1,chal2,pal1};
		

		
		
		visualizarArray(arrayViviendas);
		
		contarChalets(arrayViviendas);
		
		
	}
	//METODO VISUALIZAR LOS OBJETOS DEL ARRAY
	public static void visualizarArray(Vivienda [] array){
		
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]+" ");
			
		} 
	
}
	//METODO CONTAR CHALETS
	public static void contarChalets(Vivienda[] array){
		
		int cont=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].getClass().getSimpleName().equals("Chalet"))
				cont++;
			System.out.println(array[i].toString());
		
			
			
			
		}
		System.out.println("Hay " + cont + " Chalets");
	}
	

}
