/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Test;

import App.*;
import DAO.DAOUsuarios;
import Entity.Usuarios;
import EntityManagerFactory.ConnectionEntityManager;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author diosl
 */
public class Listar {

    public static void main(String[] args) {

        DAOUsuarios dAOUsuarios = new DAOUsuarios();
        List<Usuarios> list = dAOUsuarios.listarUsuarios();

        System.out.println(list.size() + " resultados");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getNombre()); //...
        }

        /*for (Usuarios usuarios : list) {
            System.out.println(usuarios.getId() + " " + usuarios.getNombre()); //...
        }*/
    }

}
