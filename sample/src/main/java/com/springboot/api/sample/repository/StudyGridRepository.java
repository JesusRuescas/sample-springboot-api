package com.springboot.api.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.api.sample.model.StudyGridModel;

public interface StudyGridRepository extends JpaRepository<StudyGridModel, Integer> {

}
