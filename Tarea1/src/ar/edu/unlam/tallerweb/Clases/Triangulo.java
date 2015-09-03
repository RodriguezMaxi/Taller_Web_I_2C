package ar.edu.unlam.tallerweb.Clases;

public class Triangulo {

	private Double base;
	private Double altura;
	
	public Triangulo (Double base, Double altura){
		
		this.base= base;
		this.altura= altura;
	}
	
	public Double areaTriangulo(){
		Double resultado;
		resultado= (this.base*this.altura)/2;
		return resultado;
	}
	
	public Double perimetroTriangulo(){
		return base*3;
	}

}
