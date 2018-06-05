package com.example.employeeapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class EmployeeAppApi {

    @GetMapping("/names")
    public List<String> getNames() {
        return Stream
                .of("Jack", "Jane", "Bob", "Mary")
                .collect(Collectors.toList());
    }

}
