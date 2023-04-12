package com.springboot.api.sample.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.sample.dto.CourseDTO;
import com.springboot.api.sample.mapper.CourseMapper;
import com.springboot.api.sample.model.CourseModel;
import com.springboot.api.sample.services.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    CourseMapper courseMapper;

    @GetMapping
    public ResponseEntity<List<CourseModel>> getCourse() {
        List<CourseModel> list = courseService.getCourse();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/save")
    public ResponseEntity<CourseModel> saveCourse(@RequestBody CourseDTO dto) throws URISyntaxException {
        CourseModel newCourse = courseService.save(courseMapper.mapCourseDTOToCourse(dto));
        return ResponseEntity.created(new URI("/course/save/" + newCourse.getId())).body(newCourse);

    }

}
