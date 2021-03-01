package ejercicio01;


import org.junit.Assert;
import org.junit.Test;



public class ej01Test {
	
/*PASOS PARA QUE TE SALGAN LAS PRUEBAS BIEN:
 * 
 * 1º ESCRIBE -2, -1, 0, 1, 2 (que coinciden con el Array que hemos escrito en testLeerNumeros()
 * 2º ESCRIBE UN 7
 * 3º ESCRIBE UN NUMERO NEGATIVO
 * 4º ESCRIBE UN NUMERO POSITIVO MENOR QUE 5 O MAYOR QUE 10, por ejemplo 19
 * LOS TEST SUMAS TAMBIEN SALEN BIEN
 */
	
	
	@Test
	//Al pedir por teclado hay que introducir el numero indicado en la funcion assert o todo esto será inutil
	public void testIntroducir1() {
		System.out.println("PRUEBA: Escribe 7 para que de correcta la prueba");
		Assert.assertEquals(7, ej01.introducirNumero());
		
	//Introduce un numero comprendido entre 5 y 10, y la prueba no dará error
		
	
	}
	@Test
	//Deberia ser correcto con un numero negativo
	public void testIntroducir2() {
		System.out.println("PRUEBA: Mete un negativo, para ver que pasa al introducir los negativos");
		Assert.assertEquals(-1,ej01.introducirNumero() );
		
	//Si escribes un negativo sale -1
		
		
	}
	@Test
	public void testIntroducir3() {
		//correcto con numero que no entre en los limites
		System.out.println("PRUEBA: ESCRIBE UN NUMERO POSITIVO MENOR QUE 5 O MAYOR QUE 10");
		Assert.assertEquals(0, ej01.introducirNumero());
	}
	
	
	@Test
	public void testLeerNumeros() {
		//Comprobamos que recibimos el array correctamente, aqui en la prueba escribe los numeros del array
		System.out.println("ESCRIBE -2, -1, 0, 1, 2");
		Assert.assertArrayEquals(new int[] {-2,-1,0,1,2}, ej01.leerNumeros(5));
	}
	@Test
	public void testSuma() {
		Assert.assertEquals(0, ej01.sumarNumeros(new int[] {-2,-1,0,1,2}));
	}
	@Test
	public void testSuma2() {
		Assert.assertEquals(39, ej01.sumarNumeros(new int[] {7,2,3,0,4,8,12,3}));
	}
}
