/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Usuario
 */
public class HiloPorgreso extends Thread {

    JProgressBar barProce;
    ArrayList<String> imagenes;

    public HiloPorgreso(JProgressBar barProce, ArrayList<String> imagenes) {
        this.barProce = barProce;
        this.imagenes = imagenes;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            barProce.setValue(i);

            try {
                sleep(imagenes.size()*5);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPorgreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("finalizado");

    }

}
