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
import javax.persistence.EntityManager;

/**
 *
 * @author diosl
 */
public class Registrar {

    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        //usuarios.setId(Integer.BYTES);
        usuarios.setNombre("sa");
        usuarios.setCorreo("sa@gmail.com");
        usuarios.setUser("sa");
        usuarios.setPassword("root");

        DAOUsuarios dAOUsuarios = new DAOUsuarios();
        dAOUsuarios.registrar(usuarios);
    }

}
