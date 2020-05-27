package matrices;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el numero de columnas: ");
		int column = tec.nextInt();
		
		int[][] m =new int[5][column];
		
		int num = 0;
		for(int i = 0; i < m.length; i++){
			for( int j = 0; j < m[i].length; j++){
				num = (int) (Math.random() *10 +1);
				m[i][j] = num;
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
