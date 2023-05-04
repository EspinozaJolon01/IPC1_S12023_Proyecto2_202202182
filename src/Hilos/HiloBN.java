/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerBN;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloBN extends Thread {

    ArrayList<String> imagenes;
    JTextArea txtArea;

    public HiloBN(ArrayList<String> imagenes, JTextArea txtArea) {
        this.imagenes = imagenes;
        this.txtArea = txtArea;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImageHandlerBN handlerBn = new JEPGImageHandlerBN(imagenes.get(i));
            txtArea.append("\nejecucion terminada, de convertir a blanco y negro: " + imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerBn);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
