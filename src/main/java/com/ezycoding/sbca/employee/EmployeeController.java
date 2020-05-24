package com.ezycoding.sbca.employee;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired private EmployeeRepository repository;

    @GetMapping(value = "/employees")
    public ResponseEntity<Object> employees(){
        List<Employee> emplList = repository.findAll();
        return ResponseEntity.ok(emplList);
    }

    @PostMapping(value = "employee")
    public ResponseEntity<Object> employee(@RequestBody Employee employee){
        employee.setId(Uuids.timeBased());
        repository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
