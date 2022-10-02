package com.codekul.java6AprilSpring.task.repositary;

import com.codekul.java6AprilSpring.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {

}
