package RepasoJava;

public class IncrementoPre {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Valor antes de ++inc (Pre): " + num);
		System.out.println("Valor durante ++inc (Pre): " + ++num);
		System.out.println("Valor de num después (Pre): " + num);
		
		System.out.println("Valor antes de inc++ (Pre): " + num);
		System.out.println("Valor durante inc++ (Post): " + num++);
		System.out.println("Valor de num después (Post): " + num);
	}

}
