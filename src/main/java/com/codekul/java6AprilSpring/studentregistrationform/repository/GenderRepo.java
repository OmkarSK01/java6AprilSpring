package com.codekul.java6AprilSpring.studentregistrationform.repository;

import com.codekul.java6AprilSpring.studentregistrationform.domain.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
}