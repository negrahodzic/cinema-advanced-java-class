package rs.njt.webapp.njtbioskopprojekat.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rs.njt.webapp.njtbioskopprojekat.entity.Genre;
import rs.njt.webapp.njtbioskopprojekat.entity.Projection;
import rs.njt.webapp.njtbioskopprojekat.entity.Review;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-13T18:29:54")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> duration;
    public static volatile ListAttribute<Movie, Projection> projections;
    public static volatile ListAttribute<Movie, Review> reviews;
    public static volatile ListAttribute<Movie, Genre> genres;
    public static volatile SingularAttribute<Movie, String> description;
    public static volatile SingularAttribute<Movie, Long> movieId;
    public static volatile SingularAttribute<Movie, String> title;

}