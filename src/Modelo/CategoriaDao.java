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
public class CategoriaDao {

    public static ArrayList<Categoria> categoria;

    public CategoriaDao() {

        categoria = new ArrayList<>();
    }

    public void categoriaGeneral() {
        Categoria cate = new Categoria("General");
        categoria.add(cate);
        System.out.println(cate);
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
