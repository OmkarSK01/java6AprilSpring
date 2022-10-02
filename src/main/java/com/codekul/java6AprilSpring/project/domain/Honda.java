package com.codekul.java6AprilSpring.project.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Honda {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

    private String name;


    public Honda() {
    }

    public Honda(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    @OneToMany(mappedBy = "honda", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Brands> brands;
}
