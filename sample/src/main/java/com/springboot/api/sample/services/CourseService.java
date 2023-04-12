package com.springboot.api.sample.services;

import java.util.List;

import com.springboot.api.sample.model.CourseModel;

public interface CourseService {
    public List<CourseModel> getCourse();
}
