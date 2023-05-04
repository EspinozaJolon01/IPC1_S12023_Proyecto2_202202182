/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerCopia;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloCopia extends Thread {

    ArrayList<String> imagenes;
    JTextArea txtArea;

    public HiloCopia(ArrayList<String> imagenes, JTextArea txtArea) {
        this.imagenes = imagenes;
        this.txtArea = txtArea;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImageHandlerCopia handlerCopia = new JEPGImageHandlerCopia(imagenes.get(i));
            txtArea.append("\nejecución terminada de realizar una copia: " + imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerCopia);

            } catch (Exception k) {
                k.printStackTrace();
            }
        }

    }

}
