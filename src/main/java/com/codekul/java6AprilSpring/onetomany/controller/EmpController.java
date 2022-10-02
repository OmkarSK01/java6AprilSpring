package com.codekul.java6AprilSpring.onetomany.controller;


import com.codekul.java6AprilSpring.onetomany.domain.Emp;
import com.codekul.java6AprilSpring.onetomany.repository.BankRepository;
import com.codekul.java6AprilSpring.onetomany.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//29july
@RestController
public class EmpController {
    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private BankRepository bankRepository;


    @PostMapping("saveEmp")
    public String saveEmp(@RequestBody Emp emp) {
        Emp emp1 = empRepository.save(emp);
        emp.getBank().forEach(s -> {
            s.setEmp(emp1);
            s.setIfsccode(s.getIfsccode());
            s.setAccountNumber(s.getAccountNumber());
            bankRepository.save(s);
        });
        return "emp save";
    }
}






/*{
        "name": "Suhas",
        "address": "Pune",
        "bank": [
        {
        "accontNumber": 42702049732,
        "ifscCode": "SBI3454"
        },
        {
        "accontNumber": 6478489,
        "ifscCode": "HDF5464"
        }
        ]
        }*/