package RepasoJava;

public class Primos {
	
	public static void main(String[] args) {
		
		int num = 3;
		boolean esPrimo = true;
		
		System.out.println("Listado de primos:");
		System.out.println("2");
		while(num < 1000) {
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					esPrimo = false;
					break;
				}
			}
			if(esPrimo) {
				System.out.println(num);
			}
			num++;
			esPrimo = true;
		}
	}

}
