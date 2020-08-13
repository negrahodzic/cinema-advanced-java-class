/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.repository.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import rs.njt.webapp.njtbioskopprojekat.entity.User;
import rs.njt.webapp.njtbioskopprojekat.repository.UserRepository;

/**
 *
 * @author Negra
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAll() {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        }
        //        String query = "select * FROM User";
        //
        //        return entityManager.createQuery(query, User.class).getResultList();
        //     em.find(ManufacturerEntity.class, id);
        User user = entityManager.find(User.class, 1);
        List<User> users = new ArrayList<User>();
        users.add(user);
        
        return users;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public User findByUsername(String username) {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        }

        String query = "select u FROM User u WHERE u.username = ?1";

        return entityManager.createQuery(query, User.class).setParameter(1, username).getResultList().get(0);

    }

}
