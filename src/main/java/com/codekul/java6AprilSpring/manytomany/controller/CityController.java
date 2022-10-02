package com.codekul.java6AprilSpring.manytomany.controller;

import com.codekul.java6AprilSpring.manytomany.domain.City;
import com.codekul.java6AprilSpring.manytomany.domain.PinCode;
import com.codekul.java6AprilSpring.manytomany.repository.CityRepository;
import com.codekul.java6AprilSpring.manytomany.repository.PinCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private PinCodeRepository codeRepository;


    @PostMapping("savePin")
    public String savePinCode(@RequestBody PinCode pinCode) {
        codeRepository.save(pinCode);
        return "pin code saved";
    }

    @PostMapping("saveCity")
    public String saveCity(@RequestBody City city) {
        cityRepository.save(city);
        return "city saved";
    }




}



/*
{
    "city":"Pune",
    "cityCode":"Pn",
    "pinCodes":[
        {
            "id":1
        },
        {
            "id":2
        }
    ]
}
 */