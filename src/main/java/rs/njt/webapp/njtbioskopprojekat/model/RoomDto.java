/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;

/**
 *
 * @author Negra
 */
public class RoomDto implements Serializable {

    private Long roomId;
    private int capacity;
    private String roomName;
//    private List<Projection> projections;

    public RoomDto() {
    }

    public RoomDto(Long roomId, int capacity, String roomName) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.roomName = roomName;
    }
}
