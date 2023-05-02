/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Modelo.Categoria;
import Modelo.CategoriaDao;
import Modelo.Usuario;
import java.util.ArrayList;

import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Usuario
 */
public class ListaUser {

    private NodoUser cabeza;

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

    public String listarNombres() {
        NodoUser axu = cabeza;
        while (axu != null) {
            return axu.getUsuario();
        }
        axu = axu.getSiguiente();

        return null;
    }

    public void listarNombre() {
        NodoUser axu = cabeza;
        while (axu != null) {
            System.out.println("-------------------");
            System.out.println(axu.getUsuario() + " --");
            axu = axu.getSiguiente();
        }
        System.out.println("null \n");
    }

    public NodoUser getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoUser cabeza) {
        this.cabeza = cabeza;
    }
  
}
