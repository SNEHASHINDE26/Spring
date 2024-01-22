package org.jspiders.courseapi2.controller;

import org.jspiders.courseapi2.model.Course;
import org.jspiders.courseapi2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }

//    @GetMapping("/courses/{batchCode}")
//    public Course getCourseByBatchCode(@PathVariable(value = "batchCode")int batchCode){
//        return service.getCourseByBatchCode(String.valueOf(batchCode));
//    }

//    add new batch details
      @PostMapping("/addnew")
      public void addNewBatch(@RequestBody Course c){
            service.addNewBatch(c);
      }

//      delete specific batch details based on batch code
    @DeleteMapping("/delete/{batchCode}")
    public void deleteBatch(@PathVariable(value = "batchCode")String batchCode){
        service.deleteBatch(batchCode);
    }
}
