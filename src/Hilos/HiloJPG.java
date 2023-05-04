/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerBmp;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloJPG extends Thread {

    ArrayList<String> imagenes;
    JTextArea txtArea;

    public HiloJPG(ArrayList<String> imagenes, JTextArea txtArea) {
        this.imagenes = imagenes;
        this.txtArea = txtArea;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImageHandlerBmp handlresBmp = new JEPGImageHandlerBmp(imagenes.get(i));
            txtArea.append("\nejecucion terminada de convertir a jpg: " + imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlresBmp);
            } catch (Exception p) {
                p.printStackTrace();
            }
        }

    }

}
