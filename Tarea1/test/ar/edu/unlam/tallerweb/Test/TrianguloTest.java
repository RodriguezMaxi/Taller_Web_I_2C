package ar.edu.unlam.tallerweb.Test;

import org.junit.Assert;

import ar.edu.unlam.tallerweb.Clases.Triangulo;




public class TrianguloTest {


	public void testArea() {
		Triangulo triangulo = new Triangulo(5.0,6.0);
		Assert.assertTrue(triangulo.areaTriangulo()==15);
	}
	
	public void testPerimetro(){
		Triangulo triangulo = new Triangulo(5.0,6.0);
		Assert.assertTrue(triangulo.perimetroTriangulo()==15);
	}

}
