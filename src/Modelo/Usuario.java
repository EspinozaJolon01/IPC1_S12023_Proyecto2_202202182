/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario {

    public Usuario nombre;
    public String foto;



    public Usuario(Usuario nombre) {
        this.nombre = nombre;

    }

    public Usuario getNombre() {
        return nombre;
    }

    public void setNombre(Usuario nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", foto=" + foto + '}';
    }

}
