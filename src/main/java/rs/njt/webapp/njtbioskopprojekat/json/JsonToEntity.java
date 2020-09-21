/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.converter.GenreConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.MovieConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.ProjectionConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.ReservationConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.RoomConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.UserConverter;
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.dto.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.dto.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.dto.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.dto.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;

/**
 *
 * @author Negra
 */
public class JsonToEntity {

    public static List<GenreEntity> jsonToGenre() {
        List<GenreEntity> genres = new ArrayList<>();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("===============1===============");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\genres.json")) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("===============2===============");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("==============================");

            Gson gson = new Gson();

            GenreDto[] genreDtos = gson.fromJson(reader, GenreDto[].class);

            for (GenreDto genre : genreDtos) {
                genres.add(GenreConverter.convertFromDtoToEntity(genre));
            }

        } catch (IOException e) {
            System.out.println("IOException jsonToGenre()");
        }

        return genres;
    }

    public static List<MovieEntity> jsonToMovie() {
        List<MovieEntity> movies = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\movies.json")) {
            Gson gson = new Gson();

            JsonObject[] jsonMovie = gson.fromJson(reader, JsonObject[].class);

            for (JsonObject jo : jsonMovie) {
                MovieDto mDto = new MovieDto();
                
                mDto.setMovieId(jo.getAsJsonPrimitive("movieId").getAsLong());
                mDto.setTitle(jo.getAsJsonPrimitive("title").getAsString());
                mDto.setDescription(jo.getAsJsonPrimitive("description").getAsString());
                mDto.setDuration(jo.getAsJsonPrimitive("duration").getAsInt());
                mDto.setImage(jo.getAsJsonPrimitive("image").getAsString());
                
                long genreId = jo.getAsJsonPrimitive("genreId").getAsLong();
                mDto.setGenre(new GenreDto(genreId,""));
                mDto.setReviews(null);

                movies.add(MovieConverter.convertFromDtoToEntity(mDto));

            }
        } catch (IOException e) {
            System.out.println("IOException jsonToMovie()");
        }

        return movies;
    }

    public static List<ProjectionEntity> jsonToProjection() {
        List<ProjectionEntity> projections = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\projections.json")) {
            Gson gson = new Gson();

            ProjectionDto[] projectionDtos = gson.fromJson(reader, ProjectionDto[].class
            );

            for (ProjectionDto projection : projectionDtos) {
                projections.add(ProjectionConverter.convertFromDtoToEntity(projection));
            }

        } catch (IOException e) {
            System.out.println("IOException jsonToProjection()");
        } catch (ParseException ex) {
            System.out.println("ParseException jsonToProjection()");
        }

        return projections;
    }

    public static List<RoomEntity> jsonToRoom() {
        List<RoomEntity> rooms = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\rooms.json")) {
            Gson gson = new Gson();

            RoomDto[] roomDtos = gson.fromJson(reader, RoomDto[].class
            );

            for (RoomDto room : roomDtos) {
                rooms.add(RoomConverter.convertFromDtoToEntity(room));
            }

        } catch (IOException e) {
            System.out.println("IOException jsonToRoom()");
        }

        return rooms;
    }

    public static List<ReservationEntity> jsonToReservation() {
        List<ReservationEntity> reservations = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\reservations.json")) {
            Gson gson = new Gson();

            ReservationDto[] reservationDtos = gson.fromJson(reader, ReservationDto[].class
            );

            for (ReservationDto reservation : reservationDtos) {
                reservations.add(ReservationConverter.convertFromDtoToEntity(reservation));
            }

        } catch (IOException e) {
            System.out.println("IOException jsonToReservation()");
        } catch (ParseException ex) {
            System.out.println("ParseException jsonToReservation()");
        }

        return reservations;
    }

    public static List<UserEntity> jsonToUser() {
        List<UserEntity> users = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Negra\\Documents\\NetBeansProjects\\NjtBioskopProjekat\\NjtBioskopProjekat\\src\\main\\resources\\json\\users.json")) {
            Gson gson = new Gson();

            UserDto[] userDtos = gson.fromJson(reader, UserDto[].class
            );

            for (UserDto user : userDtos) {
                users.add(UserConverter.convertFromDtoToEntity(user));
            }

        } catch (IOException e) {
            System.out.println("IOException jsonToReservation()");
        }

        return users;
    }

//    public String genreToJson() {
//        List<GenreDto> genres = genreService.getAll();
//        for (GenreDto genre : genres) {
//            System.out.println("Genre: " + genre.getGenreName());
//        }
//
//        try (FileWriter out = new FileWriter("genres.json")) {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//            gson.toJson(genres, out);
//        } catch (IOException e) {
//            throw e;
//        }
//        return "";
//    }
}
