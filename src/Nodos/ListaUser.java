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
public class ListaUser extends EstructuraDeDatos {

    private NodoUser cabeza = null;
   
    public void listarNombres() {
        NodoUser axu = cabeza;
        while (axu != null) {
            System.out.println("-------------------");
            System.out.println(axu.getUsuario().nombre + " --");
            axu = axu.getSiguiente();
        }
        System.out.println("null \n");
    }

    public NodoUser getUsuario(String usuario) {
        NodoUser temporal = cabeza;

        while (temporal != null) {
            if (temporal.getUsuario().equals(usuario)) {
                return temporal;
            }

            temporal = temporal.getSiguiente();
        }
        return null;
    }

    public Object obtener(Object e) {
        Usuario usuario = (Usuario) e;
        return find(usuario);
    }

    public boolean buscarUser(Object e) {
        boolean encontrado = false;
        String nombreUsuario = e.toString();
        NodoUser aux = cabeza;
        while (encontrado != true && aux != null) {
            if (aux.getUsuario().nombre.equals(nombreUsuario)) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }

            if (encontrado == true) {
                break;
            }
        }
        return encontrado;
    }

  

    @Override
    public void add(Object e) {
        Usuario usuario = (Usuario) e;

        if (find(usuario.nombre) != null) {
            return;
        }

        NodoUser nodoUser = new NodoUser(usuario);
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

    public String obtnerUser(Object e) {

        NodoUser aux = this.cabeza;
        String nombreUsuario = e.toString();
        for (int i = 0; i < index; i++) {
            if (aux.getUsuario().nombre.equals(nombreUsuario)) {
                return aux.getUsuario().nombre;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public Object find(Object e) {

        String nombreUsuario = e.toString();
        NodoUser aux = this.cabeza;

        for (int i = 0; i < index; i++) {
            if (aux.getUsuario().nombre.equals(nombreUsuario)) {
                return aux.getUsuario();
            }
            aux = aux.getSiguiente();
        }
        return null;
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

    public NodoUser getUsuario(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
