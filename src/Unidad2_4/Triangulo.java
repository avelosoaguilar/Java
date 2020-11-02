package Unidad2_4;

/**
 * 
 * @author Alberto Veloso Aguilar
 * 
 * Clase triangulo que tenga lo siguiente (Se supone triangulo rectangulo):
 * 
 * Tres atributos de tipo Punto.
 * Constructor con tres parametros de tipo Punto que inicialice los 3 atributos.
 * Constructor por defecto que inicialize los atributos como se quiera.
 * Constructor con 6 parametros de tipo double que inicializan los tres atributos.
 * Getter para cada uno de los atributos
 * Metodo calcularDistanciaDesde que calcula distancia entre dos puntos
 * Metodo calcularArea
 * Metodo calcularPerimetro
 * 
 * |\
 * | \
 * |  \
 * |___\
 *
 */

public class Triangulo {

	//Tres atributos de tipo punto
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	//Constr. que inicializa los tres atributos
	public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
	}
	
	// Constr. que inicializa los tres atributos
	public Triangulo() {
		this.punto1 = new Punto(0.0F,0.0F);
		this.punto2 = new Punto(0.0F,2.0F);
		this.punto3 = new Punto(2.0F,0.0F);
	}
	
	// Constr. que inicializa 3 atrib. con 6 parametros
	public Triangulo(double p1x, double p1y,double p2x, double p2y,double p3x, double p3y) {
		this.punto1 = new Punto(p1x, p1y);
		this.punto2 = new Punto(p2x, p2y);
		this.punto3 = new Punto(p3x, p3y);
	}

	//Getter punto 1
	public Punto getPunto1() {
		return punto1;
	}

	//Getter punto 2
	public Punto getPunto2() {
		return punto2;
	}

	//Getter punto 3
	public Punto getPunto3() {
		return punto3;
	}
	
	//Calcular distancia entre dos puntos
	public double calcularDistanciaDesde(int puntoTriangulo, Punto punto) {
		
		switch (puntoTriangulo) {
		
			case 1:
				return punto1.calcularDistanciaDesde(punto);
			
			case 2:
				return punto2.calcularDistanciaDesde(punto);
				
			case 3:
				return punto3.calcularDistanciaDesde(punto);
				
			default:
				return 0.0F;
		}
	}
	
	//Calcular area. Base por altura /2
	public double calcularArea() {
		return Math.round((punto1.calcularDistanciaDesde(punto2)*punto1.calcularDistanciaDesde(punto3))/2 * 100)/100.0;
	}
	
	//Calcular perimetro. Suma de sus lados
	public double calcularPerimetro() {
		return Math.round(punto1.calcularDistanciaDesde(punto2)+punto1.calcularDistanciaDesde(punto3)+punto3.calcularDistanciaDesde(punto2) * 100)/100.0;
	}
}
