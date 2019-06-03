package ru.sertok.spring.boot.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.sertok.spring.boot.exceptions.UserException;
import ru.sertok.spring.boot.repositories.UsersRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
       return usersRepository.findByName(name).map(UserDetailsImpl::new).orElseThrow(()->new UsernameNotFoundException(name)) ;
    }
}
