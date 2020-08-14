package rs.njt.webapp.njtbioskopprojekat.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-14T17:14:13")
@StaticMetamodel(MovieEntity.class)
public class MovieEntity_ { 

    public static volatile SingularAttribute<MovieEntity, Integer> duration;
    public static volatile SingularAttribute<MovieEntity, GenreEntity> genre;
    public static volatile SingularAttribute<MovieEntity, String> description;
    public static volatile SingularAttribute<MovieEntity, Long> movieId;
    public static volatile SingularAttribute<MovieEntity, String> title;

}