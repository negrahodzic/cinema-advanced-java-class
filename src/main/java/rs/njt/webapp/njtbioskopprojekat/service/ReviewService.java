/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;


import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;

/**
 *
 * @author Negra
 */
public interface ReviewService {

    List<ReviewDto> getAll();

    public void saveReview(Long movieId, int gradeInt, String comment, UserDto user);

}
