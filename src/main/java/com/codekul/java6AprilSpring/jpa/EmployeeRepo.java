package com.codekul.java6AprilSpring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

//public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
//
//}

//21july
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);
    Employee findByNameAndAddress(String name, String address);      //22july
   List<Employee> findByDobBetween(LocalDate firstDate, LocalDate secondDate);  //22july
    Employee findByNameAndAge(String name, Integer age);

    List<Employee> findByAgeLessThan(Integer age);
    List<Employee> findByAgeGreaterThanEqual(Integer age);
    List<Employee> findByDobAfter(LocalDate dob);
    Employee findByNameOrAddress(String name, String address);
    List<Employee> findByNameContaining(String name);
//    List<Employee> findByAge()NotNull
    Employee findDistinctByName(String name);
//   List<Employee> findByAgeNotNull(Integer age);


}