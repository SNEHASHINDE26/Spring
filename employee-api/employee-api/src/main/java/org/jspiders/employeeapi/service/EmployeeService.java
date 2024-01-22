package org.jspiders.employeeapi.service;

import org.jspiders.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee>employeeList= new ArrayList<>();

    {
        employeeList.add(new Employee(101,"Rohini","HR",50000.00));
        employeeList.add(new Employee(102,"Vaishali","Doctor",55000.00));
        employeeList.add(new Employee(103,"Pooja","Doctor",55000.00));
        employeeList.add(new Employee(104,"Sneha","Manager",60000.00));

    }

     //display all employees
    public List<Employee>getAllEmployees(){
        return employeeList;
    }

    //display employee by id
    public Employee getEmployeeById(int id){
        for (int a=0;a<employeeList.size();a++){
           Employee e =employeeList.get(a);
           if(e.getEmployeeId()==id){
               return e;
           }
        }
        return null;
    }

    //add new employee
    public void addEmployee(Employee e){
        employeeList.add(e);
    }


     //update employee

    public void updateEmployee(int id,Employee e){
        for(int a=0;a<employeeList.size();a++){
           Employee emp=employeeList.get(a);
           if(emp.getEmployeeId()==id){
               employeeList.set(a,e);
           }
        }
    }

//  delete employee
    public void deleteEmployee(int id){
        for(int a=0;a<employeeList.size();a++){
            Employee emp=employeeList.get(a);
            if(emp.getEmployeeId()==id){
                employeeList.remove(a);
            }
        }
    }
}
