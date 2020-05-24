package com.ezycoding.sbca.employee;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

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

    @Column(value = "home")
    private Address home;

}

@Data
@UserDefinedType(value = "address")
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}