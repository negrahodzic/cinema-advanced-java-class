/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class UserConverter {

    public static UserDto convertFromEntityToDto(UserEntity user) {
        UserDto userDto = new UserDto(user.getUserId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(), user.getPassword());
        return userDto;
    }

    public static UserEntity convertFromDtoToEntity(UserDto userDto) {
        UserEntity user = new UserEntity(userDto.getUserId(), userDto.getFirstname(), userDto.getLastname(), userDto.getEmail(), userDto.getUsername(), userDto.getPassword());
        return user;
    }

}
