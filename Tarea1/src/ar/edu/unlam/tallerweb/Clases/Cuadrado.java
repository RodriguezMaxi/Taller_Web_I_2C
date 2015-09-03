package ar.edu.unlam.tallerweb.Clases;

public class Cuadrado {
private Double lado;
	
	public Cuadrado(){
		this.lado=0.0;
	}
	
	public Cuadrado(Double valor){
		this.lado=valor;
	}
	
	public Double perimetro(Double lado){
		Double perimetro = lado * 4;
		return perimetro;
	}
	
	public Double superficie(Double lado){
		Double superficie = lado * lado;
		return superficie;
	}
}
