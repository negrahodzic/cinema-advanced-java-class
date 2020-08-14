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
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.MovieRepository;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.impl.MovieServiceImpl;

/**
 *
 * @author Negra
 */

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class MovieRepositoryImpl implements MovieRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<MovieEntity> getAll() {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        }

        String query = "select m from Movie m";
//      System.out.println("==========="+entityManager.createQuery(query, GenreEntity.class).getResultList().toString());
         //entityManager.createQuery(query, MovieEntity.class).getResultList();
         

        MovieEntity movie = entityManager.find(MovieEntity.class, 1L);
        List<MovieEntity> movies = new ArrayList<MovieEntity>();
        movies.add(movie);
        
        return movies;
    }

    @Override
    public MovieEntity getById(Long id) {
        
    return entityManager.find(MovieEntity.class, id);
    }
    
}
