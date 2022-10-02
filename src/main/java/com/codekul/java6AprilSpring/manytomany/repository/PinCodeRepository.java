package com.codekul.java6AprilSpring.manytomany.repository;

import com.codekul.java6AprilSpring.manytomany.domain.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinCodeRepository extends JpaRepository<PinCode,Long> {
}

