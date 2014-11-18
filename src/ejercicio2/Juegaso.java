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

    public int pedirNum() {

        int num;

        do {
            double random = Math.random() * 100;
            num = (int) random;
        } while (num < 1 || num > 50);
        return num;
    }

    public int intentosMax() {

        int numI;

        do {
            String dato = JOptionPane.showInputDialog("Introducir número de intentos: ");
            numI = Integer.parseInt(dato);
        } while (numI <= 0);
        return numI;
    }

    public void jugar() {

        int num;
        int cont = 0;
        int resp = this.pedirNum();
        int intento = this.intentosMax();

        do {
            String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Integer.parseInt(dato);
            cont++;

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
            JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont));

        } while (num != resp && cont != intento);

        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont == intento) {
            JOptionPane.showMessageDialog(null, "LOSER");
        }
    }

    public void jugar2() {

        int num ;
        int cont;
        int resp = this.pedirNum();
        int intento = this.intentosMax();
        
        String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Integer.parseInt(dato);

        for (cont = 1; cont < intento && num != resp; cont++) {
            

            if (num - resp > 20 || resp - num > 20) {
                JOptionPane.showMessageDialog(null, "Muy frio.");
                JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont));
            }
            if (num - resp <= 20 && num - resp > 15 || resp - num <= 20 && resp - num > 15) {
                JOptionPane.showMessageDialog(null, "Frio.");
                JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont));
            }
            if (num - resp <= 15 && num - resp > 5 || resp - num <= 15 && resp - num > 5) {
                JOptionPane.showMessageDialog(null, "Caliente.");
                JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont));
            }
            if (num - resp <= 5 && num - resp > 0 || resp - num <= 5 && resp - num > 0) {
                JOptionPane.showMessageDialog(null, "Muy caliente.");
                JOptionPane.showMessageDialog(null, "Intentos: " + (intento - cont));
            }
            String dato2 = JOptionPane.showInputDialog("DALE AHÍ");
            num = Integer.parseInt(dato2);

        }
        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont == intento) {
            JOptionPane.showMessageDialog(null, "LOSER");
        }

    }
}
