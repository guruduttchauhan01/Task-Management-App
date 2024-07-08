package com.guru.Task_Management_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.guru.Task_Management_App.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

