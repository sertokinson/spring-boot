package ru.sertok.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sertok.spring.boot.models.User;

import java.util.List;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<User,Long> {
   List<User> findAllById(Long id);
   Optional<User> findByName(String name);
}
