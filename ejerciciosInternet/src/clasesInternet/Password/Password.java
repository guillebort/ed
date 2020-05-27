package clasesInternet.Password;

public class Password {
	static final int LONG = 8;

	private int longitud;
	private String contraseña;

	public Password(String contraseña) {

		this.longitud = LONG;
		this.contraseña = contraseña;

	}

	public Password() {

		longitud = 8;
		contraseña = "patata";

	}

	public boolean esFuerte() {

		boolean fuerte = false;
		int contmay = 0;
		int contmin = 0;
		int contnum = 0;
//		char[] letras = { 'A', 'B', 'C', 'D', 'E',
//						  'F', 'G', 'H', 'I', 'J',
//						  'K', 'L', 'M', 'N', 'O', 
//						  'P', 'Q', 'R', 'S', 'T',
//						  'V', 'W', 'Y', 'Z'
//						};
		
		String[] letras = { "a", "b", "c", "d", "e",
							   "f", "g", "h", "i", "j", 
							   "k", "l", "m", "n", "o",
							   "p", "q", "r", "s", "t",
							   "v", "w", "y", "z" };
		
		for (int i = 0; i < letras.length; i++) {
			
				if (contraseña.contains(letras[i].toUpperCase()){
				contmay++;

			
				} else if (contraseña.contains(letras[i])) {
				contmin++;

			
				} else {
				contnum++;
			
				}
			
				if (contmay >= 2 && contmin >= 1 && contnum >= 5) {
				fuerte = true;
		
				} else {
				fuerte = false;
			
				}
			}
		}
		return fuerte;

	}
	public int getLongitud(){
		return this.longitud;
		
	}
	public String getContraseña(){
		return this.contraseña;
		
	}
	public void setLongitud(int longitud){
		this.longitud = longitud;
		
	}
	public String toString(){
		return "Contraseña: " + contraseña +
				"\nLongitud: " + contraseña.length();
	}

}
