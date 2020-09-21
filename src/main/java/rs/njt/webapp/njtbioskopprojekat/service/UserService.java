/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.VerificationToken;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public interface UserService {

    List<UserDto> getAll();

    public UserDto findByUsername(String username);
    
    public void updateUser(UserDto user);

    public UserDto registerNewUserAccount(UserDto userDto);

    public void createVerificationToken(UserDto user, String token);

    public VerificationToken getVerificationToken(String token);

    public void saveRegisteredUser(UserEntity user);

    public void saveAll(List<UserEntity> users);
}
