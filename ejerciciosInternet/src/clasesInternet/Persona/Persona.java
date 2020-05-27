package clasesInternet.Persona;

public class Persona {
	//private static final char h = h;

	static final char SEXO = 'h';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(String dni){
		
		this.nombre= null;
		this.edad = 0;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
		
	}
	public Persona(String nombre, int edad, char sexo){
		
		this.nombre= nombre;
		this.edad = edad;
		this.dni = null;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
		
	}
	public Persona(String nombre, int edad,String dni, char sexo, double peso, double altura){
		
		this.nombre= nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	public int calcularIMC(){
		double imc = peso/(Math.pow(altura, 2));
		if(imc < 20){
			return -1;
		}else if(imc > 20 && imc < 25){
			return 0;
		}else{
			return 1;
		}
	}
	public boolean esMayorDeEdad(){
		
		if(edad >= 18){
			return true;
		}else{
			return false;
		}
	}
	public boolean comprobarSexo(char sexo){
		boolean correcto = false;
		if(sexo == 'h' || sexo == 'H' || sexo == 'm' || sexo == 'M'){
			correcto = true;
		}else{
			this.sexo = SEXO;
			correcto = false;
		}
		return correcto;
	}
	public String toString(){
		
		return "-Nombre: " + nombre +
			   "\n-Edad: " + edad + 
			   "\n-DNI: " + dni + 
			   "\n-Sexo: " + sexo +
			   "\n-Peso: " + peso + 
			   "\n-Altura: " + altura;
		
	}
	public String generaDNI(){
		
		int num = 0;
		int cont = 0;
		
		num = (int) (Math.random() * 8 + 1);
		cont ++;
		
		while(cont < 8);
		
		char[] letras = { 'A', 'B', 'C', 'D', 'E',
						  'F', 'G', 'H', 'I', 'J',
						  'K', 'L', 'M', 'N', 'O', 
						  'P', 'Q', 'R', 'S', 'T',
						  'V', 'W', 'Y', 'Z'
						};
		char let = ' ';
		for(int i = 0; i < letras.length; i++){
			let = (char) (Math.random() * letras[i] + 1);
		}
		return "" +num + let;
	}
}
