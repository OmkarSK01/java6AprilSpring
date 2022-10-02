package com.codekul.java6AprilSpring.studentregistrationform.controller;

import com.codekul.java6AprilSpring.studentregistrationform.domain.Student1;
import com.codekul.java6AprilSpring.studentregistrationform.repository.Student1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1Controller {
    @Autowired
    private Student1Repo student1Repo;

    @PostMapping("studsave1")
    public String savestud1(@RequestBody Student1 student1){
        student1Repo.save(student1);
        return "savestudent1...";
    }
}




/*localhost:8080/studsave1
{
        "firstname": "Omkar",
        "middlename": "Sanjay",
        "lastname": "Kharate",
        "streetaddress": "Pune",
        "streetaddressline2": "Kothrud Depot",
        "city": "Pune",
        "state": "Maharashtra",
        "zipcode": "431001",
        "email": "omkarkharate1@gmail.com",
        "mobileno": 9168845683,
        "dob":"2001-07-05"
        }
         */



/*localhost:8080/gendersave
{
        "gender":"male"
        }*/

/*localhost:8080/savecourse
{
        "courses":"Java Full Stack"
        }*/




/*mysql> select * from student1;
        +----+------+-------------------------+-----------+----------+------------+------------+-------------+---------------+--------------------+---------+------------+
        | id | city | email                   | firstname | lastname | middlename | mobileno   | state       | streetaddress | streetaddressline2 | zipcode | dob        |
        +----+------+-------------------------+-----------+----------+------------+------------+-------------+---------------+--------------------+---------+------------+
        |  1 | Pune | omkarkharate1@gmail.com | Omkar     | Kharate  | Sanjay     | 9168845683 | Maharashtra | Pune          | Kothrud Depot      |  431001 | 2001-07-05 |
        |  2 | Pune | omkarkharate1@gmail.com | Omkar     | Kharate  | Sanjay     | 9168845683 | Maharashtra | Pune          | Kothrud Depot      |  431001 | 2001-07-05 |
        +----+------+-------------------------+-----------+----------+------------+------------+-------------+---------------+--------------------+---------+------------+
        2 rows in set (0.00 sec)

        mysql> select * from gender;
        +----+--------+
        | id | gender |
        +----+--------+
        |  1 | male   |
        +----+--------+
        1 row in set (0.00 sec)

        mysql> select * from courses;
        +----+-----------------+
        | id | courses         |
        +----+-----------------+
        |  1 | Java Full Stack |
        +----+-----------------+ */