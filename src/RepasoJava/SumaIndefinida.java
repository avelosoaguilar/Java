package RepasoJava;

public class SumaIndefinida {

	public static void main(String[] args) {
		
		sumarNumeros(1,2,3,4,5,6,7,8,9);

	}

	private static void sumarNumeros(int... numeros) {
		int acum = 0;
		
		for(int numero : numeros) {
			acum = acum+numero;
		}
		
		System.out.println("Suma: " + acum);
	}

}
