package ejercicio02_factorial;

import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {

	//Si intewntamos calcular el factorial de un negativo, nos retorna -1 y la excepción que hemos configurado
	@Test
	public void test() throws Exception {
		Assert.assertEquals(-1, new Factorial(-2).calculo());
		Assert.assertTrue("El número no puede ser negativo", (-2<0));
	}
	
	
	//Si intentamos calcular el factorial de 16, nos retornará -2 y una excepcion: el numero excede del rango
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(-2, new Factorial(16).calculo());
	}
	
	//En el siguiente test, con un numero comporendido en el rango, retorna su factorial, de 5, retorna 120
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(120, new Factorial(5).calculo());
	}
	
	
	@Test
	//AQUI EL RESULTADO ESPERADO ES 6, Y CALCULAMOS EL FACTORIAL DE 3, Y DA CORRECTO, YA ESTÁ ARREGLADO
	
	public void test3() throws Exception {
		int resultadoEsperado=6;
		Assert.assertEquals(resultadoEsperado, new Factorial(3).calculo());
	}
}
