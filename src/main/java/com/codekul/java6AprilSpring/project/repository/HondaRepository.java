package com.codekul.java6AprilSpring.project.repository;

import com.codekul.java6AprilSpring.project.domain.Honda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HondaRepository extends JpaRepository<Honda,Integer> {
}
