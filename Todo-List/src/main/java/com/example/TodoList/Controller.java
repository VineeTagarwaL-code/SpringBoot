package com.example.TodoList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;


@RestController
public class Controller {

    Todo object = new Todo();

public long getAllBooks(@RequestParam String id, @RequestParam String task, @RequestParam String status) {
    try {
        long parseId = Long.parseLong(id.replaceAll("L",""));
        boolean parseStatus = status.equalsIgnoreCase("true"); // Case-insensitive check

        System.out.println("ID: " + parseId + " Task: " + task + " Status: " + parseStatus);
        return parseId;
    } catch (NumberFormatException e) {
        return -1;
    }
}


}
