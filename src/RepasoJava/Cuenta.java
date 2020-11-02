package RepasoJava;

public class Cuenta {

	private int numCuenta;
	private float saldo;
	private String propietario;
	
	public Cuenta(int numCuenta, float saldo, String propietario){
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public void ingresar(float ingreso) {
		saldo = saldo + ingreso;
	}

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(111, 50.5F, "Alberto");
		
		System.out.println("Numero de cuenta: " + cuenta1.getNumCuenta());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println("Propietario: " + cuenta1.getPropietario());
		
		System.out.println("Sumando 80.5 al saldo...");
		
		cuenta1.ingresar(80.5F);

		System.out.println("Saldo: " + cuenta1.getSaldo());
	}

}
