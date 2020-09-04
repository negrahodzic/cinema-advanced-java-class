/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class RoomDto implements Serializable {

    private Long roomId;
    private int capacity;
    private String roomName;

    public RoomDto() {
    }

    public RoomDto(int capacity, String roomName) {
        this.capacity = capacity;
        this.roomName = roomName;
    }
    
    public RoomDto(Long roomId, int capacity, String roomName) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.roomName = roomName;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "RoomDto{" + "roomId=" + roomId + ", capacity=" + capacity + ", roomName=" + roomName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.roomId);
        hash = 59 * hash + this.capacity;
        hash = 59 * hash + Objects.hashCode(this.roomName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RoomDto other = (RoomDto) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        if (!Objects.equals(this.roomName, other.roomName)) {
            return false;
        }
        if (!Objects.equals(this.roomId, other.roomId)) {
            return false;
        }
        return true;
    }
    
    
}
