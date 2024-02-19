package Clases;

import java.util.ArrayList;

import Clases.Sala;
import Clases.Pelicula;

public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;
    //Se le ponen los arrays
    Pelicula arraypelicula[] = {new Pelicula("KingKong", 33), new Pelicula("MarioBros", 21), new Pelicula("Barbie", 45)};

    public Cine(String nombre,int filas,int columnas, int numerosalas, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        salas = new Sala[numerosalas];
        for( int i = 0; i<salas.length;i++) {
            salas[i] = new Sala(i, null, columnas, filas);
        }
    }
    public Sala buscarSala(int numeroSala) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numeroSala) {
                return sala;
            }
        }
        return null;
    }
    public void sacarpeliculasalas1() {
        for (int i = 0; i<salas.length;i++){
            getSalas()[i].setPelicula(arraypelicula[i]);
            System.out.println("SALA " + (i+1));
            // Este método devuelve el título de la película almacenado en el atributo titulo
            System.out.println("PELICULA; " + getSalas()[i].getPelicula().getTitulo() + "\nDURACION: " + getSalas()[i].getPelicula().getDuracion());
        }
// Se hacen diferentes public
    }
    public String getNombre()  {
        return nombre;
    }
    public int getAforo() {
        return aforo;
    }
    public Sala[] getSalas() {

        return salas;
    }
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}