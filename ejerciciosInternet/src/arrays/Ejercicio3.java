package arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
//		3) Crea un array de números de un tamaño pasado por teclado,
//		el array contendrá números aleatorios primos entre los números deseados,
//		por último nos indica cual es el mayor de todos.
//
//		Haz un método para comprobar que el número aleatorio es primo,
//		puedes hacer todos lo métodos que necesites
		
		System.out.println("Introduce el tamaño del array: ");
		int tam = tec.nextInt();
		
		int[] a = new int[tam];
		
		//System.out.println("El numero mas grande es : " + numeroMayor(a));//numeroMayor(a);
		System.out.println(numeroMayor(a));
	}
	public static void primo( int[]a, int b, int c){
		int max=a[0];
		int mejor = 0;
		
		for(int i = 0; i < a.length; i++){
			int num = (int) (Math.random()* (b-c) + c);
			//if()
			System.out.println("Numero " + (i+1) + ": " + num);
		}
	}
	public static int numeroMayor(int a[]){
		int max = a[0];
		
		for(int i = 0; i < a.length; i++){
			if(max < a[i]){
				 max = a[i];
				System.out.println("El mas grande es el numero " + (i + 1) + ": " + max);
			}
			
		}
		return max;
	
	}

}
