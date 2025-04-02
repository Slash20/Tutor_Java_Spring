package ru.kors.students.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kors.students.entity.Student;
import ru.kors.students.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmailStudent(@PathVariable String email) {
        return studentService.findByEmailStudent(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@PathVariable Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(String email) {
        studentService.deleteStudent(email);
    }

}
