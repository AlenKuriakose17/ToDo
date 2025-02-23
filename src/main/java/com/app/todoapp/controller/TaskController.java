package com.app.todoapp.controller;


import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;

@Controller

public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
