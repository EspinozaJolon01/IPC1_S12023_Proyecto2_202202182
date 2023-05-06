/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Modelo.Usuario;
import java.util.ArrayList;

import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Usuario
 */
public class ListaUser extends EstructuraDeDatos {

    private NodoUser cabeza;

    @Override
    public void add(Object e) {
        String nombreUser = e.toString();

        NodoUser nodoUser = new NodoUser(nombreUser);
        if (cabeza == null) {
            cabeza = nodoUser;
        } else {
            NodoUser aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodoUser);
        }
        index++;
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

    public void agregarNodo(NodoUser nuevoNodo) {

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }

    }

    public NodoUser getUsuario(String usuario) {
        NodoUser temporal = cabeza;

        while (temporal != null) {
            if (temporal.getUsuario().equals(usuario)) {
                return temporal;
            }
            temporal = temporal.siguiente;
        }
        return null;
    }

    public boolean verificarUsuarioEnLista(String usuario) {
        NodoUser temporal = cabeza;

        while (temporal != null) {
            if (temporal.getUsuario().equals(usuario)) {
                return true;
            }

            temporal = temporal.siguiente;
        }
        return false;
    }

    public NodoUser getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoUser cabeza) {
        this.cabeza = cabeza;
    }

}
