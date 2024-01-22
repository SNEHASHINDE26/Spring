package org.jspiders.courseapi2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {

     private String batchCode;
     private String subject;
     private String faculty;
     private int totalClasses;
}
