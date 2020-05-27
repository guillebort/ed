package clasesInternet.Electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	static final int CARGA = 5;
	
	private int carga;
	
	public Lavadora(){
		
		this(PRECIO, COLOR, CONSUMO, PESO, CARGA);
	
	}
	public Lavadora(double precio, String color, char consumo, double peso, int carga) {
		
		super(precio, color, consumo, peso);
		this.carga = carga;
	
	}
	public Lavadora(double precio, double peso){
	
		this(precio, COLOR, CONSUMO, peso, CARGA);
		
	}
	public int getCarga(){
		
		return this.carga;
		
	}
	public double precioFinal(){
		double aumento = super.precioFinal();
		if(carga >= 30){
			aumento += 50;
		}
		return aumento;
	}
	

}
