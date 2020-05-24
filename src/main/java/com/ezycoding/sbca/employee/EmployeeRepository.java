package com.ezycoding.sbca.employee;

import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface EmployeeRepository extends CassandraRepository<Employee, UUID> {

}
