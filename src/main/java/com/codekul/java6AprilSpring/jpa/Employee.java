package com.codekul.java6AprilSpring.jpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

//14 july
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //21july
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;
    private LocalDate dob;    //22july

    private Integer age;  //25 july

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }






    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}



/*mysql> use java6aprilspring;
        Database changed
        mysql> show tables;
        +----------------------------+
        | Tables_in_java6aprilspring |
        +----------------------------+
        | employee                   |
        +----------------------------+
        1 row in set (0.00 sec)

        mysql> desc employee;
        +---------+--------------+------+-----+---------+----------------+
        | Field   | Type         | Null | Key | Default | Extra          |
        +---------+--------------+------+-----+---------+----------------+
        | id      | int          | NO   | PRI | NULL    | auto_increment |
        | address | varchar(255) | YES  |     | NULL    |                |
        | name    | varchar(255) | YES  |     | NULL    |                |
        +---------+--------------+------+-----+---------+----------------+
        3 rows in set (0.01 sec) */