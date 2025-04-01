package ru.kors.students.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private String email;
}
