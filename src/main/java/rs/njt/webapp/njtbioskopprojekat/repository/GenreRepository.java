/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.repository;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;

/**
 *
 * @author Negra
 */
public interface GenreRepository {

    List<GenreEntity> getAll();

    GenreEntity getById(Long id);
}
