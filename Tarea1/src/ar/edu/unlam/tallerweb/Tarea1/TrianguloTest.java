package ar.edu.unlam.tallerweb.Tarea1;


import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testArea() {
		Triangulo triangulo = new Triangulo(5.0,6.0);
		Assert.assertEquals(triangulo.areaTriangulo()==15);
	}
	
	public void testPerimetro(){
		Triangulo triangulo = new Triangulo(5.0,6.0);
		Assert.assertEquals(triangulo.perimetroTriangulo()==15);
	}

}
