package arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
//		3) Crea un array de n�meros de un tama�o pasado por teclado,
//		el array contendr� n�meros aleatorios primos entre los n�meros deseados,
//		por �ltimo nos indica cual es el mayor de todos.
//
//		Haz un m�todo para comprobar que el n�mero aleatorio es primo,
//		puedes hacer todos lo m�todos que necesites
		
		System.out.println("Introduce el tama�o del array: ");
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
