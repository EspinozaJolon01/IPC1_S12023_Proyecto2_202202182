/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;



import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class NodoUser {

    public String usuario;
    public NodoUser siguiente;
    public ListaImagen listarImagenes;

    public ArrayList<String> categoria;

    public NodoUser(String usuario) {
        this.usuario = usuario;
        this.listarImagenes = new ListaImagen();
        categoria = new ArrayList<>();
        categoria.add("General");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public NodoUser getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUser siguiente) {
        this.siguiente = siguiente;
    }

    public ArrayList<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<String> categoria) {
        this.categoria = categoria;
    }

    public ListaImagen getListarImagenes() {
        return listarImagenes;
    }

    public void setListarImagenes(ListaImagen listarImagenes) {
        this.listarImagenes = listarImagenes;
    }
    
    

    public boolean agregarCategoria(String categor) {
        if (buscarCategoria(categor) == -1) {
            categoria.add(categor);
            return true;
        } else {
            return false;
        }

    }

    public void eliminarCategoria(String catego) {
        for (int i = 0; i < categoria.size(); i++) {
            if (catego.equals(categoria.get(i))) {
                categoria.remove(i);
            }
        }
    }

    public int buscarCategoria(String catego) {
        int n = -1;
        for (int i = 0; i < categoria.size(); i++) {
            if (categoria.get(i).equals(catego)) {
                n = i;
                break;
            }

        }
        return n;
    }

    @Override
    public String toString() {
        return "NodoUser{" + "usuario=" + usuario +  '}';
    }
    
    

}
