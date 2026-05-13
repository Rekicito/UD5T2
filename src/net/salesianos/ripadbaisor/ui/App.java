package net.salesianos.ripadbaisor.ui;

import javax.swing.JOptionPane;
import net.salesianos.ripadbaisor.modelo.Elemento;
import net.salesianos.ripadbaisor.servicios.ListaInteligente;
import net.salesianos.ripadbaisor.servicios.Validador;

public class App {

    public static void main(String[] args) {

        ListaInteligente lista = new ListaInteligente();

        int opcion = 0;

        while (opcion != 5) {

            opcion = Validador.pedirNumero(
                    "1. Añadir elemento\n"
                            + "2. Mostrar elementos\n"
                            + "3. Editar puntuación\n"
                            + "4. Eliminar elemento\n"
                            + "5. Salir");

            switch (opcion) {

                case 1:

                    String nombre = Validador.pedirTexto("Introduce el nombre");

                    String categoria = Validador.pedirTexto("Introduce la categoria");

                    String ubicacion = Validador.pedirTexto("Introduce la ubicación");

                    int puntuacion = Validador.pedirNumero("Introduce la puntuación (1-5)");

                    Elemento nuevoElemento = new Elemento(nombre, categoria, ubicacion, puntuacion);

                    lista.addElemento(nuevoElemento);

                    JOptionPane.showMessageDialog(
                            null,
                            "Elemento añadido correctamente");

                    break;

                case 2:

                    JOptionPane.showMessageDialog(
                            null,
                            lista.mostrarElementos());

                    break;

                case 3:

                    int posicionEditar = Validador.pedirNumero("Introduce la posición que quieres editar");

                    int nuevaPuntuacion = Validador.pedirNumero("Introduce la nueva puntuación");

                    lista.editarPuntuacion(
                            posicionEditar,
                            nuevaPuntuacion);

                    JOptionPane.showMessageDialog(
                            null,
                            "Puntuación actualizada");

                    break;

                case 4:

                    int posicionEliminar = Validador.pedirNumero("Introduce la posición que quieres eliminar");

                    lista.eliminarElemento(posicionEliminar);

                    JOptionPane.showMessageDialog(
                            null,
                            "Elemento eliminado");

                    break;

                case 5:

                    JOptionPane.showMessageDialog(
                            null,
                            "Saliendo del programa");

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opción incorrécta");
            }
        }
    }
}