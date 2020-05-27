package clasesInternet.Electrodomesticos;

public class TestElectrodomesticos {
	public static void main(String[] args) {
		
		Electrodomestico[] lista = new Electrodomestico[4];
		
		Electrodomestico e = new Lavadora(100, "rosa", 'a', 150, 30);
		lista[0] = e;
		
		Electrodomestico e1 = new Television(500, "verde", 'a', 150, 40, true);		
		lista[1] = e1;
		
		Electrodomestico e2 = new Lavadora(300, "azul", 'b', 200, 40);		
		lista[2] = e2;
	
		Electrodomestico e3 = new Television(600, "rojo", 'f', 200, 20, false);		
		lista[3] = e3;
	
		double sumalav = 0;
		double sumatv = 0;
		
		for(int i = 0; i < lista.length; i++){
			if(lista[i] instanceof Lavadora){
				sumalav += lista[i].precioFinal();
			}else if(lista[i] instanceof Television){
				sumatv += lista[i].precioFinal();
			}
		}
		System.out.println("Lavadoras: " + sumalav + "\nTv: " + sumatv);
	
	}
	

}
