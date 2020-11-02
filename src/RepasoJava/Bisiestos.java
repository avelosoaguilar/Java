package RepasoJava;

public class Bisiestos {

	public static void main(String[] args) {
		
		System.out.println("Listado de años bisiestos");
		for(int i=2000; i <=3000;i++){
			if((i%400 == 0 && i%100 !=0) || i%4 == 0) {
				System.out.println(i);
			}
		}
	}

}
