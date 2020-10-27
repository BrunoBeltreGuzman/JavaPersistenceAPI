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
public class Actualizar {

    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.setId(52);
        usuarios.setNombre("sa2");
        usuarios.setCorreo("sa2@gmail.com");
        usuarios.setUser("sa2");
        usuarios.setPassword("root2");

        DAOUsuarios dAOUsuarios = new DAOUsuarios();
        dAOUsuarios.acualizar(usuarios);
    }

}
