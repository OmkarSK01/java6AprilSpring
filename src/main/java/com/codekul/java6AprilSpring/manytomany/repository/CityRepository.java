package com.codekul.java6AprilSpring.manytomany.repository;

import com.codekul.java6AprilSpring.manytomany.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository<City,Long> {
}