package com.boot.services.employee;

import com.boot.entities.employee.Employee;
import com.boot.repositories.employee.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmpData(){
       return employeeRepo.findAll();
    }

    public List<Employee> getEmpByName(String name){
        return employeeRepo.findByNameLike(name);
    }

    public List<Employee> getAllEmpById(Employee id){
        return employeeRepo.findAllById(id);
    }

    public void saveEmpData(Employee emp){
        employeeRepo.save(emp);
    }

    public Employee getEmpById(int id, Employee emp){

        Employee updateEmp = employeeRepo.findById(id).orElse(null);
        if(updateEmp != null){
            updateEmp.setName(emp.getName());
            employeeRepo.save(updateEmp);
        }
        return updateEmp;
    }

    public String deleteEmp(int id){

        Employee emp1 = employeeRepo.findById(id).orElse(null);
        if(emp1 == null) {
            return "No record Found";
        } else {
            employeeRepo.deleteById(id);
            return "Emp Deleted Successfully";
        }
    }
}
