package com.springboot.api.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.api.sample.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
