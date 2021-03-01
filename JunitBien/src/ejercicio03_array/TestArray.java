package ejercicio03_array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArray {
	private MiArray arrayPrueba;
	private MiArray arrayInvertido;
	
	//Los test de las pruebas son correctos al ejecutar el programa
	
	@Before
	public void setUp(){
		int[] a={1,4,2,3,5};
		int []b={5,3,2,4,1};
		arrayPrueba=new MiArray(a);
		arrayInvertido=new MiArray(b);
		//int minimo=1;
	}
	
	@Test
	public void testMin(){
		int minimo=1;
		int otroMinimo=2;
		assertFalse(arrayPrueba.minimo()==otroMinimo);
		assertTrue(1==arrayPrueba.minimo());
		assertTrue(arrayPrueba.minimo()==minimo);
		
		//assertTrue y assertFalse son pruebas con booleans, han  sido utilizados en los anteriores ejercicios,
		//y basicamente comparan un resultado esperado con el resultado real que da la prueba
		//si coinciden assertTrue será correcto
	}
	@Test
	public void testInvertido(){
		assertTrue(arrayPrueba.invertir().equals(arrayInvertido));
		assertArrayEquals(arrayInvertido.getArray(), arrayPrueba.invertir().getArray());
		
		//assertArrayEquals comprueba que dos arrays que se les pasa a la prueba, el esperado y el real que se ejecuta
		// son iguales o no
		
	}
	@Test
	public void busquedaBinaria(){
		int numeroaBuscar=5;
		//int []b={5,3,2,4,1};
		int[] a={1,4,2,3,5};
		assertTrue(MiArray.busquedaBinaria(a, numeroaBuscar));;
		
		//Se ejecuta una prueba con el metodo creado de busquedaBinaria, se ha optado por el assertTrue, 
		//para comparar el esperado (a) con el numeroBuscar
		//la prueba es correcta
	
	
	}

}
