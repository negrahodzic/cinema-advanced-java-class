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
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;

/**
 *
 * @author Negra
 */
@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<GenreDto> getAll() {
        List<GenreEntity> genres = genreRepository.findAll();
        List<GenreDto> genreDtos = new ArrayList<>();

        for (GenreEntity genre : genres) {
            genreDtos.add(new GenreDto(genre.getGenreId(), genre.getGenreName()));
        }
        
        return genreDtos;
    }      

}
