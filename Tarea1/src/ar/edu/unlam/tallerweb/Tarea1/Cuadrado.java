package ar.edu.unlam.tallerweb.Tarea1;

public class Cuadrado {
private int lado;
	
	public Cuadrado(){
		this.lado=0;
	}
	
	public Cuadrado(int valor){
		this.lado=valor;
	}
	
	public int perimetro(int lado){
		int perimetro = lado * 4;
		return perimetro;
	}
	
	public int superficie(int lado){
		int superficie = lado * lado;
		return superficie;
	}
}
