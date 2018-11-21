package ru.sertok.spring.boot.exceptions;

public class UserException extends RuntimeException {
    public UserException() {
        super("Не найден пользователь!");
    }
}
