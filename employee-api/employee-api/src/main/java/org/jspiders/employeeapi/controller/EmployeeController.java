package org.jspiders.employeeapi.controller;


import org.jspiders.employeeapi.model.Employee;
import org.jspiders.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

        @Autowired
        private EmployeeService service;

        @GetMapping("/employees")
        public List<Employee> getAllEmployees(){
            return service.getAllEmployees();
        }
        @GetMapping("/employees/{id}")
        public Employee getEmployeeById(@PathVariable(value = "id")int id){
                return service.getEmployeeById(id);
        }
//        add employee
        @PostMapping("/employees")
        public void addEmployee(@RequestBody Employee e){
                service.addEmployee(e);
        }

//          update employee
        @PutMapping("/employees/{id}")
        public void updateEmployee(@PathVariable(value = "id")int id,@RequestBody Employee e){
                service.updateEmployee(id,e);
        }

//        delete employee

        @DeleteMapping("/employees/{id}")
        public void updateEmployee(@PathVariable(value = "id")int id){
                service.deleteEmployee(id);
        }


}



