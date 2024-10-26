package ru.krasheninnikov.TestSecurity2dbThemeleafApplication.service;

import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.dto.UserDto;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
