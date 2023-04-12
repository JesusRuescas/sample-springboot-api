package com.springboot.api.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.sample.model.CourseModel;
import com.springboot.api.sample.repository.CourseRepository;
import com.springboot.api.sample.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseModel> getCourse() {
        return courseRepository.findAll();
    }

    @Override
    public CourseModel save(CourseModel course) {
        return courseRepository.save(course);
    }

}
