package org.jspiders.employeeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Employee {

        private int employeeId;
        private String employeetName;
        private String  employeeDesignation;
        private double employeeSalary;
    }

