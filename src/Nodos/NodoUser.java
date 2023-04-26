/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Modelo.Categoria;
import static Modelo.CategoriaDao.categoria;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class NodoUser {

    private Usuario usuario;
    private NodoUser siguiente;

    public NodoUser(Usuario usuario) {
        this.usuario = usuario;

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUser getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUser siguiente) {
        this.siguiente = siguiente;
    }

}
