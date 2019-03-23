package ru.sertok.spring.boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.sertok.spring.boot.models.Role;
import ru.sertok.spring.boot.models.State;
import ru.sertok.spring.boot.models.User;
import ru.sertok.spring.boot.repositories.UsersRepository;
import ru.sertok.spring.boot.services.api.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(User user) {
        user.setRole(Role.USER);
        user.setState(State.ACTIVE);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        usersRepository.save(user);
    }
}
