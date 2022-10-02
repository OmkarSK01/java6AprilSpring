package com.codekul.java6AprilSpring.ioc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.Subject;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("Jio calling");
    }

    @Override
    public void msg() {
        System.out.println("Jio msg");

    }
}





