package clasesInternet.cuenta;

public class TestCuenta {
	public static void main(String[] args) {
		
		Cuenta c = new Cuenta("guille", 50);
		
		c.ingresar(50);
		c.retirar(20);
		System.out.println(c);
	}

}
