package com.ezycoding.sbca.employee;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Table(value = "EMPLOYEES")
public class Employee {
    @PrimaryKey
    private UUID id;

    @Column(value = "FIRST_NAME")
    private String firstName;

    @Column(value = "LAST_NAME")
    private String lastName;

    @Column(value = "HOME")
    private Address home;

    @Column(value = "AGE")
    private int age;

    @Column(value = "DOB")
    private Date dob;

    @Column(value = "CONTACTS")
    private List<String> contacts;

}

