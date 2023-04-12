package com.springboot.api.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.api.sample.model.CourseModel;
import com.springboot.api.sample.repository.CourseRepository;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
