package com.guru.Task_Management_App.controller;

import com.guru.Task_Management_App.exception.*;
import com.guru.Task_Management_App.model.Task;
import com.guru.Task_Management_App.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

 @Autowired
 private TaskRepository taskRepository;

 @GetMapping
 public List<Task> getAllTasks() {
     return taskRepository.findAll();
 }

 @PostMapping
 public Task createTask(@RequestBody Task task) {
     return taskRepository.save(task);
 }

 @GetMapping("/{id}")
 public Task getTaskById(@PathVariable Long id) {
     return taskRepository.findById(id)
             .orElseThrow(() -> new ResourceNotFoundException("Task not found with id " + id));
 }

 @PutMapping("/{id}")
 public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
     Task task = taskRepository.findById(id)
             .orElseThrow(() -> new ResourceNotFoundException("Task not found with id " + id));
     task.setTitle(taskDetails.getTitle());
     task.setDescription(taskDetails.getDescription());
     task.setDueDate(taskDetails.getDueDate());
     return taskRepository.save(task);
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteTask(@PathVariable Long id) {
     Task task = taskRepository.findById(id)
             .orElseThrow(() -> new ResourceNotFoundException("Task not found with id " + id));
     taskRepository.delete(task);
     return ResponseEntity.ok().build();
 }
 
 @PatchMapping("/{id}/status")
 public Task updateTaskStatus(@PathVariable Long id, @RequestParam String status) {
     Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
     task.setStatus(status);
     return taskRepository.save(task);
 }
}
