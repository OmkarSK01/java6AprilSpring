package com.codekul.java6AprilSpring.ioc;


public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling vodafone");
    }

    @Override
    public void msg() {
        System.out.println("msg vodafone");

    }

}