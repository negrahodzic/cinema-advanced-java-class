package rs.njt.webapp.njtbioskopprojekat.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-13T18:29:54")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Long> projectionId;
    public static volatile SingularAttribute<Reservation, Date> dateTimeOfReservation;
    public static volatile SingularAttribute<Reservation, Integer> ticketQuantity;
    public static volatile SingularAttribute<Reservation, Long> reservationId;
    public static volatile SingularAttribute<Reservation, Long> userId;

}