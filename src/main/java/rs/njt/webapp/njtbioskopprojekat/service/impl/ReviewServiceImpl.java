/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.ReviewRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReviewService;

/**
 *
 * @author Negra
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> getAll() {
        return reviewRepository.getAll();
    }

    @Override
    public ReviewEntity getById(Long id) {
        return reviewRepository.getById(id);
    }
}
