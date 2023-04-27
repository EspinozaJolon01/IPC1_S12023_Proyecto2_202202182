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
    public static ArrayList<Categoria> categoria;

    public NodoUser(Usuario usuario) {
        this.usuario = usuario;
        categoria = new ArrayList<>();
        categoria.add(new Categoria("General"));
                
    }
    
    public NodoUser(){
        
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

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }
    
     public int buscarCategorias(String nombre) {
        int n = -1;

        for (int i = 0; i < categoria.size(); i++) {
            if (categoria.get(i).getNombre().equals(nombre)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean agregarCategoria(Categoria categor) {
        if (buscarCategorias(categor.getNombre()) == -1) {

            categoria.add(categor);
            return true;

        } else {
            return false;
        }
    }

}
