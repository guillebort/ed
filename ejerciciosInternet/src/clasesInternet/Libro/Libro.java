package clasesInternet.Libro;

public class Libro {
	
	private String isbn;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo, String isbn, String autor, int paginas){
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		
	}
	public String getIsbn() {
		return isbn;
		
	}
	public String getTitulo() {
		return titulo;
		
	}
	public String getAutor() {
		return autor;
		
	}
	public int getPaginas() {
		return paginas;
		
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
		
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
		
	}
	public String toString(){
		
		return "El libro \"" +  titulo + "\" con ISBN " + isbn + 
				" creado por " + autor + " tiene " + paginas + " paginas.";
	}
	
	

}
