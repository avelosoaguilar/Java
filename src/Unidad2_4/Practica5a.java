package Unidad2_4;

/**
 * 
 * @author Alberto Veloso Aguilar
 *
 * Crear e inicializar dos objetos de clase punto y muestre distancia entre ambos
 * Crear objeto Circulo y mostrar area, perimetro y distancia a uno de los dos puntos creados al comienzo
 * Crear objeto de clase triangulo y mostrar su area, perimetro y distancia a un nuevo punto
 */

public class Practica5a {

	public static void main(String[] args) {

		Punto punto1 = new Punto(7.0F,7.0F);
		Punto punto2 = new Punto (2.0F,2.0F);	
		Circulo circulo1 = new Circulo(new Punto(0.0F,0.0F), 5.0F);
		Triangulo triangulo1 = new Triangulo(new Punto(0.0F,0.0F), new Punto(0.0F,2.0F), new Punto(2.0F,0.0F));
		
		double distPuntos;
		double area;
		double perimetro;
		
		distPuntos =Math.round(punto1.calcularDistanciaDesde(punto2) * 100)/100.0;
		System.out.println("Distancia desde dos puntos: " + distPuntos);
		
		//Datos circulo
		area = circulo1.calcularArea();
		System.out.println("Area de circulo: " + area);
		perimetro = circulo1.calcularPerimetro();
		System.out.println("Perímetro de circulo: " + perimetro);
		distPuntos = Math.round(circulo1.getCentro().calcularDistanciaDesde(punto1));
		System.out.println("Distancia desde centro a punto1: " + distPuntos);
		
		//Datos triangulo
		area = triangulo1.calcularArea();
		System.out.println("Area de circulo: " + area);
		perimetro = triangulo1.calcularPerimetro();
		System.out.println("Perímetro de circulo: " + perimetro);
		distPuntos = Math.round(triangulo1.getPunto3().calcularDistanciaDesde(punto1));
		System.out.println("Distancia desde punto3 de triangulo a punto1: " + distPuntos);
	}

}
