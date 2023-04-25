package com.springboot.api.sample;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.api.sample.model.CourseModel;
import com.springboot.api.sample.services.CourseService;

@SpringBootTest
class SampleApplicationTests {

	@Autowired
	private CourseService courseService;

	@Test
	void contextLoads() {
		List<CourseModel> course = courseService.getCourse();

		System.out.println("Courses: ");
		System.out.println(course);
	}

}
