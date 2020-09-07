/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class represents projection room with attributes:
 * <ul>
 * <li>id</li>
 * <li>capacity</li>
 * <li>name</li>
 * </ul>
 * 
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class RoomDto implements Serializable {

    /**
     * room id
     */
    private Long roomId;
    /**
     * room capacity
     */
    private int capacity;
    /**
     * room name
     */
    private String roomName;

    /**
     * Constructor without parameters
     */
    public RoomDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param capacity room capacity
     * @param roomName room name
     */
    public RoomDto(int capacity, String roomName) {
        this.capacity = capacity;
        this.roomName = roomName;
    }
    
    /**
     * Constructor with parameters
     *
     * @param roomId room id
     * @param capacity room capacity
     * @param roomName room name
     */
    public RoomDto(Long roomId, int capacity, String roomName) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.roomName = roomName;
    }

    /**
     * Returns id of room.
     *
     * @return room id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * Sets id of room.
     *
     * @param roomId New value of room id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * Returns capacity of room.
     *
     * @return room capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity of room.
     *
     * @param capacity New value of room capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Returns name of room.
     *
     * @return room name
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets name of room.
     *
     * @param roomName New value of room name
     */
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
