/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.RoomDto;
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
            
            // TODO: ovo napraviti u metodi u review repo ili service 
            List<ReviewEntity> reviews = projection.getMovie().getReviews();   
            List<ReviewDto> reviewDtos = new ArrayList<>();
            
            for (ReviewEntity review : reviews) { 
                reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment()));
            }
            
            projectionDtos.add(new ProjectionDto(projection.getProjectionId(), projection.getDateTimeOfProjection(),
                                    projection.getTechnology(), projection.getEdited(), 
                                    new RoomDto(projection.getRoom().getRoomId(), projection.getRoom().getCapacity(), projection.getRoom().getRoomName()), 
                                    new MovieDto(projection.getMovie().getMovieId(), projection.getMovie().getTitle(), projection.getMovie().getDescription(), projection.getMovie().getDuration(), 
                                                 new GenreDto(projection.getMovie().getGenre().getGenreId(), projection.getMovie().getGenre().getGenreName()), 
                                    reviewDtos)));
        }

        return projectionDtos; 
    }

}
