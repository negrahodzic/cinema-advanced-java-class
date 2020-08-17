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
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.UserRepository;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;

/**
 *
 * @author Negra
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAll() {
        List<UserEntity> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (UserEntity user : users) {
            userDtos.add(new UserDto(user.getUserId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(), user.getPassword()));
        }

        return userDtos;
    }

    @Override
    public UserDto findByUsername(String username) {
        UserEntity user = userRepository.findByUsername(username);

        if (user == null) {
            return null;
        }

        UserDto userDto = new UserDto(user.getUserId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(), user.getPassword());

        return userDto;
    }

}
