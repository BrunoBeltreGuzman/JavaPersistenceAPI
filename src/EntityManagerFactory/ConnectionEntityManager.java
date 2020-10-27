/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author diosl
 */
public class ConnectionEntityManager {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManager createEntityManagerFactory() {

        try {
            if (entityManagerFactory == null) {
                entityManagerFactory = Persistence.createEntityManagerFactory("JavaPersistenceAPI");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return (EntityManager) entityManagerFactory.createEntityManager();
    }
}
