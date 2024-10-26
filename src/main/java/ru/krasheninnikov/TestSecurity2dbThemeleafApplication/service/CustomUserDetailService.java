package ru.krasheninnikov.TestSecurity2dbThemeleafApplication.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.entity.User;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.repository.UserReposytory;

import java.util.stream.Collectors;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private UserReposytory userReposytory;
    public CustomUserDetailService(UserReposytory userReposytory) {
        this.userReposytory = userReposytory;
    }
    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws
            UsernameNotFoundException {
        User user = userReposytory.findByEmail(usernameOrEmail);
        if(user != null) {
            return new org.springframework.security.core.userdetails.User(user.getEmail()
            , user.getPassword(),
                    user.getRoles().stream()
                            .map((role) -> new SimpleGrantedAuthority(role.getName()))
                            .collect(Collectors.toList()));
        } else {
            throw new UsernameNotFoundException("Invalid email or password");
        }
    }
}
