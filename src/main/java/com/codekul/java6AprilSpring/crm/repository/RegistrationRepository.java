package com.codekul.java6AprilSpring.crm.repository;


import com.codekul.java6AprilSpring.crm.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
    Optional<Registration> findByUserNameAndPassword(String userName, String password);
}