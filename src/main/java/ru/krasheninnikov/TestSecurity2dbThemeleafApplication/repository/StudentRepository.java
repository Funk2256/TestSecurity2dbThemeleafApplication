package ru.krasheninnikov.TestSecurity2dbThemeleafApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.krasheninnikov.TestSecurity2dbThemeleafApplication.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
}
