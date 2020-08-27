/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.ProjectionConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.repository.ProjectionRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author Negra
 */
@Service
public class ProjectionServiceImpl implements ProjectionService {

    @Autowired
    private ProjectionRepository projectionRepository;

    @Override
    public List<ProjectionDto> getAll() {
        List<ProjectionEntity> projections = projectionRepository.findAll();
        List<ProjectionDto> projectionDtos = new ArrayList<>();

        for (ProjectionEntity projection : projections) {                        
            projectionDtos.add(ProjectionConverter.convertFromEntityToDto(projection));
        }

        return projectionDtos; 
    }

    @Override
    public List<ProjectionDto> getByMovieId(Long movieId) {       
        List<ProjectionEntity> projections = projectionRepository.findByMovieId(movieId);
        List<ProjectionDto> projectionDtos = new ArrayList<>();

        for (ProjectionEntity projection : projections) {               
            projectionDtos.add(ProjectionConverter.convertFromEntityToDto(projection));
        }

        return projectionDtos;
    }

    @Override
    public ProjectionDto getById(Long projectionId) {
        Optional<ProjectionEntity> projection = projectionRepository.findById(projectionId);           
        
        ProjectionDto projectionDto = ProjectionConverter.convertFromEntityToDto(projection.get());

        return projectionDto;
    }

}
