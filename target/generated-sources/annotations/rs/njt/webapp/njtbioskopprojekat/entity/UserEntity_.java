package rs.njt.webapp.njtbioskopprojekat.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-17T14:03:24")
@StaticMetamodel(UserEntity.class)
public class UserEntity_ { 

    public static volatile SingularAttribute<UserEntity, String> firstname;
    public static volatile SingularAttribute<UserEntity, String> password;
    public static volatile ListAttribute<UserEntity, ReviewEntity> reviews;
    public static volatile SingularAttribute<UserEntity, Long> userId;
    public static volatile SingularAttribute<UserEntity, String> email;
    public static volatile SingularAttribute<UserEntity, String> lastname;
    public static volatile SingularAttribute<UserEntity, String> username;

}