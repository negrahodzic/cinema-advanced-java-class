/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.DateConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.ProjectionConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.repository.ProjectionRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
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

    @Override
    public List<ProjectionDto> searchByTitleAndDate(String titleFilter, String dateFilter) {

        List<ProjectionEntity> projections = projectionRepository.findAll();
        List<ProjectionDto> projectionDtos = new ArrayList<>();

        for (ProjectionEntity projection : projections) {
            if (dateFilter.equals("- Choose date -")) {
                if (projection.getMovie().getTitle().toLowerCase().startsWith(titleFilter)) {
                    projectionDtos.add(ProjectionConverter.convertFromEntityToDto(projection));
                }
            } else if (DateConverter.convertToDate(projection.getDateTimeOfProjection()).equals(dateFilter)) {
                if (titleFilter.equals("")) {
                    projectionDtos.add(ProjectionConverter.convertFromEntityToDto(projection));
                } else if (projection.getMovie().getTitle().toLowerCase().startsWith(titleFilter)) {
                    projectionDtos.add(ProjectionConverter.convertFromEntityToDto(projection));
                }
            }

        }
        return projectionDtos;

    }

    @Override
    public List<String> getDates() {
        List<ProjectionEntity> projections = projectionRepository.findAll();
        List<String> dates = new ArrayList<>();

        for (ProjectionEntity projection : projections) {
            if (!dates.contains(DateConverter.convertToDate(projection.getDateTimeOfProjection()))) {
                dates.add(DateConverter.convertToDate(projection.getDateTimeOfProjection()));
            }

        }

        return dates;
    }

    @Override
    public void saveProjection(ProjectionDto projection) {
        try {
            ProjectionEntity projectionEntity = ProjectionConverter.convertFromDtoToEntity(projection);
            projectionRepository.saveAndFlush(projectionEntity);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
