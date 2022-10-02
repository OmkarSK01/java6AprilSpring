package com.codekul.java6AprilSpring.project.controller;


import com.codekul.java6AprilSpring.project.domain.Honda;
import com.codekul.java6AprilSpring.project.repository.HondaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HondaController {

    @Autowired
    private HondaRepository hondaRepository;

    @PostMapping("saveHonda")
    public String saveHonda(@RequestBody Honda honda) {
        Honda honda1 = hondaRepository.save(honda);
        return "honda saved";
    }
}
