package com.codekul.java6AprilSpring.onetomany.repository;


import com.codekul.java6AprilSpring.onetomany.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Long> {
}