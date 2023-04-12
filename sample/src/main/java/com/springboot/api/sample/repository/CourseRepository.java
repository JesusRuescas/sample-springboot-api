package com.springboot.api.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.api.sample.model.CourseModel;

public interface CourseRepository extends JpaRepository<CourseModel, Integer> {
    List<CourseModel> findByName(String name);

    List<CourseModel> findByNameContaining(String name);

    List<CourseModel> findByNameLike(String name);

    List<CourseModel> findByNameLikeIgnoreCase(String name);

    @Query(value = "Select c From CourseModel c")
    List<CourseModel> findByQueryName();

    @Query(value = "Select course_name From course where area = 'Test'", nativeQuery = true)
    List<String> findByQueryNamePeerArea();

    @Query(value = "Select course_name From course where area = :area", nativeQuery = true)
    List<String> findByQueryNamePeerSelectedArea(@Param("area") String area);

    @Query(value = "Select course_name From course where area = :area and course_name = :name", nativeQuery = true)
    List<String> findByQueryNamePeerSelectedArea(@Param("area") String area, @Param("name") String name);

    @Query(value = "Select course_name From course where area = ?1 and course_name = ?2", nativeQuery = true)
    List<String> findByQueryNamePeerAreaParam(String area, String name);
}
