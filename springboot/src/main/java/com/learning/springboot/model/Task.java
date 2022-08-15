package com.learning.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Task {
    private String task_id;
    private String task_name;
    private String status;

    public Task(){

    }
    public Task(String task_id, String task_name, String status) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.status=status;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
