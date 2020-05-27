package clasesInternet.Serie;

public class Serie implements Entregable{
	
	static final boolean ENTREGADO = false;
	static final int TEMPORADAS = 3;
	
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	

	public Serie(String titulo, int temporadas, String genero, String creador){
		
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public int getTemporadas() {
		return temporadas;
	}


	public String getGenero() {
		return genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String toString(){
	
		return "Titulo: " + titulo +
				"\nTemporadas: " + temporadas +
				"\nGenero: " + genero +
				"\nCreador: " + creador;
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
		Serie s = (Serie) o;
		if(this.temporadas < s.temporadas) return 1;
		if(this.temporadas > s.temporadas) return -1;
		return 0;
	}
}
