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
import rs.njt.webapp.njtbioskopprojekat.converter.RoomConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.repository.RoomRepository;
import rs.njt.webapp.njtbioskopprojekat.service.RoomService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomDto> getAll() {
        List<RoomEntity> rooms = roomRepository.findAll();
        List<RoomDto> roomDtos = new ArrayList<>();

        for ( RoomEntity room : rooms) {                        
            roomDtos.add(RoomConverter.convertFromEntityToDto(room));
        }

        return roomDtos; 
    }
}
