package ru.kors.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kors.students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
