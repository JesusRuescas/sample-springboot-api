package com.springboot.api.sample.mapper;

import org.springframework.stereotype.Service;

import com.springboot.api.sample.dto.CourseDTO;
import com.springboot.api.sample.model.CourseModel;

@Service
public class CourseMapper {

    public CourseModel mapCourseDTOToCourse(CourseDTO dto) {
        CourseModel course = new CourseModel(dto.getName(), dto.getArea());
        return course;
    }

}
