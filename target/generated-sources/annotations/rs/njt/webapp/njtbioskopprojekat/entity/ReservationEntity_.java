package rs.njt.webapp.njtbioskopprojekat.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-22T22:28:21")
@StaticMetamodel(ReservationEntity.class)
public class ReservationEntity_ { 

    public static volatile SingularAttribute<ReservationEntity, Date> dateTimeOfReservation;
    public static volatile SingularAttribute<ReservationEntity, Integer> ticketQuantity;
    public static volatile SingularAttribute<ReservationEntity, Long> reservationId;
    public static volatile SingularAttribute<ReservationEntity, ProjectionEntity> projection;
    public static volatile SingularAttribute<ReservationEntity, UserEntity> user;

}