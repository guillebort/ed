package clasesInternet.Electrodomesticos;

public class Television extends Electrodomestico {

	static final double RESOLUCION = 20;
	static final boolean TDT = false;

	private double resolucion;
	private boolean tdt;

	public Television() {

		this(PRECIO, COLOR, CONSUMO, PESO, RESOLUCION, TDT);

	}

	public Television(double precio, double peso) {

		this(precio, COLOR, CONSUMO, peso, RESOLUCION, TDT);
	
	}

	public Television(double precio, String color, char consumo, double peso, double resolucion, boolean tdt) {

		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;

	}	

	public double getResolucion() {
		return this.resolucion;

	}

	public boolean getTdt() {
		return this.tdt;

	}

	public double precioFinal() {
		double aumento = super.precioFinal();

		if (resolucion > 40) {
			aumento += (super.getPrecio() * 30) / 100;
		}
		if (tdt == true) {
			aumento += 50;
		}
		return aumento;
	}
}
