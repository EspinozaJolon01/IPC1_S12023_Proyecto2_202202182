/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerJPEG;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloBmp extends Thread {

    ArrayList<String> imagenes;

    public HiloBmp(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImageHandlerJPEG handlresJEPG = new JEPGImageHandlerJPEG(imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlresJEPG);

            } catch (Exception j) {
                j.printStackTrace();
            }
        }

    }
}
