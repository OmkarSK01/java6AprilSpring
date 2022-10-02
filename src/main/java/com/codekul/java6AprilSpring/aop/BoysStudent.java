package com.codekul.java6AprilSpring.aop;

import org.springframework.stereotype.Component;

//@Component
//public class BoysStudent {
//    public void study(){
//        System.out.println("Boys Study");
//    }
//}

//29Aug


@Component
public class BoysStudent {

    public int studyBoy(int i){
        System.out.println("Boys Study");
        return 10;
    }
}