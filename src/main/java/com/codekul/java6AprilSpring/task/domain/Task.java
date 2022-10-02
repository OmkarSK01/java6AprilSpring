package com.codekul.java6AprilSpring.task.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate StartDate;

    private LocalDate EndDate;


    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime startTime;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime endTime;

    public LocalTime getStarttime() {
        return startTime;
    }

    public void setStarttime(LocalTime starttime) {
        this.startTime = starttime;
    }

    public LocalTime getEndtime() {
        return endTime;
    }

    public void setEndtime(LocalTime endtime) {
        this.endTime = endtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }


}