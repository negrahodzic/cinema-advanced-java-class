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
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;

/**
 *
 * @author Negra
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)//mora se pozvati iz transakcije
public class GenreRepositoryImpl implements GenreRepository {

    @PersistenceContext
    EntityManager entityManager;

    //@Transactional(propagation = Propagation.NEVER)//bez
    //@Transactional(propagation = Propagation.SUPPORTS)//ako postoi u okviru nje, ako ne bez
    @Transactional(propagation = Propagation.REQUIRED)//ako postoi u okviru nje, ako ne bez
    @Override
    public List<GenreEntity> getAll() {
        System.out.println("TransactionSynchronizationManager.isActualTransactionActive(): "+TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("TransactionAspectSupport.currentTransactionStatus(): "+ TransactionAspectSupport.currentTransactionStatus().isNewTransaction());
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        }

        System.out.println("===========GenreRepositoryImpl.getAll()===========");
        String query = "select g from Genre g";
//        System.out.println("==========="+entityManager.createQuery(query, GenreEntity.class).getResultList().toString());
         return entityManager.createQuery(query, GenreEntity.class).getResultList();
//         List<Genre> genreList = new ArrayList<Genre>();
//         genreList.add(new GenreEntity("KRIMEEEEEEEE"));
//         return genreList;
    }

    @Override
    public GenreEntity getById(Long id) {
        System.out.println("GenreRepositoryImpl.getById()");
        return entityManager.find(GenreEntity.class, id);
    }

//    @Override
//    public void add(Genre1 genre) {
//        System.out.println("GenreRepositoryImpl.add()");
//        entityManager.persist(genre);
//    }

}
