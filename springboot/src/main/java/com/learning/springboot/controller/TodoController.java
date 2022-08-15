package com.learning.springboot.controller;

import com.learning.springboot.model.Task;
import com.learning.springboot.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoListService todoListService;
    @GetMapping("/alltasks")
    public List<Task> getallTasks(){
        return todoListService.retrieveAllTasks();
    }
    @GetMapping("/task/{id}")
    public Task getTaskById(@PathVariable("id") String id){
        return todoListService.getParticularTask(id);
    }
    @PostMapping("/add-task")
    public Task addnewTask(@RequestBody Task task){
        todoListService.addTask(task);
        return task;
    }
    @PutMapping("/task/{id}/update-status")
    public String updateTaskStatus(@PathVariable("id") String taskid,@RequestBody Task status){
        boolean b=todoListService.updateTaskStatus(taskid,status.getStatus());
        if(b==true){
        return "Task status updated successfully";}
        return "No such task is present";
    }
    @DeleteMapping("task/{id}/delete-task")
    public String deleteTask(@PathVariable("id") String taskid){
        todoListService.deleteTask(taskid);
        return "Deleted successfully";
    }
}
