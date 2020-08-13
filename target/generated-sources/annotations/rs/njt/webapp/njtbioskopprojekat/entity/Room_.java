package rs.njt.webapp.njtbioskopprojekat.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.Projection;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-13T18:29:54")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile ListAttribute<Room, Projection> projections;
    public static volatile SingularAttribute<Room, Long> roomId;
    public static volatile SingularAttribute<Room, String> roomName;
    public static volatile SingularAttribute<Room, Integer> capacity;

}