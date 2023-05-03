/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import handlersImg.JEPGImageHandlerCopia;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class HiloCopia extends Thread {
    
    ArrayList<String> imagenes;
    
    public HiloCopia(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < imagenes.size(); i++) {
            JEPGImageHandlerCopia handlerCopia = new JEPGImageHandlerCopia(imagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerCopia);
                
            } catch (Exception k) {
                k.printStackTrace();
            }
        }
        
    }
    
}
