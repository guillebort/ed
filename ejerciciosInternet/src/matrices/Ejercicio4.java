package matrices;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		int[][] m = new int[4][4];
		
		rellenarmatriz(m);
		sumarfila(m);
		sumarcolumna(m);
		
	}
	public static void rellenarmatriz(int[][] m){
		int num = 0;
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				num = (int) (Math.random()*9 +1);
				m[i][j] = num;
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	public static void sumarfila(int[][] m){
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el numero de una fila: ");
		int fila = tec.nextInt();
		
		int suma = 0;
		int media = 0;
		for(int i = 0; i < m.length; i++){
			
			for(int j = 0; j < m[i].length; j++){
		
				if(fila < m.length){
			
					suma += m[fila][j];
					media = suma/ m.length;
					
				}else{
			
					System.out.println("esa fila no existe");
		
				}
			}
		}
		System.out.println("La suma de la fila " + fila + " es " + media);

	}
	public static void sumarcolumna(int [][]m){
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el numero de una columna: ");
		int column = tec.nextInt();

		int suma = 0;
		int media = 0;
		
		for(int j = 0; j < m[0].length; j++){
			for(int i = 0; i < m.length; i++){
				
				if(column < m[i].length){
				suma += m[i][column];
				media = suma /m[i].length;
				}else{
					System.out.println("esa columna no existe");
				}
			}
		}
		System.out.println("la suma de la columna " + column + " es " + media);
	}


}
