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
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public interface ProjectionService {

    List<ProjectionDto> getAll();

    public List<ProjectionDto> getByMovieId(Long movieId);

    public ProjectionDto getById(Long projectionId);

    public List<ProjectionDto> searchByTitleAndDate(String toLowerCase, String dateFilter);

    public List<String> getDates();

    public void saveProjection(ProjectionDto projection);
}
