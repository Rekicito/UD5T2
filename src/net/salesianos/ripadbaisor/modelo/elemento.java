package net.salesianos.ripadbaisor.modelo;

public class elemento {

    private String nombre;
    private String categoria;
    private String ubicacion;
    private int puntuacion;

    public elemento(String nombre, String categoria, String ubicacion, int puntuacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nCategoría: " + categoria +
                "\nUbicación: " + ubicacion +
                "\nPuntuación: " + puntuacion;
    }

}
