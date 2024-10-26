package ru.krasheninnikov.TestSecurity2dbThemeleafApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.entity.Role;

public interface RoleRepository extends JpaRepository <Role, Long> {
    Role findByName(String name);
}
