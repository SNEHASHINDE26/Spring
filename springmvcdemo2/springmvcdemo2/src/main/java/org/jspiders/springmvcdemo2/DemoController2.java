package org.jspiders.springmvcdemo2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class DemoController2 {

    List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add((new Employee(1,"Pooja", 30000.00)));
        employeeList.add((new Employee(2,"Sneha",35000.00)));
        employeeList.add((new Employee(3,"Rohini",25000.00)));
        employeeList.add((new Employee(4,"Vaishali",28000.00)));
    }

    @GetMapping("/")
    public String getMessage() {
        return "welcome";
    }

    @GetMapping("/aboutUs")
    public String getEmployeeInfo(Model model) {

        model.addAttribute("records", employeeList);

        return "aboutUs";
    }

    @GetMapping("/addemployee")
    public String getemployeeForm(Model model) {
        model.addAttribute("Employee", new Employee());
        return "employeeForm";
    }
    //this method will add new object into list
    @PostMapping("/savename")
    public String insertProduct(Employee employee) {
        employeeList.add(employee);
        return "redirect:/aboutUs";
    }

}
