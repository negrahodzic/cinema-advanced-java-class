/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import java.text.ParseException;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ProjectionConverter {
        public static ProjectionDto convertFromEntityToDto(ProjectionEntity projection) {
        ProjectionDto projectionDto = new ProjectionDto(projection.getProjectionId(), DateConverter.convertToDateTime(projection.getDateTimeOfProjection()), projection.getTechnology(), projection.getEdited(), projection.getFreeSeats(),
                                        RoomConverter.convertFromEntityToDto(projection.getRoom()),
                                        MovieConverter.convertFromEntityToDto(projection.getMovie()));
        return projectionDto;
    }

    public static ProjectionEntity convertFromDtoToEntity(ProjectionDto projectionDto) throws ParseException {
        ProjectionEntity projection = new ProjectionEntity( projectionDto.getProjectionId(), DateConverter.convertStringToDate(projectionDto.getDateTimeOfProjection()), projectionDto.getTechnology(), projectionDto.getEdited(), projectionDto.getFreeSeats(),
                                        RoomConverter.convertFromDtoToEntity(projectionDto.getRoom()),
                                        MovieConverter.convertFromDtoToEntity(projectionDto.getMovie()));
        return projection;
    }
}
