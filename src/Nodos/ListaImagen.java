/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import javax.swing.JButton;
import javax.swing.JLabel;
import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Usuario
 */
public class ListaImagen extends EstructuraDeDatos {

    private NodoImagen inicio;
    private NodoImagen ultimo;

    public ListaImagen() {
        this.inicio = null;
        this.ultimo = null;

    }

    @Override
    public void add(Object e) {
 
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    //eliminar

    public void eliminaImagen(String imagen, String categoria) {
        NodoImagen actual = new NodoImagen(imagen, categoria);
        NodoImagen atras = new NodoImagen(imagen, categoria);

        actual = inicio;
        atras = ultimo;

//        actual = inicio;
//        atras = null;
        while (actual != null) {
            if (actual.rutaPath == imagen) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                } else if (actual == ultimo) {
                    atras.siguiente = null;
                    ultimo = atras;
                    
                } else {
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }
    }

    public NodoImagen getListarImagenDelFinal() {
        NodoImagen temporal = this.inicio;
        while (temporal.getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        return temporal;
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
