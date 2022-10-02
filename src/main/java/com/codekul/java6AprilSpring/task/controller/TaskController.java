package com.codekul.java6AprilSpring.task.controller;

import com.codekul.java6AprilSpring.task.domain.Task;
import com.codekul.java6AprilSpring.task.repositary.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;


    @PostMapping("savetask")
    public String savedate(@RequestBody Task task) {
        taskRepo.save(task);
        return "saveTask...";
    }

    @GetMapping("gettask")
    public List<Task> getEmployee() {
        return taskRepo.findAll();
    }

    @PutMapping("updatetask1")
    public String updatetask1(@RequestBody Task task) {
        Optional<Task> task1 = taskRepo.findById(task.getId());

        if (task1.isPresent()) {

//            task1.get().setStartDate(task.getStartDate());
//            task1.get().setEndDate(task.getEndDate());

            task1.get().setStartDate(task.getStartDate());
            task1.get().setEndDate(task.getEndDate());
//            task1.get().setstarttime(task.getstarttime());
//            task1.get().setendtime(task.getendtime());
            task1.get().setStarttime(task.getStarttime());
            task1.get().setEndtime(task.getEndtime());


            taskRepo.save(task1.get());
            return "record updated";
        } else {
//            System.out.println("Id not Found");
            return "id not found";
        }

    }
}
