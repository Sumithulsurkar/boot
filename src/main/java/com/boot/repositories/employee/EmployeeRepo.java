package com.boot.repositories.employee;

import com.boot.entities.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Integer> {

    List<Employee> findAllById(Employee id);

    @Query(value = "SELECT * FROM employee e WHERE e.name LIKE %?1%", nativeQuery = true)
    List<Employee> findByNameLike(String name);

    List<Employee> findByName(String name);

}
