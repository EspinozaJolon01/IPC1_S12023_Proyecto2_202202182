/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerBN;
import handlersImg.JEPGImagenHandlerColores;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloColor  extends Thread{
      ArrayList<String> imagenes;

    public HiloColor(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public void run() {

        for (int i = 0; i < imagenes.size(); i++) {
             JEPGImagenHandlerColores handlerColores = new JEPGImagenHandlerColores(imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerColores);
            } catch (Exception o) {
                o.printStackTrace();
            }

        }

    }
}
