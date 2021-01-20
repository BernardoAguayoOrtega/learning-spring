package com.bernardo.demo;

import com.bernardo.demo.student.StudentModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<StudentModel> hello() {
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
