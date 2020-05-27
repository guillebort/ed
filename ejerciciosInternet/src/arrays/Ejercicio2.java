package arrays;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
//		2) Crea un array de n�meros donde le indicamos por teclado el tama�o del array, 
//		rellenaremos el array con n�meros aleatorios entre 0 y 9, al final muestra por pantalla 
//		el valor de cada posici�n y la suma de todos los valores. Haz un m�todo para rellenar el
//		array (que tenga como par�metros los n�meros entre los que tenga que generar), 
//		para mostrar el contenido y la suma del array y un m�todo privado para generar 
//		n�mero aleatorio (lo puedes usar para otros ejercicios).
		
		System.out.println("Introduce tama�o del array: ");
		int tam = tec.nextInt();
		
		
		int[] a = new int[tam];
		
		rellenar(a, 0,9);
		ensenyar(a);
		
	
		
		
	
	}
	public static void rellenar(int a[], int b, int c){
		int num = 0;
		int suma = 0;
		for(int i = 0; i < a.length; i++){
			System.out.println("numero " + (i + 1) + ": ");
			int al = (int) (Math.random()* (b-c) + c);
			a[i] = al;	
			num = a[i];
			System.out.println(num);
			suma += a[i];
		}
		
	}
	public static void ensenyar(int a[]){
		int num = 0;
		int suma = 0;
		for(int i = 0; i < a.length; i++){
			num = a[i];
			
			suma += a[i];
			
		
		
	}
		System.out.println("Suma: " + suma);
		
	}
		

}
