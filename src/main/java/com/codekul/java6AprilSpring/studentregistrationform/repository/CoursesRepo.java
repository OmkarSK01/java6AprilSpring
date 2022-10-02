package com.codekul.java6AprilSpring.studentregistrationform.repository;


import com.codekul.java6AprilSpring.studentregistrationform.domain.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Integer> {
}