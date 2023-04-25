package com.springboot.api.sample.course;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.springboot.api.sample.model.CourseModel;

@TestInstance(Lifecycle.PER_CLASS)
public class CourseTest {

    CourseModel course;

    @BeforeAll
    void starting() {
        System.out.println("Test started");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Testing Methods");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("Name of the course");
        course = new CourseModel();
    }

    @AfterAll
    void ending() {
        System.out.println("End of this test");

    }

    @Test
    void testSetName() {
        course.setName("Test name of the course");
        assertNotNull(course.getName());
    }

    @Test
    void testNonEmptyCourse() {
        CourseModel course = new CourseModel();
        assertNotNull(course);
    }

    @Test
    void testNonEmptyName() {
        CourseModel course = new CourseModel();

        assertNotNull(course.getName());
    }

    @Test
    void testNonEmptyArea() {
        CourseModel course = new CourseModel();
        assertNotNull(course.getArea());
    }

    @Test
    void testNonStudent() {
        CourseModel course = new CourseModel();
        Assertions.assertTrue(course.getStudents().isEmpty());
    }
}
