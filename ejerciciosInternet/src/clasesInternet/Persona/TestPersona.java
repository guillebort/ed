package clasesInternet.Persona;

public class TestPersona {
	public static void main(String[] args) {
		
		Persona p = new Persona("Pepe", 32,null, 'm', 99.9, 1.87);
	
		System.out.println(p.calcularIMC());
	
		System.out.println(p.esMayorDeEdad());
		
		System.out.println(p.comprobarSexo('k'));
		
		System.out.println(p.generaDNI());
	}

}
