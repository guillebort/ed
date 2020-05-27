package clasesInternet.Password;

import java.util.Scanner;

public class PasswordTest {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
//		Password[] lista = new Password[5];
//		System.out.println("longitud de la contraseña = 8");
//		boolean fuerte = false;
//		for(int i = 0; i < lista.length; i++){
//			System.out.println("Introduce la contraseña: ");
//			String cont = tec.nextLine();
//			
//			if(cont.length() <= 8){
//			Password p = new Password(cont);
//			lista[i]= p;
//				if(p.esFuerte() == true){
//					
//				}
//			}else{
//				System.out.println("contraseña demasiado larga");
//			}
//			
//			}
//		
//			System.out.println(lista.toString());
//	}
		
		Password p = new Password("l45");
		System.out.println(p.esFuerte());
	}
}
