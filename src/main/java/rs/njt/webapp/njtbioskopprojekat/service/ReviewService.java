/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;


import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.dto.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public interface ReviewService {

    List<ReviewDto> getAll();

    public void saveReview(Long movieId, int gradeInt, String comment, UserDto user);

}
