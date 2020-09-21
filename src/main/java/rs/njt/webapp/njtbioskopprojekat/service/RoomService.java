/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.dto.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public interface RoomService {

    List<RoomDto> getAll();

    public void saveAll(List<RoomEntity> rooms);

}
