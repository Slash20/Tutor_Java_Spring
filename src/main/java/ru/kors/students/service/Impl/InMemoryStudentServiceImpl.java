package ru.kors.students.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.students.dao.InMemoryStudentDAO;
import ru.kors.students.entity.Student;
import ru.kors.students.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO studentDAO;

    @Override
    public List<Student> findAllStudents() {
        return studentDAO.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    public Student findByEmailStudent(String email) {
        return studentDAO.findByEmailStudent(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentDAO.deleteStudent(email);
    }
}
