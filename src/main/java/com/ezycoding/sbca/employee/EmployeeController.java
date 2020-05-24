package com.ezycoding.sbca.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired private EmployeeRepository repository;

    @RequestMapping(value = "/employees")
    public ResponseEntity<Object> employees(){
        List<Employee> emplList = repository.findAll();
        return ResponseEntity.ok(emplList);
    }
}
