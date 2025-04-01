package ru.kors.students.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kors.students.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findByEmailStudent(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
