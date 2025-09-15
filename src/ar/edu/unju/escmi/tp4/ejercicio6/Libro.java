package ar.edu.unju.escmi.tp4.ejercicio6;


public class Libro implements Comparable<Libro> {
    private String isbn;
    private String titulo;
    private int cantidadDePaginas;
    private String autor;
    
    public Libro() {}

    public int compareTo(Libro otro){

        return this.titulo.compareTo(otro.titulo);
    }

    public void mostrarDatos() {
        System.out.println("isbn: " + isbn + "\nTitulo: " + titulo + "\nCantidad de Paginas: " + cantidadDePaginas + "\nAutor: " + autor + ".");
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
