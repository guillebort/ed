package arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		//1) Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el indice y el valor al que corresponde. 
		//Haz dos métodos, uno para rellenar valores y otro para mostrar.
	
		int[] a = new int[10];
		rellenar(a);
		ensenyar(a);
		
	}
		public static void rellenar(int a[]){
		for(int i = 0; i < a.length; i++){
			System.out.println("Introduce un numero: ");
		 a[i] = tec.nextInt();
		 
		}
	}

		
	public static void ensenyar(int a[]){
		
		for(int i = 0; i < a.length; i++){
			System.out.println((i + 1) + a[i]);
		}
		
	}
}
	
	


