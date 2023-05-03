/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerModificar;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloModificar extends Thread {

    ArrayList<String> imagenes;

    public HiloModificar(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < imagenes.size(); i++) {
                    JEPGImageHandlerModificar handlersModificar = new JEPGImageHandlerModificar(imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlersModificar);
            } catch (Exception k) {
                k.printStackTrace();
            }
        }

    }

}
