/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerBN;
import handlersImg.JEPGImagenHandlerColores;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloColor extends Thread {

    ArrayList<String> imagenes;
    JTextArea txtArea;

    public HiloColor(ArrayList<String> imagenes, JTextArea txtArea) {
        this.imagenes = imagenes;
        this.txtArea = txtArea;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImagenHandlerColores handlerColores = new JEPGImagenHandlerColores(imagenes.get(i));
            txtArea.append("\nejecucion terminada de realizar multi colores: " + imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerColores);
            } catch (Exception o) {
                o.printStackTrace();
            }

        }

    }
}
