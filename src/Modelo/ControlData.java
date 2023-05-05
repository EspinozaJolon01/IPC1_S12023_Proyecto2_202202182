/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Nodos.ListaImagen;
import Nodos.ListaUser;

/**
 *
 * @author Usuario
 */
public class ControlData {

    private ListaUser listaUsuarios;
    private ListaImagen listarImagenes;

    public ControlData() {
        listaUsuarios = new ListaUser();
        listarImagenes = new ListaImagen();
    }

    public ListaUser getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ListaUser listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaImagen getListarImagenes() {
        return listarImagenes;
    }

    public void setListarImagenes(ListaImagen listarImagenes) {
        this.listarImagenes = listarImagenes;
    }

}
