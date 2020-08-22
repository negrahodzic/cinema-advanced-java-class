/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;

/**
 *
 * @author Negra
 */
public interface ProjectionService {

    List<ProjectionDto> getAll();
//    ProjectionEntity getById(Long id);

    public List<ProjectionDto> getByMovieId(Long movieId);
}
