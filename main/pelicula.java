package Clases;

public class Pelicula {

private String titulo;
private int duracion;
// Es la primera pelicula
public Pelicula(String titulo, int duracion){
    this.titulo = titulo;
    this.duracion = duracion;
}
    // Getts y setters de Pelicula
    //getTitulo(): Este método devuelve el título de la película almacenado en el atributo titulo.
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
// Duracion de la pelicula
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }





}