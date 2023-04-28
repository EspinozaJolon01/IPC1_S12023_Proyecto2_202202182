/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Nodos.ListaUser;

/**
 *
 * @author Usuario
 */
public class Data {

    private ListaUser listaUsuarios;

    public Data() {
        listaUsuarios = new ListaUser();
    }

    public ListaUser getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ListaUser listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
