package ejercicios12_Mapas;

import java.util.Objects;

public class Libro {
	
	private String isbn;
	private String titulo;
	private String autor;
	
	public Libro (String isbn, String titulo, String autor){
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
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

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
}
