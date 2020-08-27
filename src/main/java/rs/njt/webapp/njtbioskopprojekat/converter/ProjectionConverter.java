/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;

/**
 *
 * @author Negra
 */
public class ProjectionConverter {
        public static ProjectionDto convertFromEntityToDto(ProjectionEntity projection) {
        ProjectionDto projectionDto = new ProjectionDto(projection.getProjectionId(), projection.getDateTimeOfProjection(), projection.getTechnology(), projection.getEdited(),
                                        RoomConverter.convertFromEntityToDto(projection.getRoom()),
                                        MovieConverter.convertFromEntityToDto(projection.getMovie()));
        return projectionDto;
    }

    public static ProjectionEntity convertFromDtoToEntity(ProjectionDto projectionDto) {
        ProjectionEntity projection = new ProjectionEntity( projectionDto.getProjectionId(), projectionDto.getDateTimeOfProjection(), projectionDto.getTechnology(), projectionDto.getEdited(),
                                        RoomConverter.convertFromDtoToEntity(projectionDto.getRoom()),
                                        MovieConverter.convertFromDtoToEntity(projectionDto.getMovie()));
        return projection;
    }
}
