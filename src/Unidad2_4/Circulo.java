package Unidad2_4;

/**
 * 
 * @author Alberto Veloso Aguilar
 * 
 * Hacer clase circulo que tenga lo siguiente:
 * Dos atributos, uno de tipo Punto y otro de tipo double.
 * Constructor con 2 parametros  de tipo Punto y double con los atributos inicializados
 * Constructor por defecto que inicialice los dos atributos al valor que se quiera
 * Constructor con tres parametros double que inicializa los dos atributos.
 * Getter para cada atributo
 * Metodo calcularDistanciaDesde que calcula distancia entre centro y punto
 * Metodo calcularPerimetro
 *
 */

public class Circulo {

	//Dos atributos uno 
	private Punto centro;
	private double radio;
	
	//Constr. con parametros que inicialicen atributos
	Circulo(Punto centro, double radio){
		this.centro = centro;
		this.radio = radio;
	}
	
	//Constr. sin parametros
	Circulo(){
		this.centro = new Punto(0F, 0F);
		this.radio = 5.0F;
	}
	
	//Constructor con 3 parametros
	Circulo(double x1, double y1, double radio){
		this.centro = new Punto(x1, y1);
		this.radio = radio;
	}

	//Getters
	public Punto getCentro() {
		return centro;
	}

	//Getter Radio
	public double getRadio() {
		return radio;
	}
	
	//Metodo que calcula distancia entre dos centro y punto
	public double calcularDistanciaDesde(Punto punto) {
		
		return centro.calcularDistanciaDesde(punto);
	}
	
	//Metodo que calcula area circunferencia
	public double  calcularArea() {
		
		return Math.round(Math.PI*Math.pow(radio,2) * 100)/100.0;
	}
	
	//Metodo que calcula perimetro
	public double  calcularPerimetro() {
		
		return Math.round(Math.PI*2*radio * 100)/100.0;
	}
}
