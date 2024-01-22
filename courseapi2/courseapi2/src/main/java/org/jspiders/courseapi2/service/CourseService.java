package org.jspiders.courseapi2.service;

import org.jspiders.courseapi2.model.Course;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class CourseService {

    List<Course> courseList= new ArrayList<>();

    {
        courseList.add(new Course("1ESA2","SPRING","Akshay Sir",12));
        courseList.add(new Course("1CCM22","JAVA","Isha Mam",64));

    }

    // 1.display all courses
    public List<Course>getAllCourses(){
        return courseList;
    }

    // 2.display courses details based on batch code

//    public Course getCourseByBatchCode(String batchCode){
//        for (int a=0;a<courseList.size();a++){
//            Course c =courseList.get(a);
//            if(c.getBatchCode()==batchCode){
//                return c;
//            }
//        }
//        return null;
//    }

//   3. get the name of all faculties.

//    public String  getAllFaculties(){
//
//        Set<String> allFaculties = new HashSet<>();
//        for(int i=0; i<courseList.size();i++){
//            Course course=courseList.get(i);
//            allFaculties.add(course.getFaculty());
//        }
//        return allFaculties.toString();
//    }

//   4. get all the batch codes of specific faculty.

//    public List<Object>getSpecificFaculty(String faculty){
//        List<Object>batch =new ArrayList<>();
//        for(int a=0; a<courseList.size();a++){
//            Course course=courseList.get(a);
//            if(course.getFaculty().equals(faculty)){
//                batch.add(course.getBatchCode());
//            }
//        }
//        return batch;
//    }

//   5. get all the batches where total classes more than 50.

//    public List<Object>getAllBatches(){
//        List<Object> allBatches =new ArrayList<>();
//        for (int a=0; a<courseList.size();a++){
//            Course course=courseList.get(a);
//            if(course.getTotalClasses()>50){
//                allBatches.add(course.getBatchCode());
//            }
//        }
//    }



//   6. add new batch details
    public void addNewBatch(Course c){
        courseList.add(c);
    }

    // 7. delete specific batch details based on batch code
    public void deleteBatch(String batchCode){
        for(int a=0;a<courseList.size();a++){
            Course co=courseList.get(a);
            if(co.getBatchCode()==batchCode){
                courseList.remove(a);
            }
        }
    }

}
