/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import FrmVistas.FrmMenuPrinciapal;
import Modelo.ControlData;


import handlersImg.JEPGImageHandlerBN;
import proyecto2.JPEGHandler;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
       ControlData data = new ControlData();
       
        FrmMenuPrinciapal vista = new FrmMenuPrinciapal(data);
        vista.setVisible(true);

        

    }

}
