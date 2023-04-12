package com.springboot.api.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.api.sample.model.ClassModel;

public interface ClassRepository extends JpaRepository<ClassModel, Integer> {

}
