package com.learning.springboot.services;

import com.learning.springboot.model.Task;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TodoListService {
    private static final List<Task> tasks_list=new ArrayList<>();
    static{
        Task t1=new Task("1","Brushing","Not Done");
        Task t2=new Task("2","Bathing","Not Done");
        Task t3=new Task("3","Eating","Not Done");
        tasks_list.add(t1);
        tasks_list.add(t2);
        tasks_list.add(t3);
    }
    public List<Task> retrieveAllTasks(){
        return tasks_list;
    }

    public Task getParticularTask(String id){
        return tasks_list.stream().filter(task -> task.getTask_id().equals(id)).findFirst().get();
    }
    public static void addTask(Task t){
        tasks_list.add(t);
    }
    public boolean updateTaskStatus(String id,String status){
        for (Task t:
             tasks_list) {
            if(t.getTask_id().equals(id)){
                t.setStatus(status);
                return true;
            }
        }
        return false;
    }

    public void deleteTask(String id){
        for (Task t:
             tasks_list) {
            if(t.getTask_id().equals(id)){
                tasks_list.remove(t);
                break;
            }
        }
    }
}
