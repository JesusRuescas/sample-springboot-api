package com.springboot.api.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.api.sample.model.CourseModel;
import com.springboot.api.sample.repository.CourseRepository;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CourseModel course1 = new CourseModel("Bachelor of Information Systems", "Development");
		CourseModel course2 = new CourseModel("Technologist in systems analysis and development", "Development");
		CourseModel course3 = new CourseModel("Technical course in computer networks", "Infrastructure");
		CourseModel course4 = new CourseModel("Bachelor in Computer Engineering", "Data Science");
		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);
		courseRepository.save(course4);
	}
}
