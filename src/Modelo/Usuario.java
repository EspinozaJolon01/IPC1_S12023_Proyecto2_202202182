/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Modelo.CategoriaDao.categoria;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario {

    public String nombre;
    public String foto;
 

    public Usuario() {

    }

    public Usuario(String foto) {
        this.foto = foto;
     
    }

    public Usuario(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

//    public static ArrayList<Categoria> getCategoria() {
//        return categoria;
//    }

//    public static void setCategoria(ArrayList<Categoria> categoria) {
//        Usuario.categoria = categoria;
//    }
//    
//         public int buscarCategorias(String nombre) {
//        int n = -1;
//
//        for (int i = 0; i < categoria.size(); i++) {
//            if (categoria.get(i).getNombre().equals(nombre)) {
//                n = i;
//                break;
//            }
//        }
//        return n;
//    }

//    public boolean agregarCategoria(Categoria categor) {
//        if (buscarCategorias(categor.getNombre()) == -1) {
//
//            categoria.add(categor);
//            return true;
//
//        } else {
//            return false;
//        }
//    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", foto=" + foto + '}';
    }

}
