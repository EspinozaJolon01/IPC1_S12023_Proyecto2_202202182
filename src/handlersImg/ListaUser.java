/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlersImg;

import Modelo.Usuario;
import proyecto2.EstructuraDeDatos;

/**
 *
 * @author Usuario
 */
public class ListaUser extends EstructuraDeDatos {

    private NodoUser cabeza = null;
    
    
    
    public void listarNombres(){
        NodoUser  axu =  cabeza;
        while (axu != null) {       
            System.out.println("-------------------");
            System.out.println(axu.getUsuario().nombre + " --");
            axu =  axu.getSiguiente();
        }
        System.out.println("null \n");
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
            aux.setSiguiente(aux);
        }
        index++;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}
