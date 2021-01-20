package com.bernardo.demo.student;

import java.time.LocalDate;

public class StudentClass {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public StudentClass() {}

    public StudentClass(Long id, String name, Integer age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public StudentClass(String name, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
}
