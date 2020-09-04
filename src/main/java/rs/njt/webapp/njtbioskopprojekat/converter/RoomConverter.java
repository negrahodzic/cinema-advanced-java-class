/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;
import rs.njt.webapp.njtbioskopprojekat.model.RoomDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class RoomConverter {

    public static RoomDto convertFromEntityToDto(RoomEntity room) {
        RoomDto roomDto = new RoomDto(room.getRoomId(), room.getCapacity(), room.getRoomName());
        return roomDto;
    }

    public static RoomEntity convertFromDtoToEntity(RoomDto roomDto) {
        RoomEntity room = new RoomEntity(roomDto.getRoomId(), roomDto.getCapacity(), roomDto.getRoomName());
        return room;
    }
}
