/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.entity.Projection;
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
    public List<Projection> getAll() {
        return projectionRepository.getAll();
    }

    @Override
    public Projection getById(Long id) {
        return projectionRepository.getById(id);
    }

}
