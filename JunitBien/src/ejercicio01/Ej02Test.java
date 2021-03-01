package ejercicio01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ej02Test {
	

	int array1[] = {1,2,-1,-2,-3,-4,-5,3,4,5,40,50};
	int array2[] = {1,2,3,4,5,-4,-5,3,4,5,40,50};
	int array3[] = {1,2,-1,-2,0,-4,-5,3,4,5,40,50};
	
	

	@Test
	public void testContPos() {
		int resultadoEsperado=5;
		int resultado=Ej02.numPositivos(array1);
		assertTrue(resultadoEsperado==resultado);
	//aqui el resultado esperado 5, y coincide	
	}
	
	@Test
	public void testContPos2() {
		int resultadoEsperado=2;
		int resultado=Ej02.numPositivos(array3);
		assertTrue(resultadoEsperado==resultado);
	//aqui el resultado esperado 2, ya que se sale cuando encuentra el 0 en el array
	}
	
	
	
	@Test
	public void testContNeg() {
		int resultadoEsperado=0;
		int resultado=Ej02.numNegativos(array2);
		assertTrue(resultadoEsperado==resultado);
	//el resultado esperado es 0, y da correcto
	//al ejecutar esta prueba daba error, porque salia 2 en vez de 0
	//era porque en el main, estaba comentado el if cuando el num del array era positvo
	//por lo que no captaba el contPos, asi que recorria todo el array
		
	}
	
	@Test
	public void testContNeg2() {
		int resultadoEsperado=2;
		int resultado=Ej02.numNegativos(array3);
		assertTrue(resultadoEsperado==resultado);
	//el resultado esperado es 2, y da correcto
		
	}
	
	
	@Test
	public void testCalcMediaPositivos() {
		double resultadoEsperado=3;
		double resultado=Ej02.calcMedia(array1);
		assertTrue(resultadoEsperado==resultado);
	//la media esperada deberia ser 3, y es lo que sale finalmente	
	}
	

}
