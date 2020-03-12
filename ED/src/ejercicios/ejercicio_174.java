package ejercicios;

import java.util.Scanner;

public class ejercicio_174 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce numero: ");
		int num = tec.nextInt();

		boolean repetido = hayRepetidos(String.valueOf(num));
		boolean repetido2 = repetido;
		int num2 = num;
		int anyoMenor = -1;

			while (repetido == repetido2) {
				repetido2 = hayRepetidos(String.valueOf(num2));
				if (repetido2 == repetido) {
					num2--;
					anyoMenor++;
				}
			}

			num2 = num;
			repetido2 = repetido;
			int anyoMayor = 0;

			while (repetido == repetido2) {
				repetido2 = hayRepetidos(String.valueOf(num2));
				if (repetido2 == repetido) {
					num2++;
					anyoMayor++;
				}
			}
			
			int primerAnyo = num - anyoMenor;
			int longSerie = anyoMayor + anyoMenor;
			System.out.println(primerAnyo + " " + longSerie);
		}

		public static boolean hayRepetidos(String num) {
			for (int i = 0; i < num.length() - 1; i++) {
				for (int j = i + 1; j < num.length(); j++) {
					if (num.charAt(i) == num.charAt(j)) {
						return true;
					}
				}
			}
			return false;
		}
	}

