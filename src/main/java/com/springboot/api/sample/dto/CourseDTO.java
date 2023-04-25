package com.springboot.api.sample.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class CourseDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    @NotBlank
    @NotEmpty(message = "The name is empty")
    @Size(min = 2, max = 30)
    private String name;

    @NotBlank
    @NotEmpty(message = "The name is empty")
    @Size(min = 2, max = 40)
    private String area;

    public CourseDTO() {
    }

    public CourseDTO(Integer id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
