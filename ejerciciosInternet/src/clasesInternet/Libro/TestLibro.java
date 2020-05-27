package clasesInternet.Libro;

public class TestLibro {
	public static void main(String[] args) {
		
		Libro l1 = new Libro("Huevos sudaos", "123-456-789", "Tupu Madre", 169);
		
		Libro l2 = new Libro("Hola", "111-222-333", "Parejo", 1933);
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1.getPaginas() > l2.getPaginas()){
			System.out.println("el libro 1 tiene mas paginas");
			
		}else{
			System.out.println("el libro 2 tiene mas paginas");
		}
	}

}
