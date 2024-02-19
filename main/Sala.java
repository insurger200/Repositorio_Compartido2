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