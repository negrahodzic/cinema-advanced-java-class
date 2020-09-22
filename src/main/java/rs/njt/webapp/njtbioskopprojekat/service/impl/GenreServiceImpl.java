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
import org.springframework.transaction.annotation.Transactional;
import rs.njt.webapp.njtbioskopprojekat.converter.GenreConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Service
@Transactional
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<GenreDto> getAll() {
        List<GenreEntity> genres = genreRepository.findAll();
        List<GenreDto> genreDtos = new ArrayList<>();

        for (GenreEntity genre : genres) {
            genreDtos.add(GenreConverter.convertFromEntityToDto(genre));
        }

        return genreDtos;
    }

    @Override
    public void saveAll(List<GenreEntity> genres) {
        genreRepository.saveAll(genres);
        genreRepository.flush();
    }

}
