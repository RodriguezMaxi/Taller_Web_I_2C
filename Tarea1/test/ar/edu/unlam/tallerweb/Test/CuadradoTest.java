package ar.edu.unlam.tallerweb.Test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.Clases.Cuadrado;

public class CuadradoTest {

	@Test
	public void testArea() {
		Cuadrado cuadrado = new Cuadrado(5.0);
		Assert.assertTrue(cuadrado.perimetro(5.0)==25.0);
	}
	
	public void testPerimetro(){
		Cuadrado cuadrado = new Cuadrado(5.0);
		Assert.assertTrue(cuadrado.perimetro(5.0)==20.0);
	}

}
