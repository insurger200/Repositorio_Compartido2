package Clases;

import java.util.ArrayList;

import Clases.Sala;
import Clases.Pelicula;

public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;
    Pelicula arraypelicula[] = {new Pelicula("KingKong", 33), new Pelicula("MarioBros", 21), new Pelicula("Barbie", 45)};

    public Cine(String nombre,int filas,int columnas, int numerosalas, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        salas = new Sala[numerosalas];
        for( int i = 0; i<salas.length;i++) {
            salas[i] = new Sala(i, null, columnas, filas);
        }
    }
