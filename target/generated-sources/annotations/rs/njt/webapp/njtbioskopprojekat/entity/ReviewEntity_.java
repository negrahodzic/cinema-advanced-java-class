package rs.njt.webapp.njtbioskopprojekat.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-18T01:22:37")
@StaticMetamodel(ReviewEntity.class)
public class ReviewEntity_ { 

    public static volatile SingularAttribute<ReviewEntity, MovieEntity> movie;
    public static volatile SingularAttribute<ReviewEntity, Integer> grade;
    public static volatile SingularAttribute<ReviewEntity, String> comment;
    public static volatile SingularAttribute<ReviewEntity, Long> reviewId;
    public static volatile SingularAttribute<ReviewEntity, UserEntity> user;

}