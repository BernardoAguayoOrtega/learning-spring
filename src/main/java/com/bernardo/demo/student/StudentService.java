package com.bernardo.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<StudentModel> getStudents() {
        return List.of(
                new StudentModel(
                        1L,
                        "Bernie",
                        21,
                        LocalDate.of(2000, Month.APRIL, 5),
                        "example@example.com"
                )
        );
    }
}
