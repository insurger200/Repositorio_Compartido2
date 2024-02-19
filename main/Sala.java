package Clases;


import Clases.Pelicula;

public class Sala {
    private int numero;
    private Pelicula pelicula;
    private String[][] butacas;

    public Sala(int numero, Pelicula pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new String [filas][columnas];
    }
    // Otros getters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public String[][] getButacas(){
        return butacas;
    }
    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }
}