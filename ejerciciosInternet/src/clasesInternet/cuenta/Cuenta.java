package clasesInternet.cuenta;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad){
		
		this.titular = titular;
		this.cantidad = cantidad;
		
	}
	public String getTitular(){
		return this.titular;
		
	}
	public double getCantidad(){
		return this.cantidad;
		
	}
	public void setTitular(String titular){
		this.titular = titular;
		
	}
	public void setCantidad(double cantidad){
		this.cantidad = cantidad;
		
	}
	public String toString(){
		return "-Titular: " + titular + 
			   "\n-Cantidad: " + cantidad;
		
	}
	public void ingresar(double cantidad){
		if(cantidad > 0){
			this.cantidad += cantidad;
		}
		
	}
	public void retirar(double cantidad){
		if(this.cantidad - cantidad < 0){
			this.cantidad = 0;
		}else{
			this.cantidad -= cantidad;
		}
	}

}
