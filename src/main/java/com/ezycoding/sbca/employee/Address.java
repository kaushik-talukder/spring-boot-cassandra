package com.ezycoding.sbca.employee;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Data
@UserDefinedType(value = "address")
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
