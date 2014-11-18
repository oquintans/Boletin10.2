/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Juegaso {

    private int cont1 = 0;

    public double pedirNum() {
        double num;
        do {
            num = Math.random() * 100;
        } while (num < 1 || num > 50);
        return num;
    }

    public int intentosMax() {
        int num;
        do {
            String dato = JOptionPane.showInputDialog("Introducir número de intentos: ");
            num = Integer.parseInt(dato);
        } while (num <= 0);
        return num;
    }

    public void jugar() {

        double num;
        double resp = this.pedirNum();
        int intento = this.intentosMax();

        do {
            String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Double.parseDouble(dato);

            cont1++;

            if (num - resp > 20 || resp - num > 20) {
                JOptionPane.showMessageDialog(null, "Muy frio.");
            }
            if (num - resp <= 20 && num - resp > 15 || resp - num <= 20 && resp - num > 15) {
                JOptionPane.showMessageDialog(null, "Frio.");
            }
            if (num - resp <= 15 && num - resp > 5 || resp - num <= 15 && resp - num > 5) {
                JOptionPane.showMessageDialog(null, "Caliente.");
            }
            if (num - resp <= 5 && num - resp > 0 || resp - num <= 5 && resp - num > 0) {
                JOptionPane.showMessageDialog(null, "Muy caliente.");
            }
            JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont1));

        } while (num != resp && cont1 != intento);

        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont1 == intento) {
            JOptionPane.showMessageDialog(null, "LOSER");
        }
    }
}
