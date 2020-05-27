package clasesInternet.Serie;

public class Videojuego implements Entregable{
	
	static final int HORAS = 10;
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compañia;

	public Videojuego(String titulo, int horas, String genero, String compañia){
		
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = false;
		
	}
//	public Videojuego(String titulo, int horas){
//		
//		this(titulo, horas, "", "");
//	
//	}
//	public Videojuego(){
//	
//		this("", HORAS, "", "");
//	
//	}
	public String getTitulo() {
		return titulo;
		
	}
	public int getHoras() {
		return horas;
		
	}
	public String getGenero() {
		return genero;
		
	}
	public String getCompañia() {
		return compañia;
		
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public void setHoras(int horas) {
		this.horas = horas;
		
	}
	public void setGenero(String genero) {
		this.genero = genero;
		
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
		
	}
	public String toString(){
		
		return "Titulo: " + titulo +
				"\nHoras: " + horas +
				"\nGenero: " + genero +
				"\nCompañia: " + compañia;
		
	}
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		entregado = true;
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado = false;
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		if(entregado == true){
			return true;
		}else{
		return false;
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Videojuego v = (Videojuego) o;
		if(this.horas < v.horas) return 1;
		if(this.horas > v.horas) return -1;
		return 0;
	}
	
}
