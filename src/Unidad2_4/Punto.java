package Unidad2_4;

/**
 * 
 * @author Alberto Veloso Aguilar
 * 
 * Desarrollar clase punto que tenga lo siguiente:
 * 
 * Dos atributos privados de tipo double
 * Constructor con dos parametros de tipo double que inicien los atributos de la clase.
 * Getter para cada atributo
 * Método calcularDistanciaDesde que recibe punto y devuelve double
 * 		Raiz cuadrada de (X1-X2)^2 + (Y1-Y2)^2
 *
 */

public class Punto {

		//Tenga dos atributos private de tipo double (Coordenadas)
		private double x1;
		private double y1;
		
		//Cosntr. 2 parametros double que inicializan los atributos
		Punto(double x1, double y1){
			this.x1 = x1;
			this.y1 = y1;
		}
		
		//Constr. sin parametros que inicializa atrib. a un valor
		Punto(){
			this.x1 = 5;
			this.y1 = 5;
		}

		//Getter de la coordenada X
		public double getX1() {
			return x1;
		}

		//Getter de la coordenada Y
		public double getY1() {
			return y1;
		}
		
		//Metodo que calcula distancia entre dos puntos
		public double calcularDistanciaDesde(Punto punto) {
			return Math.sqrt(Math.pow(punto.x1-x1, 2)+ Math.pow(punto.y1-y1, 2));
		}
}
