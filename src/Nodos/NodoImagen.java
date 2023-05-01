/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

/**
 *
 * @author Usuario
 */
public class NodoImagen {

    private String categoria;
    private String imagen;
    private NodoImagen siguiente;
    private NodoImagen anterior;

    public NodoImagen(String imagen, String categoria) {
        this.imagen = imagen;
        this.categoria = categoria;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public NodoImagen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoImagen siguiente) {
        this.siguiente = siguiente;
    }

    public NodoImagen getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoImagen anterior) {
        this.anterior = anterior;
    }

}
