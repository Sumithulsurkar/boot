package com.boot.controllers.employee;

import com.boot.entities.employee.Employee;
import com.boot.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * localhost:8091/getEmpInfo/
     * @return It will return list of all the Emps
     */
   @GetMapping(value = "/getEmpInfo")
    public List<Employee> getEmpInfo(){
       return employeeService.getEmpData();
    }

    /**
     * No request body required
     * localhost:8091/getEmpByName/W
     * @param name - To passed in URL
     * @return Employee which contains letter W
     */
    @GetMapping(value = "/getEmpByName/{name}")
    public List<Employee> getEmpInfoByName(@PathVariable String name){
        return employeeService.getEmpByName(name);
    }

    /**
      { localhost:8091/saveEmpData
       "name": "Ankur",
       "department": "IT",
       "salary": 4000,
       "manager": "Rosi",
       "profile": "dev",
       "contact": "9978255891"
      }
     * @param emp
     * @return new EMP record will be inserted in the DB
     *///
   @PostMapping("/saveEmpData")
    public String saveEmployeeData(@RequestBody Employee emp){
       employeeService.saveEmpData(emp);
       return "Employee data has been saved successfully";
   }

    /**
     * localhost:8091/updateEmpData/12
     * @param id - To passed in URL
     * @param emp
     * @return IT will update the name of the EMP
     */
   @PutMapping("/updateEmpData/{id}")
    public String updateEmployeeData(@PathVariable int id, @RequestBody Employee emp){
       Employee  e = employeeService.getEmpById(id, emp);
       return e != null ? "Employee date updated successfully": "Updation Failed";
   }

    /**
     *
     * @param id
     * @return It will delete row with specific ID
     */
   @DeleteMapping("/deleteEmpData/{id}")
    public String delete(@PathVariable int id){
       return employeeService.deleteEmp(id);
   }
}


