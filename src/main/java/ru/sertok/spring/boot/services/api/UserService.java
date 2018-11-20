package ru.sertok.spring.boot.services.api;

import ru.sertok.spring.boot.models.User;

public interface UserService {
    void signUp(User user);
}
