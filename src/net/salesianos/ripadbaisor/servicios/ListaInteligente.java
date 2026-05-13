package net.salesianos.ripadbaisor.servicios;

import java.util.ArrayList;
import net.salesianos.ripadbaisor.modelo.Elemento;

public class ListaInteligente {

    private ArrayList<Elemento> elementos;

    public ListaInteligente() {
        elementos = new ArrayList<>();
    }

    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public String mostrarElementos() {

        if (elementos.isEmpty()) {
            return "No hay elementos guardados en la lista";
        }

        String resultado = "";

        for (Elemento elemento : elementos) {

            resultado += elemento.toString() + "\n";
        }

        return resultado;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void eliminarElemento(int posicion) {

        if (posicion >= 0 && posicion < elementos.size()) {
            elementos.remove(posicion);
        }
    }

    public Elemento getElemento(int posicion) {

        if (posicion >= 0 && posicion < elementos.size()) {
            return elementos.get(posicion);
        }

        return null;
    }

    public void editarPuntuacion(int posicion, int nuevaPuntuacion) {

        Elemento elemento = getElemento(posicion);

        if (elemento != null) {
            elemento.setPuntuacion(nuevaPuntuacion);
        }
    }

}