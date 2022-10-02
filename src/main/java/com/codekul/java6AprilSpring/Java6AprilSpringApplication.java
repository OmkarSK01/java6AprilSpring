package com.codekul.java6AprilSpring;

import com.codekul.java6AprilSpring.aop.BoysStudent;

import com.codekul.java6AprilSpring.aop.GirlStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//7july
/*@SpringBootApplication
@RestController
public class Java6AprilSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(Java6AprilSpringApplication.class, args);
	}
	@GetMapping("hii")
	public String msg() {
		return "Hello Spring...";
	}

}*/


//8july-IOC
/*@SpringBootApplication
@RestController
public class Java6AprilSpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext  context = SpringApplication.run(Java6AprilSpringApplication.class, args);

		Vodafone vodafone = context.getBean(Vodafone.class);

		vodafone.msg();
		vodafone.calling();
	}
	@GetMapping("hii")
	public String hii() {
		return "Hello world ";
	}


}*/

//11july=DI
 /*@SpringBootApplication
@RestController
public class Java6AprilSpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext  context = SpringApplication.run(Java6AprilSpringApplication.class, args);

		Vodafone vodafone = context.getBean(Vodafone.class);

		vodafone.msg();           //he ioc ch thevl vrti pha because di is part of ioc.ioc ani di ektra vacha
		vodafone.calling();


		Student student = context.getBean(Student.class);
		student.callSubject();
	}
	@GetMapping("hii")
	public String hii() {

		return "Hello world ";
	}


}*/


//13july=DI
/*@SpringBootApplication
@RestController
public class Java6AprilSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Java6AprilSpringApplication.class, args);

        Vodafone vodafone = context.getBean(Vodafone.class);

        vodafone.msg();
        vodafone.calling();


		Student student = context.getBean(Student.class);
		student.callSubject();

	//	Student student1 = context.getBean(Student.class);
	//	student1.callSubject();;
    }

    @GetMapping("hii")
    public String hii(){
        return "Hello world";
    }


}*/



//26Aug-AOP



/*@SpringBootApplication
@RestController
public class Java6AprilSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Java6AprilSpringApplication.class, args);

//        Vodafone vodafone = context.getBean(Vodafone.class);
//
//        vodafone.msg();
//        vodafone.calling();

        BoysStudent boysStudent = context.getBean(BoysStudent.class);
        boysStudent.study();


        GirlStudent girlStudent = context.getBean(GirlStudent.class);
        girlStudent.study();

//        Student student = context.getBean(Student.class);
//        student.callSubject();

        //	Student student1 = context.getBean(Student.class);
        //	student1.callSubject();;
    }

    @GetMapping("hii")
    public String hii(){
        return "Hello world";
    }


}*/

//29 Aug
@SpringBootApplication
@RestController
public class Java6AprilSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Java6AprilSpringApplication.class, args);

//		Vodafone vodafone = context.getBean(Vodafone.class);
//
//		vodafone.data();
//		vodafone.calling();

        BoysStudent boysStudent = context.getBean(BoysStudent.class);
        boysStudent.studyBoy(2);

        GirlStudent girlStudent = context.getBean(GirlStudent.class);
        girlStudent.studyGirl();

//		Student student = context.getBean(Student.class);
//		student.callSubject();
//
//		Student student1 = context.getBean(Student.class);
//		student1.callSubject();;
    }

    @GetMapping("hii")
    public String hii(){
        return "Hello world";
    }


}














