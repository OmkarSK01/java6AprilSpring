package com.codekul.java6AprilSpring.onetomany.repository;


import com.codekul.java6AprilSpring.onetomany.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}