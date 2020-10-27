/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Usuarios;
import EntityManagerFactory.ConnectionEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author diosl
 */
public class DAOUsuarios {

    public boolean registrar(Usuarios usuarios) {
        EntityManager entityManager = null;
        try {
            entityManager = ConnectionEntityManager.createEntityManagerFactory();
            entityManager.getTransaction().begin();
            entityManager.persist(usuarios);
            entityManager.getTransaction().commit();
            System.out.println("Datos registrados satisfactoriamente");
            return true;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public boolean acualizar(Usuarios usuarios) {
        EntityManager entityManager = null;
        try {
            entityManager = ConnectionEntityManager.createEntityManagerFactory();
            Usuarios u = entityManager.find(Usuarios.class, usuarios.getId());
            entityManager.getTransaction().begin();
            if (u != null) {
                if (entityManager.contains(u)) {
                    entityManager.merge(usuarios);
                    System.out.println("Datos actualizados satisfactoriamente");
                }
            } else {
                System.out.println("Datos no registrados");
                System.out.println("No se puede actualizar");
            }
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public boolean eliminar(Usuarios usuarios) {
        EntityManager entityManager = null;
        try {
            entityManager = ConnectionEntityManager.createEntityManagerFactory();
            Usuarios u = entityManager.find(Usuarios.class, usuarios.getId());
            entityManager.getTransaction().begin();
            if (u != null) {
                if (entityManager.contains(u)) {
                    entityManager.remove(u);
                    System.out.println("Datos eliminados satisfactoriamente");
                }
            } else {
                System.out.println("Datos no registrados");
                System.out.println("No se puede eliminar");
            }
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    public List<Usuarios> listarUsuarios() {
        EntityManager entityManager = null;
        List<Usuarios> list;
        try {
            entityManager = ConnectionEntityManager.createEntityManagerFactory();
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("select u from Usuarios u");
            list = query.getResultList();
            entityManager.getTransaction().commit();
            return list;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
}
