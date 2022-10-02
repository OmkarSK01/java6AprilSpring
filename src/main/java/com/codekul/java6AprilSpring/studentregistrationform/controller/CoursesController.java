package com.codekul.java6AprilSpring.studentregistrationform.controller;

import com.codekul.java6AprilSpring.studentregistrationform.domain.Courses;
import com.codekul.java6AprilSpring.studentregistrationform.repository.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired

    private CoursesRepo coursesRepo;

    @PostMapping("savecourse")
    public String savecourse(@RequestBody Courses courses){
        coursesRepo.save(courses);
        return "savecourse...";
    }

    @GetMapping("getcourse")
    public List<Courses> getcourses(){
        return coursesRepo.findAll();
    }

}