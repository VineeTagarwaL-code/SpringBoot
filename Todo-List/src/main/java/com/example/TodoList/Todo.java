package com.example.TodoList;
import java.util.*;
public class Todo {

    long id;
    String task;
    boolean completed;

    static private List<Todo> allTask;
    public Todo(){
        this.id = -1;
        this.task="";
        this.completed=false;
    }
    public Todo(long id , String task , boolean completed){
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

    public long getId(){
        return this.id;
    }

    public String getTask(){
        return this.task;
    }

    public Boolean getCompletion(){
        return this.completed;
    }

    @Override
    public String toString(){
        return String.format("task [id=%s , taskName=%s , completed=%s]" , id , task , completed);
    }

}
