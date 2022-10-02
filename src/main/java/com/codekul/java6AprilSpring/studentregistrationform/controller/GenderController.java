package com.codekul.java6AprilSpring.studentregistrationform.controller;

import com.codekul.java6AprilSpring.studentregistrationform.domain.Gender;
import com.codekul.java6AprilSpring.studentregistrationform.repository.GenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {

    @Autowired
    private GenderRepo genderRepo;


    @PostMapping("gendersave")
    public String savegender(@RequestBody Gender gender){
        genderRepo.save(gender);
        return "saveGender...";

    }
}