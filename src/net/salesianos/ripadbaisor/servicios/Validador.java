package net.salesianos.ripadbaisor.servicios;

import javax.swing.JOptionPane;

public class Validador {

    public static String pedirTexto(String mensaje) {

        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirNumero(String mensaje) {

        int numero = 0;
        boolean valido = false;

        while (!valido) {

            try {

                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(mensaje));

                valido = true;

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Debes introducir un número válido");
            }
        }

        return numero;
    }
}
