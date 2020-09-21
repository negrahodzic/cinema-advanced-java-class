/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.UserConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.UserRepository;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;
import rs.njt.webapp.njtbioskopprojekat.entity.VerificationToken;
import rs.njt.webapp.njtbioskopprojekat.repository.VerificationTokenRepository;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VerificationTokenRepository tokenRepository;

    @Override
    public List<UserDto> getAll() {
        List<UserEntity> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (UserEntity user : users) {
            userDtos.add(UserConverter.convertFromEntityToDto(user));
        }

        return userDtos;
    }

    @Override
    public UserDto findByUsername(String username) {
        UserEntity user = userRepository.findByUsername(username);

        if (user == null) {
            return null;
        }

        UserDto userDto = UserConverter.convertFromEntityToDto(user);

        return userDto;
    }

    @Override
    public void updateUser(UserDto userDto) {
        UserEntity userEntity = UserConverter.convertFromDtoToEntity(userDto);
        userRepository.saveAndFlush(userEntity);
    }

    @Override
    public UserDto registerNewUserAccount(UserDto userDto) {
        UserEntity userEntity = UserConverter.convertFromDtoToEntity(userDto);
        userRepository.saveAndFlush(userEntity);
        return UserConverter.convertFromEntityToDto(userRepository.findByUsername(userDto.getUsername()));
    }

    @Override
    public void createVerificationToken(UserDto user, String token) {
        VerificationToken myToken = new VerificationToken(token, UserConverter.convertFromDtoToEntity(user));
        tokenRepository.save(myToken);
    }

    @Override
    public VerificationToken getVerificationToken(String token) {
        return tokenRepository.findByToken(token);
    }

    @Override
    public void saveRegisteredUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public void saveAll(List<UserEntity> users) {
        userRepository.saveAll(users);
        userRepository.flush();
    }
    
}
