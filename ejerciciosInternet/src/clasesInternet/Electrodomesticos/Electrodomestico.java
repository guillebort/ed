package clasesInternet.Electrodomesticos;

public class Electrodomestico {
	static final double PRECIO = 100;
	static final String COLOR = "Blanco";
	static final char CONSUMO = 'F';
	static final double PESO = 5;

	private double precio;
	private String color;
	private char consumo;
	private double peso;
	
	String [] colores= {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	
	public Electrodomestico(){
	
		precio = PRECIO;
		color = COLOR;
		consumo = CONSUMO;
		peso = PESO; 
		
	}
	public Electrodomestico(double precio, double peso){
		
		this.precio = precio;
		color = COLOR;
		consumo = CONSUMO;
		this.peso = peso;
		
	}
	public Electrodomestico(double precio,String color, char consumo, double peso){
		
		this.precio = precio;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
		this.peso = peso; 
		
	}
	public double getPrecio() {
		return precio;
		
	}
	public String getColor() {
		return color;
		
	}
	public char getConsumo() {
		return consumo;
		
	}
	public double getPeso() {
		return peso;
		
	}
	public void comprobarConsumoEnergetico(char letra){
		
		boolean correcta = false;
		if(letra == 'A' || letra == 'a' || letra == 'B' || letra == 'b' || letra == 'C' || letra == 'c' ||
		   letra == 'D'	|| letra == 'd' || letra == 'E' || letra == 'e' || letra == 'F' || letra == 'f'){
			
			correcta = true;
			this.consumo = letra;
		}else{
			correcta = false;
			this.consumo = CONSUMO;
		}
	}
	public void comprobarColor(String color){
		boolean enc = false;
	
		for(int i = 0; i < colores.length && !enc; i++){
			
			if(colores[i].equals(color)){
				enc = true;
				this.color = color;
			}else{
				enc = false;
				this.color = COLOR;
			}
		}
	}
	public double precioFinal(){
	
		int aumento = 0;
	
		if(consumo == 'A' || consumo == 'a'){
		
			aumento = 100;
	
		}else if(consumo == 'B' || consumo == 'b'){
		
			aumento = 80;
	
	
		}else if(consumo == 'C' || consumo == 'c'){
		
			aumento = 60;
		
	
		}else if(consumo == 'D' || consumo == 'd'){
	
			aumento = 40;
		
	
		}else if(consumo == 'E' || consumo == 'e'){
	
			aumento = 20;
		
	
		}else if(consumo == 'F' || consumo == 'f'){
	
			aumento = 10;
	
		}
	
		if(peso == 0 && peso <= 19){
			aumento += 10;
			
		}else if(peso >= 20 && peso <= 49 ){
			aumento += 50;
			
		}else if(peso >= 50 && peso <= 79 ){
			aumento += 80;
			
		}else if(peso >=80){
			aumento =+ 100;
		}
	
		double total = precio + aumento;
		return total;
	}
}
