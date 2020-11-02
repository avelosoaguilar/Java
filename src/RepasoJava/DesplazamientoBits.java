package RepasoJava;

public class DesplazamientoBits {
	
	public static void main(String[] args) {
		int num =  2;
		int otroNum = 256;
		int cambioNum  = 0;
		
		System.out.println("Numero antes de desplazar: " + num);
		for (int i=0; i<5;i++) {
			num = (byte) (num << 1);
			System.out.println("Incremento " + i + ":  " + num);
			
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Numero antes de desplazar: " + otroNum);
		for (int j=0; j<5;j++) {
			otroNum = (otroNum >> 1);
			System.out.println("Incremento: " + otroNum);
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Numero antes de cambiar: " + cambioNum);
		System.out.println("Numero después de cambiar: " + ~cambioNum);
	}

}
