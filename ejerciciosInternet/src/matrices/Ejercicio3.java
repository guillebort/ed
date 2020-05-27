package matrices;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el tamaño: ");
		int tam = tec.nextInt();
		
		int [][] m = new int[tam][tam];
		int [][] m2 = new int [tam][tam];
		
		int [][] result = new int [tam][tam];
		
		int num = 0;
		int alea = 0;
		for(int i = 0 ; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				alea = (int) (Math.random() * 10+1);
				m[i][j] = alea;
				m2[i][j] = alea;
				num = m[i][j] + m2[i][j];
				result[i][j] = num;
				System.out.print("1:" +m[i][j] + " ");
				System.out.print("2:" + m2[i][j] + " ");
				System.out.print(" ");
				System.out.print("r:" +result[i][j] + " ");
			}
			//System.out.println(" ");
			//System.out.println(" ");
			System.out.println(" ");
		}
	}

}
