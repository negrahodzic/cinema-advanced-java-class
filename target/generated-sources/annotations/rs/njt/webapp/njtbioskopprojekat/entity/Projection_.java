package rs.njt.webapp.njtbioskopprojekat.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.Reservation;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-13T18:29:54")
@StaticMetamodel(Projection.class)
public class Projection_ { 

    public static volatile SingularAttribute<Projection, Long> projectionId;
    public static volatile ListAttribute<Projection, Reservation> reservations;
    public static volatile SingularAttribute<Projection, String> edited;
    public static volatile SingularAttribute<Projection, Date> dateTimeOfProjection;
    public static volatile SingularAttribute<Projection, Long> movieId;
    public static volatile SingularAttribute<Projection, String> technology;
    public static volatile SingularAttribute<Projection, Long> roomId;

}