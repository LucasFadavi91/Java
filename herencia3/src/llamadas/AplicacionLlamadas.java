package llamadas;

public class AplicacionLlamadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LlamadasProvinciales llamada1 = new LlamadasProvinciales("615385738", "623563275", 0);
		LlamadasProvinciales llamadaprovin = new LlamadasProvinciales("715385738", "723563275", 0);
		LLamadaslocales llamada2 = new LLamadaslocales("623535336", "776353756", 0);
		LLamadaslocales llamadalocal = new LLamadaslocales("723535336", "676353756", 0);
		
		Llamada [] Centralita={llamada1,llamada2,llamadalocal,llamadaprovin};
		
		System.out.println("Tipos de llamada");
		contarLlamadas(Centralita);
		System.out.println();
		//LLAMADA PROVINCIAL
		llamada1.tipollamada();
		System.out.println();
		System.out.println(llamada1);
		System.out.println();
		
		//LLAMADA LOCAL
		llamada2.tipollamada();
		System.out.println();
		System.out.println(llamada2);
		//FACTURACION
		System.out.println("Total facturado es : "+((llamada2.getCoste()*llamada2.getDuracion())+(llamada1.getCostefranja3()*llamada1.getDuracion()))+" Centimos ");
		
		
		
		
	}
	
	//METODO CONTAR LLAMADAS
	public static void contarLlamadas(Llamada[] array){
		
		int cont=0;
		int cont2=0;
		int conttotal=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof LlamadasProvinciales){
				cont++;
				conttotal++;
				}
			else if (array[i] instanceof LLamadaslocales){	
				cont2++;
				conttotal++;
				}	
			else if (array[i] instanceof Llamada){
				conttotal++;
			}
		}
		System.out.println("Hay " + cont + " Llamadas Provinciales ");
		System.out.println("Hay " + cont2 + " Llamadas Locales ");
		System.out.println();
		System.out.println("El Total de llamadas es : " + conttotal);

	}

}