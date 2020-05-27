package clasesInternet.Serie;

public class Test {
	public static void main(String[] args) {
		
		Serie[] s = new Serie[2];
		Videojuego[] v = new Videojuego[2];
		
		Serie s0 = new Serie("hola", 3, "Accion", "Tupu");
		s[0] = s0;
		
		Serie s1 = new Serie("si", 5, "drogas", "puta");
		s[1] = s1;
		
		Videojuego v0 = new Videojuego("gta", 20, "Masculino", "dick");
		v[0] = v0;
		
		Videojuego v1 = new Videojuego("ffa", 20, "fenenino", "pussy");
		v[1] = v1;
		
		s0.entregar();
		v1.entregar();
		v0.entregar();
		
		int conts = 0;
		int contv = 0;
		for(int i = 0; i < s.length; i++){
			
			if(s[i].isEntregado() == true){
				conts ++;
			
			}
			
		}
		for(int i = 0; i < v.length; i++){
			
			if(v[i].isEntregado() == true){
				contv ++;
			
			}
			
		}
		System.out.println("series tiene " + conts + " entregados");
		System.out.println("videojuegos tiene " + contv + " entregados");
		
		
		
	}
}
