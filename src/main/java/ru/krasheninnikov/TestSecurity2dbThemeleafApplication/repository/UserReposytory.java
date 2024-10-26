package ru.krasheninnikov.TestSecurity2dbThemeleafApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.entity.User;

public interface UserReposytory extends JpaRepository <User, Long> {
    User findByEmail (String email);
}
