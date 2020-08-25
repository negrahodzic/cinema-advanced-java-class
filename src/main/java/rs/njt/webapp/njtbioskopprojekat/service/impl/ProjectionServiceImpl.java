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
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
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

    @Override
    public List<ProjectionDto> getByMovieId(Long movieId) {
        
        List<ProjectionEntity> projections = projectionRepository.findByMovieId(movieId);
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("projections: "+projections.get(0).getProjectionId());
        System.out.println("==============================================");
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

    @Override
    public ProjectionDto getById(Long projectionId) {
        Optional<ProjectionEntity> projection = projectionRepository.findById(projectionId);
            
        List<ProjectionDto> projectionDtos = new ArrayList<>();

           
            
            // TODO: ovo napraviti u metodi u review repo ili service 
            List<ReviewEntity> reviews = projection.get().getMovie().getReviews();   
            List<ReviewDto> reviewDtos = new ArrayList<>();
            
            for (ReviewEntity review : reviews) { 
                reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment()));
            }
            
            projectionDtos.add(new ProjectionDto(projection.get().getProjectionId(), projection.get().getDateTimeOfProjection(),
                                    projection.get().getTechnology(), projection.get().getEdited(), 
                                    new RoomDto(projection.get().getRoom().getRoomId(), projection.get().getRoom().getCapacity(), projection.get().getRoom().getRoomName()), 
                                    new MovieDto(projection.get().getMovie().getMovieId(), projection.get().getMovie().getTitle(), projection.get().getMovie().getDescription(), projection.get().getMovie().getDuration(), 
                                                 new GenreDto(projection.get().getMovie().getGenre().getGenreId(), projection.get().getMovie().getGenre().getGenreName()), 
                                    reviewDtos)));
        

        return projectionDtos.get(0);
    }

}
