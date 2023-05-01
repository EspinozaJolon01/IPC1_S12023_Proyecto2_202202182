/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class ListaImagen {

    NodoImagen inicio;
    NodoImagen ultimo;

    public ListaImagen() {
        this.inicio = null;

    }

    public void agregarImagen(String imagen, String categoria) {
        NodoImagen nodoImagen = new NodoImagen(imagen, categoria);

        if (this.inicio == null) {
            this.inicio = nodoImagen;
        } else {
            NodoImagen temporal = this.inicio;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }

            temporal.setSiguiente(nodoImagen);
            nodoImagen.setAnterior(temporal);
        }
    }

    public NodoImagen getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoImagen ultimo) {
        this.ultimo = ultimo;
    }

    public void setInicio(NodoImagen inicio) {
        this.inicio = inicio;
    }

    public NodoImagen getInicio() {
        return inicio;
    }

}
