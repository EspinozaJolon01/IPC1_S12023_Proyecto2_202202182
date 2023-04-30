/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

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

    public void agregarImagen(String imagen) {
        NodoImagen nodoImagen = new NodoImagen(imagen);

        if (this.inicio == null) {
            this.inicio = nodoImagen;
        }

        NodoImagen temporal = this.inicio;
        while (temporal.getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        temporal.setSiguiente(nodoImagen);
        nodoImagen.setAnterior(temporal);
    }

}
