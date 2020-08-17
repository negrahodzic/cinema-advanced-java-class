/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;

/**
 *
 * @author Negra
 */
public interface MovieService {

    List<MovieDto> getAll();
//    MovieEntity getById(Long id);

    public MovieDto getById(Long movieId);
}
